package com.shiva.chatgptyoutube.models.request

data class ImageGenrateRequest(
    val n: Int,
    val prompt: String,
    val size: String
)