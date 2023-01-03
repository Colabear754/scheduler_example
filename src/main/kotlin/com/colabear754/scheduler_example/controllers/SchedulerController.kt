package com.colabear754.scheduler_example.controllers

import com.colabear754.scheduler_example.mappers.SchedulerMapper
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Component
@RestController
class SchedulerController(private val schedulerMapper: SchedulerMapper) {

    @Scheduled(cron = "0 * * * * *", zone = "Asia/Seoul")
    @GetMapping("/insert")
    fun scheduledInsert() = schedulerMapper.insertData()

    @GetMapping("/select")
    fun getData() = schedulerMapper.selectData()
}