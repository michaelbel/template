package org.michaelbel.template.features.compose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallTopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import com.google.accompanist.insets.systemBarsPadding
import org.michaelbel.template.R
import org.michaelbel.template.Screen
import org.michaelbel.template.features.main.model.ScreenData

@Composable
fun HomeScreen(
    navController: NavController
) {
    Scaffold(
        topBar = { Toolbar() }
    ) { Content(navController) }
}

@Composable
private fun Toolbar() {
    SmallTopAppBar(
        title = { Text(text = "Compose Design") },
        modifier = Modifier.systemBarsPadding()
    )
}

@Composable
private fun Content(
    navController: NavController
) {
    val listState: LazyListState = rememberLazyListState()

    val list = mapOf(
        ROUTE_BROWSER to R.string.title_browser,
        ROUTE_CLIPBOARD to R.string.title_clipboard,
        ROUTE_NETWORK_IMAGE to R.string.title_network_image,
        ROUTE_NOTIFICATIONS to R.string.title_notifications,
        ROUTE_SETTINGS_PANEL to R.string.title_settings_panel
    )

    val list2 = listOf(
        ScreenData(Screen.Config, bundleOf(), R.string.title_remote_config),
        ScreenData(Screen.Dialogs, bundleOf(), R.string.title_dialogs),
        ScreenData(Screen.InAppReview, bundleOf(), R.string.title_in_app_review),
        ScreenData(Screen.Intents, bundleOf(), R.string.title_intents),
        ScreenData(
            Screen.NavArgs,
            bundleOf("firstText" to "Some Text", "secondNumber" to 100),
            R.string.title_nav_args
        ),
        ScreenData(Screen.Toast, bundleOf(), R.string.title_toast)
    )

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        LazyColumn(
            state = listState,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 80.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(list.toList()) { (route, titleRes) ->
                ListItem(
                    text = { Text(text = stringResource(titleRes)) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            navController.navigate(route) {
                                navController.graph.startDestinationRoute?.let { route ->
                                    popUpTo(route) {
                                        saveState = true
                                    }
                                }
                                restoreState = true
                                launchSingleTop = true
                            }
                        }
                )
            }
        }
    }
}