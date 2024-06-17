package com.octo.rdo.enzo.mobday.repository.notification

interface NotificationRepository {
    fun sendNotification(request: NotificationRequest): NotificationResult
}

data class NotificationRequest(
    val titre: String,
    val description: String,
    val fcmToken: String,
)

enum class NotificationResult {
    SUCCESS, FAILURE
}
