package me.gonzalomejia.facebook.Component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ThumbUp
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LikeButton(
    modifier: Modifier = Modifier,
    isLiked: Boolean = false,
    onClick: () -> Unit = {}
) {
    Row(
        modifier = modifier
            .clickable { onClick() }
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = Icons.Outlined.ThumbUp,
            contentDescription = "Me gusta",
            tint = if (isLiked) MaterialTheme.colorScheme.primary else Color.Gray
        )
        Spacer(modifier = Modifier.width(6.dp))
        Text(
            text = "Me gusta",
            fontSize = 14.sp,
            color = if (isLiked) MaterialTheme.colorScheme.primary else Color.Gray
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LikeButtonPreview() {
    LikeButton()
}

@Preview(showBackground = true)
@Composable
fun LikeButtonPreviewBlue() {
    LikeButton(isLiked = true)
}
