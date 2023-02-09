package gita.uz.productapp.data.source.remote.response

import com.google.gson.annotations.SerializedName
import java.net.Inet4Address

data class DataGetAll(
    val id: Long,
    @SerializedName("product_type_id")
    val productTypeId: Long,
    @SerializedName("name_uz")
    val nameUz: String,
    val cost: Double,
    val address: String,
    @SerializedName("created_date")
    val createData: Long
)