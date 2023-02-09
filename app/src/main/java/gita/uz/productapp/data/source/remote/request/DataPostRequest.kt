package gita.uz.productapp.data.source.remote.request

import com.google.gson.annotations.SerializedName

data class DataPostRequest(
    @SerializedName("product_type_id")
    val productTypeId: Long,
    @SerializedName("name_uz")
    val NameUz: String,
    val cost: Double,
    val address: String,
    @SerializedName("created_date")
    val createdData: Long
)