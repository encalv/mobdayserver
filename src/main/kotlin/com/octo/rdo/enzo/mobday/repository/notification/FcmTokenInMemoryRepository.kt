package com.octo.rdo.enzo.mobday.repository.notification

import org.springframework.stereotype.Component

@Component
class FcmTokenInMemoryRepository : FcmTokenRepository {

    val tokens = mutableMapOf<String, String>()

    override fun saveFcmToken(userId: String, fcmToken: String) {
        tokens[userId] = fcmToken
    }

    override fun getFcmToken(userId: String): String? {
        return tokens[userId]
    }
}
