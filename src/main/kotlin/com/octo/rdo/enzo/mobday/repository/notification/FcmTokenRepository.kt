package com.octo.rdo.enzo.mobday.repository.notification

interface FcmTokenRepository {
    fun saveFcmToken(userId: String, fcmToken: String)
    fun getFcmToken(userId: String): String?
}
