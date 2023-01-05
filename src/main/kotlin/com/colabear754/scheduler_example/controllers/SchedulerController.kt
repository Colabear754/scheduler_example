package com.colabear754.scheduler_example.controllers

import com.colabear754.scheduler_example.mappers.SchedulerMapper
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SchedulerController(private val schedulerMapper: SchedulerMapper) {

    @GetMapping("/select")
    fun getData() = schedulerMapper.selectData()
}