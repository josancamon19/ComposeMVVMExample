package com.josancamon19.composemvvm.repository

import com.josancamon19.composemvvm.models.Recipe

interface RecipeRepository {
    suspend fun search(token: String, page: Int, query: String): List<Recipe>
    suspend fun get(token: String, id: Int): Recipe
}