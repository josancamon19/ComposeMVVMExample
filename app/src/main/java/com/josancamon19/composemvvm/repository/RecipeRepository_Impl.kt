package com.josancamon19.composemvvm.repository

import com.josancamon19.composemvvm.models.Recipe
import com.josancamon19.composemvvm.network.RecipeService

class RecipeRepository_Impl(private val recipeService: RecipeService) : RecipeRepository {
    override suspend fun search(token: String, page: Int, query: String): List<Recipe> {
        return recipeService.search(token = token, page = page, query = query).results
    }

    override suspend fun get(token: String, id: Int): Recipe {
        return recipeService.get(token = token, id = id)
    }
}