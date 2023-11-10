package com.pedro.hernandez.poketinder202302.data.network

import com.pedro.hernandez.poketinder202302.data.model.PokemonListResponse
import retrofit2.Response
import retrofit2.http.GET

interface PokemonApi {
    @GET("?limit=20")
    suspend fun getPokemons(): Response<PokemonListResponse>
}
