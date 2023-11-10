package com.pedro.hernandez.poketinder202302.ui

import java.io.Serializable

data class User(
    val id: String,
    val name: String,
    val email: String,
    val password: String
): Serializable {
    fun getImage() = "https://graph.facebook.com/$id/picture?type=large&width=720&height=720"
}
