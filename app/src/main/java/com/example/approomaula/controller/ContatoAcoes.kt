package com.example.approomaula.controller

import com.example.approomaula.model.Contato

sealed interface ContatoAcoes{
    object CasdastrarContato: ContatoAcoes
    object VisualizarDialog: ContatoAcoes
    object OcultarDialog: ContatoAcoes

    data class Setnome(val nome: String): ContatoAcoes
    data class SetSobrenome(val sobrenome: String): ContatoAcoes
    data class SetTelefone(val telefone: String): ContatoAcoes
    data class SorterarContatos(val tipos: Tipos): ContatoAcoes
    data class DeletarContato(val contato: com.example.approomaula.controller.Contato): ContatoAcoes
}