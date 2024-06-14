package com.octo.rdo.enzo.mobday.usecase

import com.octo.rdo.enzo.mobday.repository.notification.FcmTokenRepository
import org.springframework.stereotype.Component

@Component
@Suppress("unused")
class SaveFcmTokenUseCase(private val fcmTokenRepository: FcmTokenRepository) {
    fun execute(userId: String, fcmToken: String) {
        fcmTokenRepository.saveFcmToken(userId, fcmToken)
    }
}
