package com.yvkalume.threads

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yvkalume.threads.ui.theme.ThreadsTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    LazyColumn(modifier = Modifier.fillMaxSize().then(modifier)) {
        item {
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = null,
                    modifier = Modifier.size(35.dp)
                )
            }
        }
        item {
            PostItemType1(
                userName = "kalumeyves",
                avatar = R.drawable.user1,
                description = stringResource(id = R.string.post1),
                image = R.drawable.image1,
                time = "17m",
                modifier = Modifier.padding(
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp
                )
            )
        }
        item {
            PostReply()
        }
        items(dataList) {
            Divider(color = Color.LightGray, thickness = 0.6.dp)
            PostItemType2(
                userName = it.userName,
                avatar = it.avatar,
                description = stringResource(id = it.description),
                image = it.image,
                time = it.time
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    ThreadsTheme {
        HomeScreen()
    }
}