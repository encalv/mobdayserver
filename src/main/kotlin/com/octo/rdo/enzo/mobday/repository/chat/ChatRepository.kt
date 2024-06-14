package com.octo.rdo.enzo.mobday.repository.chat

import com.octo.rdo.enzo.mobday.domain.Conversation
import com.octo.rdo.enzo.mobday.domain.Message

interface ChatRepository {
    fun sendMessage(message: Message): Boolean
    fun getConversation(userId: String, consultantId: String): Conversation
}
