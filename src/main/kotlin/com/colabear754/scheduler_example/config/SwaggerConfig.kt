package com.colabear754.scheduler_example.config

import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SwaggerConfig {

    @Bean
    fun swaggerApi(): OpenAPI = OpenAPI()
        .components(Components())
        .info(Info()
            .title("스케줄러 테스트")
            .description("스케줄러를 테스트합니다.")
            .version("1.0.0"))
}

