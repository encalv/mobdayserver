package com.octo.rdo.enzo.mobday.controllers.notification

import com.octo.rdo.enzo.mobday.usecase.SaveFcmTokenUseCase
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@Suppress("unused")
class PushNotificationController(private val saveFcmTokenUseCase: SaveFcmTokenUseCase) {
    @RequestMapping("/saveFcmToken", method = [RequestMethod.POST])
    fun saveFcmToken(@RequestBody saveTokenRequest: SaveTokenRequest) {
        saveFcmTokenUseCase.execute(saveTokenRequest.userId, saveTokenRequest.fcmToken)
    }
}

data class SaveTokenRequest(
    val userId: String,
    val fcmToken: String,
)
