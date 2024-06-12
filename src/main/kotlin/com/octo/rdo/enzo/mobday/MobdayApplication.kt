package com.octo.rdo.enzo.mobday

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate


@SpringBootApplication(scanBasePackages = ["com.octo.rdo.enzo.mobday.controllers"])
class MobdayApplication {

    @Bean
    @Throws(Exception::class)
    fun restTemplate(): RestTemplate {
        return RestTemplate()
    }
}

fun main(args: Array<String>) {
    runApplication<MobdayApplication>(*args)
}
