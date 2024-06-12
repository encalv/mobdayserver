package com.octo.rdo.enzo.mobday.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.oauth2.jwt.JwtDecoder
import org.springframework.security.oauth2.jwt.JwtDecoders
import org.springframework.security.web.SecurityFilterChain
import org.springframework.security.config.annotation.web.invoke


//@Configuration
//@EnableWebSecurity
//class SecurityConfiguration

    /*@Bean
    @Throws(Exception::class)
    fun configure(http: HttpSecurity): SecurityFilterChain {
        http {
            authorizeHttpRequests {
                authorize("/authenticated/*", authenticated)
                authorize("/listeDeGens", permitAll)
            }
            csrf { disable() }
            oauth2ResourceServer { jwt {  } }
        }
        return http.build()
    }

    @Bean
    fun jwtDecoder(): JwtDecoder {
        return JwtDecoders.fromIssuerLocation("http://localhost:8080/realms/MobDay")
    }*/
}


/*
@Configuration
@EnableWebSecurity
internal class SecurityConfig(keycloakLogoutHandler: KeycloakLogoutHandler) {
    private val keycloakLogoutHandler: KeycloakLogoutHandler = keycloakLogoutHandler

    @Bean
    fun sessionRegistry(): SessionRegistry {
        return SessionRegistryImpl()
    }

    @Bean
    protected fun sessionAuthenticationStrategy(): SessionAuthenticationStrategy {
        return RegisterSessionAuthenticationStrategy(sessionRegistry())
    }

    @Bean
    fun httpSessionEventPublisher(): HttpSessionEventPublisher {
        return HttpSessionEventPublisher()
    }

    @Bean
    @Throws(Exception::class)
    fun resourceServerFilterChain(http: HttpSecurity): SecurityFilterChain {
        http.authorizeHttpRequests(Customizer { auth ->
            auth
                .requestMatchers(AntPathRequestMatcher("/listeDesGens"))
                .permitAll()
                .anyRequest()
                .authenticated()
        })
        http.oauth2ResourceServer { oauth2: OAuth2ResourceServerConfigurer<HttpSecurity?> ->
            oauth2
                .jwt(Customizer.withDefaults())
        }
        http.oauth2Login(Customizer.withDefaults())
            .logout { logout: LogoutConfigurer<HttpSecurity?> ->
                logout.addLogoutHandler(
                    keycloakLogoutHandler
                ).logoutSuccessUrl("/")
            }
        return http.build()
    }

    @Bean
    fun userAuthoritiesMapperForKeycloak(): GrantedAuthoritiesMapper {
        return GrantedAuthoritiesMapper { authorities: Collection<GrantedAuthority> ->
            val mappedAuthorities: MutableSet<GrantedAuthority> =
                HashSet()
            val authority = authorities.iterator().next()
            val isOidc = authority is OidcUserAuthority

            if (isOidc) {
                val oidcUserAuthority = authority as OidcUserAuthority
                val userInfo = oidcUserAuthority.userInfo

                // Tokens can be configured to return roles under
                // Groups or REALM ACCESS hence have to check both
                if (userInfo.hasClaim(REALM_ACCESS_CLAIM)) {
                    val realmAccess =
                        userInfo.getClaimAsMap(REALM_ACCESS_CLAIM)
                    val roles =
                        realmAccess[ROLES_CLAIM] as Collection<String>?
                    mappedAuthorities.addAll(generateAuthoritiesFromClaim(roles))
                } else if (userInfo.hasClaim(GROUPS)) {
                    val roles = userInfo.getClaim<Any>(
                        GROUPS
                    ) as Collection<String>
                    mappedAuthorities.addAll(generateAuthoritiesFromClaim(roles))
                }
            } else {
                val oauth2UserAuthority = authority as OAuth2UserAuthority
                val userAttributes =
                    oauth2UserAuthority.attributes

                if (userAttributes.containsKey(REALM_ACCESS_CLAIM)) {
                    val realmAccess = userAttributes[REALM_ACCESS_CLAIM] as Map<String, Any>?
                    val roles =
                        realmAccess!![ROLES_CLAIM] as Collection<String>?
                    mappedAuthorities.addAll(generateAuthoritiesFromClaim(roles))
                }
            }
            mappedAuthorities
        }
    }

    fun generateAuthoritiesFromClaim(roles: Collection<String>?): Collection<GrantedAuthority> {
        return roles!!.stream().map { role: String ->
            SimpleGrantedAuthority(
                "ROLE_$role"
            )
        }.collect(
            Collectors.toList()
        )
    }

    companion object {
        private const val GROUPS = "groups"
        private const val REALM_ACCESS_CLAIM = "realm_access"
        private const val ROLES_CLAIM = "roles"
    }
}*/
*/