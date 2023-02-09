package gita.uz.productapp.data.source.remote.request

import com.google.gson.annotations.SerializedName

data class DataPutProduct(
    val id: Long,
    @SerializedName("product_type_id")
    val productTypeId: Long,
    @SerializedName("name_uz")
    val nameUz: String,
    val cost: Double,
    val address: String,
    @SerializedName("created_date")
    val createdData: Long,
)
