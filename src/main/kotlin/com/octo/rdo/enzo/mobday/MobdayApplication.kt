package com.octo.rdo.enzo.mobday

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.invoke
import org.springframework.security.oauth2.jwt.JwtDecoder
import org.springframework.security.oauth2.jwt.JwtDecoders
import org.springframework.security.web.SecurityFilterChain
import org.springframework.web.client.RestTemplate


@SpringBootApplication(scanBasePackages = ["com.octo.rdo.enzo.mobday"])
class MobdayApplication {

    @Bean
    @Throws(Exception::class)
    fun restTemplate(): RestTemplate {
        return RestTemplate()
    }

    @Bean
    @Throws(Exception::class)
    fun configure(http: HttpSecurity): SecurityFilterChain {
        http {
            authorizeHttpRequests {
                authorize("/authenticated/*", authenticated)
                authorize("/listeDesGens", permitAll)
                authorize("/rendezVous", permitAll)
                authorize("/rendezVous/*", permitAll)
                authorize("/message", permitAll)
                authorize("/conversation/*/*", permitAll)
                authorize("/saveFcmToken", permitAll)
            }
            csrf { disable() }
            oauth2ResourceServer { jwt { } }
        }
        return http.build()
    }

    @Bean
    fun jwtDecoder(): JwtDecoder {
        return JwtDecoders.fromIssuerLocation("http://localhost:8080/realms/MobDay")
    }
}

fun main(args: Array<String>) {
    FirebaseWrapper.initFirebase()
    runApplication<MobdayApplication>(*args)
}
