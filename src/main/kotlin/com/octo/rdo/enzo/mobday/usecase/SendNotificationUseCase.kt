package com.octo.rdo.enzo.mobday.usecase

import com.octo.rdo.enzo.mobday.domain.Notification
import com.octo.rdo.enzo.mobday.repository.notification.FcmTokenRepository
import com.octo.rdo.enzo.mobday.repository.notification.NotificationRepository
import com.octo.rdo.enzo.mobday.repository.notification.NotificationRequest
import com.octo.rdo.enzo.mobday.repository.notification.NotificationResult
import org.springframework.stereotype.Component

@Component
@Suppress("unused")
class SendNotificationUseCase(
    private val notificationRepository: NotificationRepository,
    private val fcmTokenRepository: FcmTokenRepository
) {
    fun execute(userId: String, notification: Notification): NotificationResult {
        val fcmToken = fcmTokenRepository.getFcmToken(userId) ?: return NotificationResult.FAILURE
        return notificationRepository.sendNotification(
            NotificationRequest(
                notification.titre,
                notification.description,
                fcmToken
            )
        )
    }
}
