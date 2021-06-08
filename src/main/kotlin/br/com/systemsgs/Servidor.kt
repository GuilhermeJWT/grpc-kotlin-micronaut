package br.com.systemsgs

import com.google.protobuf.Timestamp
import io.grpc.ServerBuilder
import io.grpc.stub.StreamObserver
import java.time.LocalDateTime
import java.time.ZoneId

fun main() {

    val server = ServerBuilder.forPort(50051).addService(FuncionarioEndpoint()).build()
    server.start()
    server.awaitTermination()

}

class FuncionarioEndpoint : FuncionarioServiceGrpc.FuncionarioServiceImplBase(){

    override fun cadastrar(request: FuncionarioServiceOuterClass.FuncionarioRequest?, responseObserver: StreamObserver<FuncionarioServiceOuterClass.FuncionarioResponse>?){

        println(request!!)

        val instant = LocalDateTime.now().atZone(ZoneId.of("UTC")).toInstant()
        val nome = request?.nome
        val criadoEm = Timestamp.newBuilder().setSeconds(instant.epochSecond).setNanos(instant.nano).build()

        val response = FuncionarioServiceOuterClass.FuncionarioResponse.newBuilder()
            .setNome(nome)
            .setCriadoEm(criadoEm)
            .build()

        responseObserver?.onNext(response)
        responseObserver?.onCompleted()

    }

}