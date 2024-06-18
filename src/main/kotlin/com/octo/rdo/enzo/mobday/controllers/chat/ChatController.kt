package com.octo.rdo.enzo.mobday.controllers.chat

import com.octo.rdo.enzo.mobday.domain.Message
import com.octo.rdo.enzo.mobday.usecase.GetConversationUseCase
import com.octo.rdo.enzo.mobday.usecase.SendMessageUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
@Suppress("unused")
class ChatController(
    private val sendMessageUseCase: SendMessageUseCase,
    private val getConversationUseCase: GetConversationUseCase
) {
    @RequestMapping("/message", method = [RequestMethod.POST])
    fun sendMessage(@RequestBody messageRequest: MessageRequestJson) {
        sendMessageUseCase.execute(messageRequest.toMessage())
    }

    @RequestMapping("/conversation/{userId}/{consultantId}", method = [RequestMethod.GET])
    fun getConversation(@PathVariable userId: String, @PathVariable consultantId: String): ResponseEntity<*> {
        getConversationUseCase.execute(userId, consultantId)
            .let { return ResponseEntity.ok(it) }
    }
}

private fun MessageRequestJson.toMessage(): Message {
    return Message(
        senderId = this.senderId,
        receiverId = this.receiverId,
        content = this.content,
        date = LocalDateTime.now()
    )
}
