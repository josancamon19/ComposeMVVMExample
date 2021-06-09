package com.josancamon19.composemvvm.models

data class Response(
    val count: Int,
    val next: String,
    val previous: String,
    val results: List<Recipe>
)