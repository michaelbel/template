package org.michaelbel.template.features.intent

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.michaelbel.template.R
import org.michaelbel.template.ui.AppTheme

typealias OnButtonClick = (IntentItem) -> Unit

@Composable
fun IntentsScreen(onButtonClick: OnButtonClick) {
    AppTheme {
        Column {
            IntentsScreenTopBar()
            IntentsScreenBox(onButtonClick = onButtonClick)
        }
    }
}

@Composable
fun IntentsScreenTopBar(
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = { Text(text = stringResource(R.string.title_intents)) },
        modifier = modifier,
        elevation = 2.dp
    )
}

@Composable
fun IntentsScreenBox(
    modifier: Modifier = Modifier,
    onButtonClick: OnButtonClick
) {
    Box(modifier = modifier.fillMaxWidth(1F)) {
        LazyColumn {
            item {
                OutlinedButton(
                    onClick = { onButtonClick(IntentItem.Share) },
                    modifier = Modifier
                        .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 4.dp)
                ) { Text(text = stringResource(R.string.share_intent)) }
            }
            item {
                OutlinedButton(
                    onClick = { onButtonClick(IntentItem.Email) },
                    modifier = Modifier
                        .padding(start = 16.dp, top = 4.dp, end = 16.dp, bottom = 4.dp)
                ) { Text(text = stringResource(R.string.email_intent)) }
            }
            item {
                OutlinedButton(
                    onClick = { onButtonClick(IntentItem.GooglePlay) },
                    modifier = Modifier
                        .padding(start = 16.dp, top = 4.dp, end = 16.dp, bottom = 4.dp)
                ) { Text(text = stringResource(R.string.google_play)) }
            }
            item {
                OutlinedButton(
                    onClick = { onButtonClick(IntentItem.OpenTelegramChat) },
                    modifier = Modifier
                        .padding(start = 16.dp, top = 4.dp, end = 16.dp, bottom = 16.dp)
                ) { Text(text = stringResource(R.string.open_telegram_chat)) }
            }
        }
    }
}

@Preview(name = "default", uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(name = "dark theme", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun IntentScreenPreview() {
    IntentsScreen {}
}