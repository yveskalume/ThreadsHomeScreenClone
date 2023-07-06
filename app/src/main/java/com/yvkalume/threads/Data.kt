package com.yvkalume.threads

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Data(
    val userName: String,
    @DrawableRes val avatar: Int,
    @StringRes val description: Int,
    @DrawableRes val image: Int,
    val time: String
)

val dataList = listOf<Data>(
    Data("ignavia",R.drawable.user4,R.string.post2,R.drawable.image2,"1h"),
    Data("rosadunkle",R.drawable.user3,R.string.post3,R.drawable.image3,"1h"),
    Data("im_viviana",R.drawable.user2,R.string.post4,R.drawable.user3,"1h"),
    Data("kalumeyves",R.drawable.user1,R.string.post5,R.drawable.user4,"1h"),
    Data("rosadunkle",R.drawable.user3,R.string.post6,R.drawable.user2,"1h"),
)