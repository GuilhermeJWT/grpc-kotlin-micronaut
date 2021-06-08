package br.com.systemsgs

import io.grpc.ManagedChannelBuilder

fun main() {

    val channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build()
    val client = FuncionarioServiceGrpc.newBlockingStub(channel)

    val request = FuncionarioServiceOuterClass.FuncionarioRequest.newBuilder()
        .setNome("Guilherme Santos")
        .setCpf("000.000.000-00")
        .setSalario(1000.50)
        .setIdade(22)
        .setAtivo(true)
        .setCargo(FuncionarioServiceOuterClass.Cargo.DEV)
        .addEnderecos(
            FuncionarioServiceOuterClass.FuncionarioRequest.Endereco.newBuilder()
                .setLogradouro("Rua teste")
                .setCep("13770-000")
                .setComplemento("Casa")
                .build().toString())
        .build()

    val response = client.cadastrar(request)
    println(response)

}