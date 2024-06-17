package com.octo.rdo.enzo.mobday.usecase

import com.octo.rdo.enzo.mobday.domain.Conversation
import com.octo.rdo.enzo.mobday.repository.chat.ChatRepository
import org.springframework.stereotype.Component

@Component
@Suppress("unused")
class GetConversationUseCase(private val chatRepository: ChatRepository) {
    fun execute(userId: String, consultantId: String): Conversation {
        return chatRepository.getConversation(userId, consultantId)
    }
}
