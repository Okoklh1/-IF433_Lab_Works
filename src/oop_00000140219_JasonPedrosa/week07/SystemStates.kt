package oop_00000140219_JasonPedrosa.week07

enum class appState {
    STARTING, RUNNING, STOPPED
}

sealed class ApiResponse {
    data class Success(val data: String) : ApiResponse()
    data class Error(val message: String) : ApiResponse()
    object Loading : ApiResponse()
}
