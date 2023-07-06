package com.yvkalume.threads

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yvkalume.threads.ui.theme.ThreadsTheme

@Composable
fun PostItemType2(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
            .padding(16.dp)
            .height(IntrinsicSize.Max)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Avatar(modifier = Modifier.size(50.dp))
            Box(
                modifier = Modifier
                    .padding(vertical = 8.dp)
                    .weight(1f)
                    .width(2.dp)
                    .background(Color(0xFFAAAAAA))
            )

            Box(modifier = Modifier.size(width = 36.dp, height = 30.dp)) {
                CommentAvatar(
                    painter = painterResource(id = R.drawable.user3),
                    modifier = Modifier
                        .size(15.dp)
                        .align(Alignment.CenterStart)
                )
                CommentAvatar(
                    painter = painterResource(id = R.drawable.user3),
                    modifier = Modifier
                        .size(20.dp)
                        .align(Alignment.TopEnd)
                )

                CommentAvatar(
                    painter = painterResource(id = R.drawable.user3),
                    modifier = Modifier
                        .size(10.dp)
                        .align(Alignment.BottomCenter)
                )
            }
        }

        Column(modifier = Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.Top,
            ) {
                Text(text = "kalumeyves", fontWeight = FontWeight.Bold, fontSize = 14.sp)
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = "17m",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Light,
                    color = Color.Gray,
                )
                Spacer(modifier = Modifier.width(8.dp))
                Icon(
                    imageVector = Icons.Default.MoreHoriz,
                    contentDescription = null,
                    modifier = Modifier.size(18.dp)
                )
            }
            Text(text = stringResource(id = R.string.post1), fontSize = 14.sp)

            Image(
                painter = painterResource(id = R.drawable.image1),
                contentDescription = null,
                modifier = Modifier.clip(RoundedCornerShape(12.dp))
            )

            Spacer(modifier = Modifier.height(4.dp))

            Row(
                horizontalArrangement = Arrangement.spacedBy(20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_like),
                    contentDescription = null,
                    modifier = Modifier.size(18.dp),
                    tint = Color.Black
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_comment),
                    contentDescription = null,
                    modifier = Modifier.size(18.dp),
                    tint = Color.Black
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_repost),
                    contentDescription = null,
                    modifier = Modifier.size(18.dp),
                    tint = Color.Black
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_share),
                    contentDescription = null,
                    modifier = Modifier.size(18.dp),
                    tint = Color.Black
                )
            }

            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "43 replies • View likes",
                color = Color.Gray,
                fontSize = 14.sp,
                fontWeight = FontWeight.Light
            )
            Spacer(modifier = Modifier.height(0.2.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PostItemType2Preview() {
    ThreadsTheme {
        PostItemType2()
    }
}