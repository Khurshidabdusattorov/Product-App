package gita.uz.productapp.data.repository

import gita.uz.productapp.data.source.remote.request.DataPostRequest
import gita.uz.productapp.data.source.remote.response.DataGetAll
import gita.uz.productapp.data.source.remote.response.DataMessage
import gita.uz.productapp.utils.ResultData
import kotlinx.coroutines.flow.Flow

interface AppRepository {
    fun getAll(): Flow<ResultData<List<DataGetAll>>>
    fun add(data: DataPostRequest): Flow<ResultData<DataMessage>>
    fun update(data: DataPostRequest): Flow<ResultData<DataMessage>>
    fun delete(data: DataPostRequest): Flow<ResultData<DataMessage>>

}