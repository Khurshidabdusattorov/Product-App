package gita.uz.productapp.domain.repository.impl

import gita.uz.productapp.domain.repository.AppRepository
import gita.uz.productapp.data.source.remote.api.ProductApi
import gita.uz.productapp.data.source.remote.request.DataPostRequest
import gita.uz.productapp.data.source.remote.response.DataGetAll
import gita.uz.productapp.data.source.remote.response.DataMessage
import gita.uz.productapp.utils.ResultData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppRepositoryImpl @Inject constructor(
    private val api: ProductApi
) : AppRepository {
    override fun getAll(): Flow<ResultData<List<DataGetAll>>> = flow<ResultData<List<DataGetAll>>> {

    }.catch { }.flowOn(Dispatchers.IO)

    override fun add(data: DataPostRequest): Flow<ResultData<DataMessage>> = flow<ResultData<DataMessage>> {

    }.catch { }.flowOn(Dispatchers.IO)

    override fun update(data: DataPostRequest): Flow<ResultData<DataMessage>> = flow<ResultData<DataMessage>> {

    }.catch { }.flowOn(Dispatchers.IO)

    override fun delete(data: DataPostRequest): Flow<ResultData<DataMessage>> = flow<ResultData<DataMessage>> {

    }.catch { }.flowOn(Dispatchers.IO)
}