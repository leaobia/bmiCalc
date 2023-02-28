package br.senai.jandira.sp.bmicalc.model

import java.time.LocalDate

data class Client(

    var id: Int,
    var name: String,
    var birthDay: LocalDate) {

}