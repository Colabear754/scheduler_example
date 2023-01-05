package com.colabear754.scheduler_example.controllers

import com.colabear754.scheduler_example.mappers.SchedulerMapper
import io.swagger.v3.oas.annotations.Hidden
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Component
@RestController
@Hidden
class InsertController(private val schedulerMapper: SchedulerMapper) {
    @Scheduled(cron = "0 * * * * *", zone = "Asia/Seoul")
    fun scheduledInsert() = schedulerMapper.insertData()
}