package com.example.usandolistview

class Filme(val titulo: String, val classificacao: String, val ano: Int){

    override fun toString(): String {
        return "$titulo ($ano) --> $classificacao"
    }

}