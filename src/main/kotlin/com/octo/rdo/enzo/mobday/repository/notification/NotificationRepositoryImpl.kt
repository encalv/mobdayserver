package com.octo.rdo.enzo.mobday.repository.notification

import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.Message
import com.google.firebase.messaging.Notification
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Component
class NotificationRepositoryImpl : NotificationRepository {

    private val logger: Logger = LoggerFactory.getLogger(NotificationRepositoryImpl::class.java)

    override fun sendNotification(request: NotificationRequest): NotificationResult {
        return try {
            sendNotification(notificationMessage = createBaseMessage(request).build())
        } catch (e: IllegalArgumentException) {
            logError(e)
            NotificationResult.FAILURE
        }
    }

    private fun createBaseMessage(request: NotificationRequest): Message.Builder {
        return Message.builder()
            .setNotification(
                Notification.builder()
                    .setTitle(request.titre)
                    .setBody(request.description)
                    .build()
            )
            .setToken(request.fcmToken)
    }

    private fun sendNotification(notificationMessage: Message): NotificationResult {
        return try {
            val response = FirebaseMessaging.getInstance().send(notificationMessage)
            if (response.isNullOrEmpty())
                NotificationResult.FAILURE
            else NotificationResult.SUCCESS
        } catch (e: Exception) {
            logError(e)
            NotificationResult.FAILURE
        }
    }

    private fun logError(e: Exception) {
        logger.error("⚠️ Send notification error: ${e.message}")
    }
}
