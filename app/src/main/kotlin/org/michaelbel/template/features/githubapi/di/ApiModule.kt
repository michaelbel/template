package org.michaelbel.template.features.githubapi.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.michaelbel.core.ktx.createService
import org.michaelbel.template.features.githubapi.api.GithubService
import retrofit2.Converter
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {

    @Provides
    @GitHubBaseUrl
    fun provideBaseUrl(): String = "https://api.github.com/"

    @Provides
    @Singleton
    @GitHubOkhttp
    fun provideOkHttp(): OkHttpClient {
        val logger = HttpLoggingInterceptor()
        logger.level = HttpLoggingInterceptor.Level.BASIC
        return OkHttpClient.Builder()
            .addInterceptor(logger)
            .build()
    }

    @Provides
    @Singleton
    @GitHubRetrofit
    fun provideRetrofit(
        @GitHubBaseUrl baseUrl: String,
        converterFactory: Converter.Factory,
        @GitHubOkhttp okHttpClient: OkHttpClient
    ): Retrofit {
        val builder = Retrofit.Builder().apply {
            baseUrl(baseUrl)
            addConverterFactory(converterFactory)
            client(okHttpClient)
        }
        return builder.build()
    }

    @Provides
    @Singleton
    fun provideGitHubService(@GitHubRetrofit retrofit: Retrofit): GithubService {
        return createService(retrofit)
    }
}