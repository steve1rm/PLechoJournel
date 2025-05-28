package me.androidbox.core.presentation.designsystem.buttons

import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import me.androidbox.core.presentation.designsystem.theme.PLechoJournalTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun SecondaryButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier
            .height(44.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.onPrimaryContainer
        ),
        onClick = onClick
    ) {

        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.primary
        )
    }
}

@Preview
@Composable
fun SecondaryButtonPreview() {
    PLechoJournalTheme {
        SecondaryButton(
            modifier = Modifier,
            text = "Cancel",
            onClick = {}
        )
    }
}