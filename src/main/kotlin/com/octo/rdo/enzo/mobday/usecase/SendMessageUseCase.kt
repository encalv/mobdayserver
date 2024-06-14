package com.octo.rdo.enzo.mobday.usecase

import com.octo.rdo.enzo.mobday.domain.Message
import com.octo.rdo.enzo.mobday.repository.chat.ChatRepository
import org.springframework.stereotype.Component

@Component
@Suppress("unused")
class SendMessageUseCase(private val repository: ChatRepository) {
    fun sendMessage(message: Message) {
        repository.sendMessage(message)
    }
}
