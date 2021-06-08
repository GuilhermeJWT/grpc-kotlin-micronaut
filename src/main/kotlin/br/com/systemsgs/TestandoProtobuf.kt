package br.com.systemsgs

import br.com.systemsgs.FuncionarioServiceOuterClass.*
import java.io.FileOutputStream

fun main (){

    val request = FuncionarioRequest.newBuilder()
        .setNome("Guilherme Santos")
        .setCpf("000.000.000-00")
        .setSalario(1000.50)
        .setAtivo(true)
        .setCargo(Cargo.DEV)
        .addEnderecos(
            FuncionarioRequest.Endereco.newBuilder()
                .setLogradouro("Rua teste")
                .setCep("13770-000")
                .setComplemento("Casa")
                .build().toString())
                .build()

        println(request)

    request.writeTo(FileOutputStream("funcionario-request.bin"))

}