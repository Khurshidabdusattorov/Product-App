package gita.uz.productapp.data.source.remote.api

import gita.uz.productapp.data.source.remote.request.DataPostRequest
import gita.uz.productapp.data.source.remote.request.DataPutProduct
import gita.uz.productapp.data.source.remote.response.DataGetAll
import gita.uz.productapp.data.source.remote.response.DataMessage
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface ProductApi {
    @GET("product")
    suspend fun getAllProduct(): Response<List<DataGetAll>>

    @POST("product")
    suspend fun postProduct(@Body data: DataPostRequest): Response<DataMessage>

    @PUT("product")
    suspend fun putProduct(@Body data: DataPutProduct): Response<DataMessage>

    @DELETE("product")
    suspend fun deleteProduct(@Path("id") id: Int): Response<DataMessage>
}