package me.androidbox.core.presentation.designsystem.chips

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.vectorResource
import plechojournel.composeapp.generated.resources.Res
import plechojournel.composeapp.generated.resources.compose_multiplatform

@Composable
fun HashtagChip(
    text: String,
    modifier: Modifier = Modifier,
    onCloseClicked: () -> Unit,
    trailingIcon: (@Composable () -> Unit)? = null
) {
    Row(
        modifier = Modifier.height(32.dp),
        horizontalArrangement = Arrangement.spacedBy(2.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "#"
        )

        Text(
            text = text
        )

        Icon(
            modifier = Modifier.clickable(
                onClick = onCloseClicked
            ),
            imageVector = vectorResource(resource = Res.drawable.compose_multiplatform),
            contentDescription = "Close hashtag"
        )
    }
}