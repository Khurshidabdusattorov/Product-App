package gita.uz.productapp.utils

sealed class ResultData<T>(
    val data: T? = null,
    val message: String? = null
) {
    class Success<T>(data: T?) : ResultData<T>(data = data)
    class Failure<T>(message: String) : ResultData<T>(message = message)
}
