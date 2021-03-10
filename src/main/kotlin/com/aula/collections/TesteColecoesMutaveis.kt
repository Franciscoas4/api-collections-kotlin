package com.aula.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    println("------------LIST-----------------")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("------------add------------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("-----------remove----------------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("-------------SET-----------------")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }

    println("------------add------------------")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println("-----------remove----------------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }
}