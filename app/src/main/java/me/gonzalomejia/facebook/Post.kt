package me.gonzalomejia.facebook

data class Post(
    val id: String,
    val author: String,
    val time: String,
    val content: String,
    val comments: Int,
    val likes: Int,
    val liked: Boolean = false,
)
