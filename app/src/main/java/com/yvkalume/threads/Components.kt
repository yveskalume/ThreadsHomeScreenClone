package com.yvkalume.threads

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yvkalume.threads.ui.theme.ThreadsTheme

@Composable
fun Avatar(modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        Surface(modifier = Modifier.matchParentSize(), shape = CircleShape) {
            Image(
                painter = painterResource(id = R.drawable.user1),
                contentDescription = null
            )
        }

        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier
                .clip(CircleShape)
                .background(Color.Black)
                .size(20.dp)
                .padding(4.dp)
                .align(Alignment.BottomEnd)
        )
    }
}

@Composable
fun CommentAvatar(painter: Painter, modifier: Modifier = Modifier, border: BorderStroke? = null) {
    Surface(modifier = modifier, shape = CircleShape, border = border) {
        Image(
            painter = painter,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
}


@Preview
@Composable
fun AvatarPreview() {
    ThreadsTheme {
        Avatar(modifier = Modifier.size(50.dp))
    }
}