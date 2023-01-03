package com.colabear754.scheduler_example.dto

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDateTime

data class DataDTO(
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    val inserted_time: LocalDateTime,
    var content: String?
)
