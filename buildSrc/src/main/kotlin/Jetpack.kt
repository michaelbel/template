package org.michaelbel.template

/**
 * Jetpack & AndroidX
 *
 * https://d.android.com/jetpack/androidx/releases
 * https://d.android.com/google/play/installreferrer/library
 *
 * Not implemented:
 * https://d.android.com/jetpack/androidx/releases/databinding
 * https://d.android.com/jetpack/androidx/releases/games
 * https://d.android.com/jetpack/androidx/releases/legacy
 * https://d.android.com/jetpack/androidx/releases/localbroadcastmanager (Deprecated)
 * https://d.android.com/jetpack/androidx/releases/multidex (Pre-Android 5)
 * https://d.android.com/jetpack/androidx/releases/percentlayout (Deprecated)
 * https://d.android.com/jetpack/androidx/releases/sqlite
 * https://d.android.com/jetpack/androidx/releases/tvprovider
 * https://d.android.com/jetpack/androidx/releases/viewpager (Deprecated)
 */
object Jetpack {
    private const val ActivityVersion = "1.4.0"
    private const val AdsIdentifierVersion = "1.0.0-alpha04"
    private const val AnnotationVersion = "1.3.0"
    private const val AnnotationExperimentalVersion = "1.2.0"
    private const val AppCompatVersion = "1.4.1"
    private const val AppSearchVersion = "1.0.0-alpha04"
    private const val ArchCoreVersion = "2.1.0"
    private const val AsyncLayoutInflaterVersion = "1.0.0"
    private const val AutoFillVersion = "1.1.0"
    private const val BenchmarkVersion = "1.0.0"
    private const val BenchmarkMacroVersion = "1.1.0-beta01"
    private const val BiometricVersion = "1.2.0-alpha04"
    private const val BrowserVersion = "1.4.0"
    private const val CameraVersion = "1.0.2"
    private const val CameraVideoVersion = "1.1.0-alpha12"
    private const val CameraViewVersion = "1.0.0-alpha32"
    private const val CameraExtensionsVersion = "1.0.0-alpha32"
    private const val CardViewVersion = "1.0.0"
    private const val CollectionVersion = "1.2.0"
    private const val ComposeVersion = "1.1.0-rc01"
    private const val ComposeCompilerVersion = "1.1.0-rc02"
    private const val ConcurrentVersion = "1.1.0"
    private const val ConstraintLayoutVersion = "2.1.3"
    private const val ConstraintLayoutComposeVersion = "1.0.0"
    private const val ContentPagerVersion = "1.0.0"
    private const val CoordinatorLayoutVersion = "1.2.0"
    private const val CoreVersion = "1.7.0"
    private const val CoreAnimationVersion = "1.0.0-alpha02"
    private const val CoreGoogleShortcutsVersion = "1.0.0"
    private const val CoreRemoteViewsVersion = "1.0.0-alpha01"
    private const val CoreRoleVersion = "1.0.0"
    private const val CoreSplashScreenVersion = "1.0.0-beta01"
    private const val CursorAdapterVersion = "1.0.0"
    private const val CustomViewVersion = "1.1.0"
    private const val DataStoreVersion = "1.0.0"
    private const val DocumentFileVersion = "1.0.1"
    private const val DragAndDropVersion = "1.0.0-alpha02"
    private const val DrawerLayoutVersion = "1.1.1"
    private const val DynamicAnimationVersion = "1.1.0-alpha03"
    private const val EmojiVersion = "1.2.0-alpha03"
    private const val Emoji2Version = "1.1.0-alpha01"
    private const val EnterpriseVersion = "1.1.0"
    private const val ExifinterfaceVersion = "1.3.3"
    private const val FragmentVersion = "1.4.0"
    private const val GlanceVersion = "1.0.0-alpha01"
    private const val GridLayoutVersion = "1.0.0"
    private const val HealthVersion = "1.0.0-alpha03"
    private const val HeifWriterVersion = "1.1.0-alpha01"
    private const val HiltNavigationComposeVersion = "1.0.0-rc01"
    private const val HiltNavigationFragmentVersion = "1.0.0"
    private const val HiltWorkVersion = "1.0.0"
    private const val InterpolatorVersion = "1.0.0"
    private const val LifecycleVersion = "2.4.0"
    private const val LoaderVersion = "1.1.0"
    private const val Material3Version = "1.0.0-SNAPSHOT"
    private const val MaterialIconsVersion = "1.1.0-SNAPSHOT"
    private const val MediaVersion = "1.4.3"
    private const val Media2Version = "1.2.0"
    private const val Media3Version = "1.0.0-alpha01"
    private const val MediaRouterVersion = "1.2.5"
    private const val NavigationVersion = "2.3.5"
    private const val NavigationSafeArgsPluginVersion = "2.4.0"
    private const val NavigationComposeVersion = "2.4.0-rc01"
    private const val PagingVersion = "3.1.0"
    private const val PagingComposeVersion = "1.0.0-alpha14"
    private const val PaletteVersion = "1.0.0"
    private const val PreferenceVersion = "1.1.1"
    private const val PrintVersion = "1.0.0"
    private const val ProfileInstallerVersion = "1.2.0-alpha01"
    private const val RecommendationVersion = "1.0.0"
    private const val RecyclerViewVersion = "1.2.1"
    private const val RecyclerviewSelectionVersion = "1.1.0"
    private const val RemoteCallbackVersion = "1.0.0-alpha02"
    private const val ResourceInspectionVersion = "1.0.0"
    private const val RoomVersion = "2.4.1"
    private const val SavedStateVersion = "1.1.0"
    private const val SecurityCryptoVersion = "1.0.0"
    private const val SecurityIdentityCredentialVersion = "1.0.0-alpha03"
    private const val SecurityAppAuthenticatorVersion = "1.0.0-alpha02"
    private const val ShareTargetVersion = "1.2.0-rc01"
    private const val SliceVersion = "1.1.0-alpha02"
    private const val SlidingPanelLayoutVersion = "1.2.0-rc01"
    private const val StartupVersion = "1.1.0"
    private const val SwipeRefreshLayoutVersion = "1.1.0"
    private const val TestCoreVersion = "1.4.0"
    private const val TestEspressoVersion = "3.4.0"
    private const val TestExtJunitVersion = "1.1.3"
    private const val TestExtTruthVersion = "1.4.0"
    private const val TestJunitVersion = "1.1.3"
    private const val TestOrchestratorVersion = "1.4.1"
    private const val TestRulesVersion = "1.4.0"
    private const val TestRunnerVersion = "1.4.0"
    private const val TestUiAutomatorVersion = "2.2.0"
    private const val TextClassifierVersion = "1.0.0-alpha03"
    private const val TracingVersion = "1.1.0-beta01"
    private const val TransitionVersion = "1.4.1"
    private const val VectorDrawableVersion = "1.1.0"
    private const val VectorDrawableSeekableVersion = "1.0.0-alpha02"
    private const val VersionedParcelableVersion = "1.1.1"
    private const val ViewPager2Version = "1.0.0"
    private const val WebkitVersion = "1.4.0"
    private const val WindowVersion = "1.0.0-rc01"
    private const val WorkVersion = "2.7.1"

    const val Activity = "androidx.activity:activity-ktx:$ActivityVersion"
    const val ActivityCompose = "androidx.activity:activity-compose:$ActivityVersion"
    const val AdsIdentifier = "androidx.ads:ads-identifier:$AdsIdentifierVersion"
    const val Annotation = "androidx.annotation:annotation:$AnnotationVersion"
    const val AnnotationExperimental = "androidx.annotation:annotation-experimental:$AnnotationExperimentalVersion"
    const val AppCompat = "androidx.appcompat:appcompat:$AppCompatVersion"
    const val AppCompatResources = "androidx.appcompat:appcompat-resources:$AppCompatVersion"
    const val AppSearch = "androidx.appsearch:appsearch:$AppSearchVersion"
    const val AppSearchCompiler = "androidx.appsearch:appsearch-compiler:$AppSearchVersion"
    const val AppSearchLocalStorage = "androidx.appsearch:appsearch-local-storage:$AppSearchVersion"
    const val AppSearchPlatformStorage = "androidx.appsearch:appsearch-platform-storage:$AppSearchVersion"
    const val ArchCoreCommon = "androidx.arch.core:core-common:$ArchCoreVersion"
    const val ArchCoreRuntime = "androidx.arch.core:core-runtime:$ArchCoreVersion"
    const val ArchCoreTesting = "androidx.arch.core:core-testing:$ArchCoreVersion"
    const val AsyncLayoutInflater = "androidx.asynclayoutinflater:asynclayoutinflater:$AsyncLayoutInflaterVersion"
    const val AutoFill = "androidx.autofill:autofill:$AutoFillVersion"
    const val BenchmarkPlugin = "androidx.benchmark:benchmark-gradle-plugin:$BenchmarkVersion"
    const val BenchmarkJunit = "androidx.benchmark:benchmark-junit4:$BenchmarkVersion"
    const val BenchmarkMacro = "androidx.benchmark:benchmark-macro-junit4:$BenchmarkMacroVersion"
    const val Biometric = "androidx.biometric:biometric-ktx:$BiometricVersion"
    const val Browser = "androidx.browser:browser:$BrowserVersion"
    const val CameraCore = "androidx.camera:camera-core:$CameraVersion"
    const val CameraCamera2 = "androidx.camera:camera-camera2:$CameraVersion"
    const val CameraLifecycle = "androidx.camera:camera-lifecycle:$CameraVersion"
    const val CameraVideo = "androidx.camera:camera-video:$CameraVideoVersion"
    const val CameraView = "androidx.camera:camera-view:$CameraViewVersion"
    const val CameraExtensions = "androidx.camera:camera-extensions:$CameraExtensionsVersion"
    const val CardView = "androidx.cardview:cardview:$CardViewVersion"
    const val Collection = "androidx.collection:collection-ktx:$CollectionVersion"
    const val ComposeAnimation = "androidx.compose.animation:animation:$ComposeVersion"
    const val ComposeCompiler = "androidx.compose.compiler:compiler:$ComposeCompilerVersion"
    const val ComposeFoundation = "androidx.compose.foundation:foundation:$ComposeVersion"
    const val ComposeFoundationLayout = "androidx.compose.foundation:foundation-layout:$ComposeVersion"
    const val ComposeMaterialIconsCore = "androidx.compose.material:material-icons-core-samples:$MaterialIconsVersion"
    const val ComposeMaterialIconsExtended = "androidx.compose.material:material-icons-extended:$MaterialIconsVersion"
    const val ComposeMaterial3 = "androidx.compose.material3:material3:$Material3Version"
    const val ComposeMaterial3Samples = "androidx.compose.material3:material3-samples:$Material3Version"
    const val ComposeRuntime = "androidx.compose.runtime:runtime:$ComposeVersion"
    const val ComposeRuntimeLivedata = "androidx.compose.runtime:runtime-livedata:$ComposeVersion"
    const val ComposeUi = "androidx.compose.ui:ui:$ComposeVersion"
    const val ComposeUiTest = "androidx.compose.ui:ui-test-junit4:$ComposeVersion"
    const val ComposeUiTestManifest = "androidx.compose.ui:ui-test-manifest:$ComposeVersion"
    const val ComposeUiTooling = "androidx.compose.ui:ui-tooling:$ComposeVersion"
    const val ComposeUiViewBinding = "androidx.compose.ui:ui-viewbinding:$ComposeVersion"
    const val Concurrent = "androidx.concurrent:concurrent-futures-ktx:$ConcurrentVersion"
    const val ConstraintLayout = "androidx.constraintlayout:constraintlayout:$ConstraintLayoutVersion"
    const val ConstraintLayoutCompose = "androidx.constraintlayout:constraintlayout-compose:$ConstraintLayoutComposeVersion"
    const val ContentPager = "androidx.contentpager:contentpager:$ContentPagerVersion"
    const val CoordinatorLayout = "androidx.coordinatorlayout:coordinatorlayout:$CoordinatorLayoutVersion"
    const val Core = "androidx.core:core-ktx:$CoreVersion"
    const val CoreAnimation = "androidx.core:core-animation:$CoreAnimationVersion"
    const val CoreAnimationTesting = "androidx.core:core-animation-testing:$CoreAnimationVersion"
    const val CoreGoogleShortcuts = "androidx.core:core-google-shortcuts:$CoreGoogleShortcutsVersion"
    const val CoreRemoteViews = "androidx.core:core-remoteviews:$CoreRemoteViewsVersion"
    const val CoreRole = "androidx.core:core-role:$CoreRoleVersion"
    const val CoreSplashScreen = "androidx.core:core-splashscreen:$CoreSplashScreenVersion"
    const val CursorAdapter = "androidx.cursoradapter:cursoradapter:$CursorAdapterVersion"
    const val CustomView = "androidx.customview:customview:$CustomViewVersion"
    const val DataStoreCore = "androidx.datastore:datastore-core:$DataStoreVersion"
    const val DataStorePreferences = "androidx.datastore:datastore-preferences:$DataStoreVersion"
    const val DataStorePreferencesCore = "androidx.datastore:datastore-preferences-core:$DataStoreVersion"
    const val DocumentFile = "androidx.documentfile:documentfile:$DocumentFileVersion"
    const val DragAndDrop = "androidx.draganddrop:draganddrop:$DragAndDropVersion"
    const val DrawerLayout = "androidx.drawerlayout:drawerlayout:$DrawerLayoutVersion"
    const val DynamicAnimation = "androidx.dynamicanimation:dynamicanimation-ktx:$DynamicAnimationVersion"
    const val Emoji = "androidx.emoji:emoji:$EmojiVersion"
    const val EmojiAppcompat = "androidx.emoji:emoji-appcompat:$EmojiVersion"
    const val EmojiBundled = "androidx.emoji:emoji-bundled:$EmojiVersion"
    const val Emoji2 = "androidx.emoji2:emoji2:$Emoji2Version"
    const val Emoji2Views = "androidx.emoji2:emoji2-views:$Emoji2Version"
    const val Emoji2ViewsHelper = "androidx.emoji2:emoji2-views-helper:$Emoji2Version"
    const val EnterpriseFeedback = "androidx.enterprise:enterprise-feedback:$EnterpriseVersion"
    const val EnterpriseFeedbackTesting = "androidx.enterprise:enterprise-feedback-testing:$EnterpriseVersion"
    const val Exifinterface = "androidx.exifinterface:exifinterface:$ExifinterfaceVersion"
    const val Fragment = "androidx.fragment:fragment-ktx:$FragmentVersion"
    const val FragmentTesting = "androidx.fragment:fragment-testing:$FragmentVersion"
    const val Glance = "androidx.glance:glance:$GlanceVersion"
    const val GlanceAppWidget = "androidx.glance:glance-appwidget:$GlanceVersion"
    const val GridLayout = "androidx.gridlayout:gridlayout:$GridLayoutVersion"
    const val Health = "androidx.health:health-services-client:$HealthVersion"
    const val Heifwriter = "androidx.heifwriter:heifwriter:$HeifWriterVersion"
    const val HiltNavigationCompose = "androidx.hilt:hilt-navigation-compose:$HiltNavigationComposeVersion"
    const val HiltNavigationFragment = "androidx.hilt:hilt-navigation-fragment:$HiltNavigationFragmentVersion"
    const val HiltWork = "androidx.hilt:hilt-work:$HiltWorkVersion"
    const val Interpolator = "androidx.interpolator:interpolator:$InterpolatorVersion"
    const val LifecycleCommon = "androidx.lifecycle:lifecycle-common-java8:$LifecycleVersion"
    const val LifecycleLivedata = "androidx.lifecycle:lifecycle-livedata-ktx:$LifecycleVersion"
    const val LifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:$LifecycleVersion"
    const val LifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$LifecycleVersion"
    const val LifecycleViewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:$LifecycleVersion"
    const val LifecycleViewModelSavedState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:$LifecycleVersion"
    const val Loader = "androidx.loader:loader:$LoaderVersion"
    const val Media = "androidx.media:media:$MediaVersion"
    const val Media2Player = "androidx.media2:media2-player:$Media2Version"
    const val Media2Session = "androidx.media2:media2-session:$Media2Version"
    const val Media2Widget = "androidx.media2:media2-widget:$Media2Version"
    const val Media3Exoplayer = "androidx.media3:media3-exoplayer:$Media3Version"
    const val Media3ExoplayerDash = "androidx.media3:media3-exoplayer-dash:$Media3Version"
    const val Media3ExoplayerHls = "androidx.media3:media3-exoplayer-hls:$Media3Version"
    const val Media3ExoplayerRtsp = "androidx.media3:media3-exoplayer-rtsp:$Media3Version"
    const val Media3ExoplayerIma = "androidx.media3:media3-exoplayer-ima:$Media3Version"
    const val Media3DatasourceCronet = "androidx.media3:media3-datasource-cronet:$Media3Version"
    const val Media3DatasourceOkhttp = "androidx.media3:media3-datasource-okhttp:$Media3Version"
    const val Media3DatasourceRtmp = "androidx.media3:media3-datasource-rtmp:$Media3Version"
    const val Media3Ui = "androidx.media3:media3-ui:$Media3Version"
    const val Media3UiLeanback = "androidx.media3:media3-ui-leanback:$Media3Version"
    const val Media3Session = "androidx.media3:media3-session:$Media3Version"
    const val Media3Extractor = "androidx.media3:media3-extractor:$Media3Version"
    const val Media3Cast = "androidx.media3:media3-cast:$Media3Version"
    const val Media3ExoplayerWorkmanager = "androidx.media3:media3-exoplayer-workmanager:$Media3Version"
    const val Media3Transformer = "androidx.media3:media3-transformer:$Media3Version"
    const val Media3Utils = "androidx.media3:media3-test-utils:$Media3Version"
    const val Media3UtilsRobolectric = "androidx.media3:media3-test-utils-robolectric:$Media3Version"
    const val Media3Datastore = "androidx.media3:media3-database:$Media3Version"
    const val Media3Decoder = "androidx.media3:media3-decoder:$Media3Version"
    const val Media3Datasource = "androidx.media3:media3-datasource:$Media3Version"
    const val Media3Common = "androidx.media3:media3-common:$Media3Version"
    const val MediaRouter = "androidx.mediarouter:mediarouter:$MediaRouterVersion"
    const val NavigationSafeArgsPlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:$NavigationSafeArgsPluginVersion"
    const val NavigationCompose = "androidx.navigation:navigation-compose:$NavigationComposeVersion"
    const val NavigationDynamic = "androidx.navigation:navigation-dynamic-features-fragment:$NavigationVersion"
    const val NavigationFragment = "androidx.navigation:navigation-fragment-ktx:$NavigationVersion"
    const val NavigationTesting = "androidx.navigation:navigation-testing:$NavigationVersion"
    const val NavigationUi = "androidx.navigation:navigation-ui-ktx:$NavigationVersion"
    const val PagingRuntime = "androidx.paging:paging-runtime-ktx:$PagingVersion"
    const val PagingCompose = "androidx.paging:paging-compose:$PagingComposeVersion"
    const val Palette = "androidx.palette:palette-ktx:$PaletteVersion"
    const val Preference = "androidx.preference:preference-ktx:$PreferenceVersion"
    const val Print = "androidx.print:print:$PrintVersion"
    const val ProfileInstaller = "androidx.profileinstaller:profileinstaller:$ProfileInstallerVersion"
    const val Recommendation = "androidx.recommendation:recommendation:$RecommendationVersion"
    const val RecyclerView = "androidx.recyclerview:recyclerview:$RecyclerViewVersion"
    const val RecyclerViewSelection = "androidx.recyclerview:recyclerview-selection:$RecyclerviewSelectionVersion"
    const val RemoteCallback = "androidx.remotecallback:remotecallback:$RemoteCallbackVersion"
    const val RemoteCallbackProcessor = "androidx.remotecallback:remotecallback-processor:$RemoteCallbackVersion"
    const val ResourceInspection = "androidx.resourceinspection:resourceinspection-annotation:$ResourceInspectionVersion"
    const val Room = "androidx.room:room-ktx:$RoomVersion"
    const val RoomCompiler = "androidx.room:room-compiler:$RoomVersion"
    const val RoomPaging = "androidx.room:room-paging:$RoomVersion"
    const val RoomRuntime = "androidx.room:room-runtime:$RoomVersion"
    const val RoomTesting = "androidx.room:room-testing:$RoomVersion"
    const val SavedState = "androidx.savedstate:savedstate-ktx:$SavedStateVersion"
    const val SecurityCrypto = "androidx.security:security-crypto:$SecurityCryptoVersion"
    const val SecurityIdentityCredential = "androidx.security:security-identity-credential:$SecurityIdentityCredentialVersion"
    const val SecurityAppAuthenticator = "androidx.security:security-app-authenticator:$SecurityAppAuthenticatorVersion"
    const val ShareTarget = "androidx.sharetarget:sharetarget:$ShareTargetVersion"
    const val SliceBuilders = "androidx.slice:slice-builders-ktx:$SliceVersion"
    const val SliceCore = "androidx.slice:slice-core:$SliceVersion"
    const val SliceView = "androidx.slice:slice-view:$SliceVersion"
    const val SlidingPanelLayout = "androidx.slidingpanelayout:slidingpanelayout:$SlidingPanelLayoutVersion"
    const val Startup = "androidx.startup:startup-runtime:$StartupVersion"
    const val SwipeRefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:$SwipeRefreshLayoutVersion"
    const val TestCore = "androidx.test:core-ktx:$TestCoreVersion"
    const val TestEspressoAccessibility = "androidx.test.espresso:espresso-accessibility:$TestEspressoVersion"
    const val TestEspressoContrib = "androidx.test.espresso:espresso-contrib:$TestEspressoVersion"
    const val TestEspressoCore = "androidx.test:espresso:espresso-core:$TestEspressoVersion"
    const val TestEspressoIntents = "androidx.test.espresso:espresso-intents:$TestEspressoVersion"
    const val TestExtJunit = "androidx.test.ext:junit-ktx:$TestExtJunitVersion"
    const val TestExtTruth = "androidx.test.ext:truth:$TestExtTruthVersion"
    const val TestOrchestrator = "androidx.test:orchestrator:$TestOrchestratorVersion"
    const val TestRules = "androidx.test:rules:$TestRulesVersion"
    const val TestRunner = "androidx.test:runner:$TestRunnerVersion"
    const val TestUiAutomator = "androidx.test.uiautomator:uiautomator:$TestUiAutomatorVersion"
    const val TextClassifier = "androidx.textclassifier:textclassifier:$TextClassifierVersion"
    const val Tracing = "androidx.tracing:tracing-ktx:$TracingVersion"
    const val Transition = "androidx.transition:transition-ktx:$TransitionVersion"
    const val VectorDrawable = "androidx.vectordrawable:vectordrawable:$VectorDrawableVersion"
    const val VectorDrawableAnimated = "androidx.vectordrawable:vectordrawable-animated:$VectorDrawableVersion"
    const val VectorDrawableSeekable = "androidx.vectordrawable:vectordrawable-seekable:$VectorDrawableSeekableVersion"
    const val VersionedParcelable = "androidx.versionedparcelable:versionedparcelable:$VersionedParcelableVersion"
    const val ViewPager2 = "androidx.viewpager2:viewpager2:$ViewPager2Version"
    const val Webkit = "androidx.webkit:webkit:$WebkitVersion"
    const val Window = "androidx.window:window:$WindowVersion"
    const val WindowTesting = "androidx.window:window-testing:$WindowVersion"
    const val WorkRuntime = "androidx.work:work-runtime-ktx:$WorkVersion"
    const val WorkGcm = "androidx.work:work-gcm:$WorkVersion"
    const val WorkMultiprocess = "androidx.work:work-multiprocess:$WorkVersion"
    const val WorkTesting = "androidx.work:work-testing:$WorkVersion"
}