package com.example.prax15

class Message {
    var message: String? = null
    var senderId: String? = null
    var isReceived: Boolean = false // Индикатор о приходе сообщения

    constructor()

    constructor(message: String?, senderId: String?, isReceived: Boolean = false) {
        this.message = message
        this.senderId = senderId
        this.isReceived = isReceived
    }
}
