package com.yvkalume.threads

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.layout.wrapContentWidth
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yvkalume.threads.ui.theme.ThreadsTheme


@Composable
fun PostItemType1(
    userName: String,
    @DrawableRes avatar: Int,
    description: String,
    @DrawableRes image: Int,
    time: String,
    modifier: Modifier = Modifier
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
            .height(IntrinsicSize.Max)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Avatar(modifier = Modifier.size(40.dp), painter = painterResource(id = avatar))
            Box(
                modifier = Modifier
                    .padding(top = 8.dp)
                    .weight(1f)
                    .width(2.dp)
                    .background(Color(0xFFAAAAAA))
            )
            Image(
                painter = painterResource(id = R.drawable.thread_line_loop),
                contentDescription = null,
                contentScale = ContentScale.FillHeight,
                modifier = Modifier
                    .background(color = Color.Transparent)
                    .padding(end = 14.dp)
            )
        }

        Column(modifier = Modifier.weight(1f), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.Top,
            ) {
                Text(text = userName, fontWeight = FontWeight.Bold, fontSize = 14.sp)
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = time,
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
            Text(text = description, fontSize = 14.sp)

            Image(
                painter = painterResource(id = image),
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

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Box(
                    contentAlignment = Alignment.CenterStart,
                    modifier = Modifier.wrapContentWidth()
                ) {
                    CommentAvatar(
                        painter = painterResource(id = R.drawable.user2),
                        modifier = Modifier
                            .size(20.dp),
                        border = BorderStroke(1.dp, Color.White)
                    )
                    CommentAvatar(
                        painter = painterResource(id = R.drawable.user3),
                        modifier = Modifier
                            .padding(start = 13.dp)
                            .size(20.dp),
                        border = BorderStroke(1.dp, Color.White)
                    )
                }

                Text(
                    text = "48 replies • View likes",
                    color = Color.Gray,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Light
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PostItemType1Preview() {
    ThreadsTheme {
        PostItemType1(
            userName = "kalumeyves",
            avatar = R.drawable.user1,
            description = stringResource(id = R.string.post1),
            image = R.drawable.image1,
            time = "17h"
        )
    }
}