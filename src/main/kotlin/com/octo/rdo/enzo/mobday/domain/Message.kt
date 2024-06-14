package com.octo.rdo.enzo.mobday.domain

import java.time.LocalDate

data class Message(val senderId: String, val receiverId: String, val content: String, val date: LocalDate)
