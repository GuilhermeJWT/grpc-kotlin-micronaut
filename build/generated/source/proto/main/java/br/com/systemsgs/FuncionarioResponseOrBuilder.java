// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf.proto

package br.com.systemsgs;

public interface FuncionarioResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:br.com.systemsgs.FuncionarioResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string nome = 1;</code>
   * @return The nome.
   */
  java.lang.String getNome();
  /**
   * <code>string nome = 1;</code>
   * @return The bytes for nome.
   */
  com.google.protobuf.ByteString
      getNomeBytes();

  /**
   * <code>.google.protobuf.Timestamp criadoEm = 2;</code>
   * @return Whether the criadoEm field is set.
   */
  boolean hasCriadoEm();
  /**
   * <code>.google.protobuf.Timestamp criadoEm = 2;</code>
   * @return The criadoEm.
   */
  com.google.protobuf.Timestamp getCriadoEm();
  /**
   * <code>.google.protobuf.Timestamp criadoEm = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCriadoEmOrBuilder();
}