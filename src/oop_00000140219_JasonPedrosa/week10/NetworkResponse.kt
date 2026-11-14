package oop_00000140219_JasonPedrosa.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)