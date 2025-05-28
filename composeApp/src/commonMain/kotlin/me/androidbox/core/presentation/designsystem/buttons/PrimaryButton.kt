package me.androidbox.core.presentation.designsystem.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import me.androidbox.core.presentation.designsystem.theme.PLechoJournalTheme
import me.androidbox.core.presentation.designsystem.theme.buttonGradient
import org.jetbrains.compose.resources.vectorResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import plechojournel.composeapp.generated.resources.Res
import plechojournel.composeapp.generated.resources.compose_multiplatform

@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    text: String,
    enabled: Boolean,
    leadingIcon: (@Composable () -> Unit)? = null,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier
            .height(44.dp)
            .background(brush = if(enabled) {
                MaterialTheme.colorScheme.buttonGradient
            } else {
                SolidColor(MaterialTheme.colorScheme.surfaceVariant)
            },
                shape = CircleShape
            ),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent
        ),
        onClick = onClick
    ) {

        if(leadingIcon != null) {
            leadingIcon()

            Spacer(modifier = Modifier.width(6.dp))
        }

        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge,
            color = if(enabled) {
                MaterialTheme.colorScheme.onPrimary
            } else {
                MaterialTheme.colorScheme.outline
            }
        )
    }
}

@Preview
@Composable
fun PrimaryButtonPreview() {
    PLechoJournalTheme {
        PrimaryButton(
            modifier = Modifier,
            text = "Confirm",
            enabled = true,
            leadingIcon = {
                Icon(
                    imageVector = vectorResource(resource = Res.drawable.compose_multiplatform),
                    contentDescription = null
                )
            },
            onClick = {}
        )
    }
}