// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/struct.proto

package com.google.protobuf;

public interface ValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.protobuf.Value)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Represents a null value.
   * </pre>
   *
   * <code>.google.protobuf.NullValue null_value = 1;</code>
   * @return Whether the nullValue field is set.
   */
  boolean hasNullValue();
  /**
   * <pre>
   * Represents a null value.
   * </pre>
   *
   * <code>.google.protobuf.NullValue null_value = 1;</code>
   * @return The enum numeric value on the wire for nullValue.
   */
  int getNullValueValue();
  /**
   * <pre>
   * Represents a null value.
   * </pre>
   *
   * <code>.google.protobuf.NullValue null_value = 1;</code>
   * @return The nullValue.
   */
  com.google.protobuf.NullValue getNullValue();

  /**
   * <pre>
   * Represents a double value.
   * </pre>
   *
   * <code>double number_value = 2;</code>
   * @return Whether the numberValue field is set.
   */
  boolean hasNumberValue();
  /**
   * <pre>
   * Represents a double value.
   * </pre>
   *
   * <code>double number_value = 2;</code>
   * @return The numberValue.
   */
  double getNumberValue();

  /**
   * <pre>
   * Represents a string value.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   * @return Whether the stringValue field is set.
   */
  boolean hasStringValue();
  /**
   * <pre>
   * Represents a string value.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   * @return The stringValue.
   */
  java.lang.String getStringValue();
  /**
   * <pre>
   * Represents a string value.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   * @return The bytes for stringValue.
   */
  com.google.protobuf.ByteString
      getStringValueBytes();

  /**
   * <pre>
   * Represents a boolean value.
   * </pre>
   *
   * <code>bool bool_value = 4;</code>
   * @return Whether the boolValue field is set.
   */
  boolean hasBoolValue();
  /**
   * <pre>
   * Represents a boolean value.
   * </pre>
   *
   * <code>bool bool_value = 4;</code>
   * @return The boolValue.
   */
  boolean getBoolValue();

  /**
   * <pre>
   * Represents a structured value.
   * </pre>
   *
   * <code>.google.protobuf.Struct struct_value = 5;</code>
   * @return Whether the structValue field is set.
   */
  boolean hasStructValue();
  /**
   * <pre>
   * Represents a structured value.
   * </pre>
   *
   * <code>.google.protobuf.Struct struct_value = 5;</code>
   * @return The structValue.
   */
  com.google.protobuf.Struct getStructValue();

  /**
   * <pre>
   * Represents a repeated `Value`.
   * </pre>
   *
   * <code>.google.protobuf.ListValue list_value = 6;</code>
   * @return Whether the listValue field is set.
   */
  boolean hasListValue();
  /**
   * <pre>
   * Represents a repeated `Value`.
   * </pre>
   *
   * <code>.google.protobuf.ListValue list_value = 6;</code>
   * @return The listValue.
   */
  com.google.protobuf.ListValue getListValue();

  public com.google.protobuf.Value.KindCase getKindCase();
}
