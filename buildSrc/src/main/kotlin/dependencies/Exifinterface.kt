@file:Suppress("SpellCheckingInspection", "unused")

package org.michaelbel.template.dependencies

import org.gradle.api.artifacts.dsl.DependencyHandler
import org.michaelbel.template.extensions.implementation

/**
 * Exifinterface
 *
 * @see <a href="https://d.android.com/jetpack/androidx/releases/exifinterface">Exifinterface</a>
 */

private const val ExifinterfaceVersion = "1.3.4"

private const val Exifinterface = "androidx.exifinterface:exifinterface:$ExifinterfaceVersion"

fun DependencyHandler.implementationExifinterfaceDependencies() {
    implementation(Exifinterface)
}