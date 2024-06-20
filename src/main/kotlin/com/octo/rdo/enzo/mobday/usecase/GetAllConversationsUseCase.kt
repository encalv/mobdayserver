package com.octo.rdo.enzo.mobday.usecase

import com.octo.rdo.enzo.mobday.domain.Conversation
import com.octo.rdo.enzo.mobday.repository.chat.ChatRepository
import org.springframework.stereotype.Component

@Component
@Suppress("unused")
class GetAllConversationsUseCase(private val chatRepository: ChatRepository) {
    fun getConversations(): List<Conversation> {
        return chatRepository.getConversations()
    }
}

