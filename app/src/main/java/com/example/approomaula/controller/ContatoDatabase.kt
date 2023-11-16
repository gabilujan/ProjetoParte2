package com.example.approomaula.controller

import androidx.room.Database

class ContatoDatabase {
    @Database(
        entities = [Contato::class],
        version = 1
    )

    abstract class ContatoDatabase {
    }
}