package com.octo.rdo.enzo.mobday.repository.chat

import com.octo.rdo.enzo.mobday.domain.Conversation
import com.octo.rdo.enzo.mobday.domain.Message
import org.springframework.stereotype.Component

@Component
class ChatInMemoryRepository : ChatRepository {

    private val conversations = mutableListOf<Conversation>()

    override fun sendMessage(message: Message): Boolean {
        conversations.find { isConversationForMessage(it, message) }?.messages?.add(
            message
        )
            ?: conversations.add(Conversation(message.senderId, message.receiverId, mutableListOf(message)))
        return true
    }

    private fun isConversationForMessage(
        it: Conversation,
        message: Message
    ) = (it.userId == message.senderId && it.consultantId == message.receiverId) ||
            (it.userId == message.receiverId && it.consultantId == message.senderId)

    override fun getConversation(userId: String, consultantId: String): Conversation {
        return conversations.find { it.userId == userId && it.consultantId == consultantId } ?: Conversation(
            userId,
            consultantId,
            mutableListOf()
        )
    }

    override fun getConversations(): List<Conversation> {
        return conversations
    }
}
