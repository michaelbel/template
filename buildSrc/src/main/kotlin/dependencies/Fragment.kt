@file:Suppress("SpellCheckingInspection", "unused")

package org.michaelbel.template.dependencies

import org.gradle.api.artifacts.dsl.DependencyHandler
import org.michaelbel.template.extensions.api
import org.michaelbel.template.extensions.implementation

/**
 * Fragment
 *
 * Updated September 21, 2022
 * @see <a href="https://d.android.com/jetpack/androidx/releases/fragment">Fragment</a>
 */

private const val FragmentVersion = "1.5.3"

private const val Fragment = "androidx.fragment:fragment-ktx:$FragmentVersion"
private const val FragmentTesting = "androidx.fragment:fragment-testing:$FragmentVersion"

fun DependencyHandler.implementationFragmentDependencies() {
    implementation(Fragment)
}

fun DependencyHandler.apiFragmentDependencies() {
    api(Fragment)
}