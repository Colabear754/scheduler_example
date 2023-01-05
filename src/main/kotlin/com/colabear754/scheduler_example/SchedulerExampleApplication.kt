package com.colabear754.scheduler_example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@EnableScheduling
@SpringBootApplication
class SchedulerExampleApplication

fun main(args: Array<String>) {
    runApplication<SchedulerExampleApplication>(*args)
}
