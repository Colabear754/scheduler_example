package com.colabear754.scheduler_example.mappers

import com.colabear754.scheduler_example.dto.DataDTO
import org.apache.ibatis.annotations.Mapper

@Mapper
interface SchedulerMapper {
    fun insertData()
    fun selectData(): List<DataDTO?>
}