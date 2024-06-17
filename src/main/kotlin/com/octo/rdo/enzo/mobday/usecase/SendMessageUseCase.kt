package com.octo.rdo.enzo.mobday.usecase

import com.octo.rdo.enzo.mobday.domain.Message
import com.octo.rdo.enzo.mobday.domain.Notification
import com.octo.rdo.enzo.mobday.repository.chat.ChatRepository
import com.octo.rdo.enzo.mobday.repository.liste.ConsultantRepository
import org.springframework.stereotype.Component

@Component
@Suppress("unused")
class SendMessageUseCase(
    private val repository: ChatRepository,
    private val consultantRepository: ConsultantRepository,
    private val sendNotificationUseCase: SendNotificationUseCase
) {
    fun execute(message: Message) {
        val sender = consultantRepository.getConsultantById(message.senderId)
        if (sender != null) {
            sendNotificationUseCase.execute(
                userId = message.receiverId,
                notification = Notification("${sender.prenom} ${sender.nom}", "a envoyé un message")
            )
        }
        repository.sendMessage(message)
    }
}
