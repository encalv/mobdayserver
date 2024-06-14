package com.octo.rdo.enzo.mobday.controllers.chat

import com.fasterxml.jackson.annotation.JsonProperty

class MessageRequestJson(
    @JsonProperty("senderId")
    val senderId: String,

    @JsonProperty("receiverId")
    val receiverId: String,

    @JsonProperty("content")
    val content: String,
)
