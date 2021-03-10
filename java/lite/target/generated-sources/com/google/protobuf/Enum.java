// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/type.proto

package com.google.protobuf;

/**
 * <pre>
 * Enum type definition.
 * </pre>
 *
 * Protobuf type {@code google.protobuf.Enum}
 */
public  final class Enum extends
    com.google.protobuf.GeneratedMessageLite<
        Enum, Enum.Builder> implements
    // @@protoc_insertion_point(message_implements:google.protobuf.Enum)
    EnumOrBuilder {
  private Enum() {
    name_ = "";
    enumvalue_ = emptyProtobufList();
    options_ = emptyProtobufList();
  }
  public static final int NAME_FIELD_NUMBER = 1;
  private java.lang.String name_;
  /**
   * <pre>
   * Enum type name.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    return name_;
  }
  /**
   * <pre>
   * Enum type name.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(name_);
  }
  /**
   * <pre>
   * Enum type name.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @param value The name to set.
   */
  private void setName(
      java.lang.String value) {
    value.getClass();
  
    name_ = value;
  }
  /**
   * <pre>
   * Enum type name.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  private void clearName() {
    
    name_ = getDefaultInstance().getName();
  }
  /**
   * <pre>
   * Enum type name.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @param value The bytes for name to set.
   */
  private void setNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    name_ = value.toStringUtf8();
    
  }

  public static final int ENUMVALUE_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.EnumValue> enumvalue_;
  /**
   * <pre>
   * Enum value definitions.
   * </pre>
   *
   * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.EnumValue> getEnumvalueList() {
    return enumvalue_;
  }
  /**
   * <pre>
   * Enum value definitions.
   * </pre>
   *
   * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
   */
  public java.util.List<? extends com.google.protobuf.EnumValueOrBuilder> 
      getEnumvalueOrBuilderList() {
    return enumvalue_;
  }
  /**
   * <pre>
   * Enum value definitions.
   * </pre>
   *
   * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
   */
  @java.lang.Override
  public int getEnumvalueCount() {
    return enumvalue_.size();
  }
  /**
   * <pre>
   * Enum value definitions.
   * </pre>
   *
   * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.EnumValue getEnumvalue(int index) {
    return enumvalue_.get(index);
  }
  /**
   * <pre>
   * Enum value definitions.
   * </pre>
   *
   * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
   */
  public com.google.protobuf.EnumValueOrBuilder getEnumvalueOrBuilder(
      int index) {
    return enumvalue_.get(index);
  }
  private void ensureEnumvalueIsMutable() {
    com.google.protobuf.Internal.ProtobufList<com.google.protobuf.EnumValue> tmp = enumvalue_;
    if (!tmp.isModifiable()) {
      enumvalue_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <pre>
   * Enum value definitions.
   * </pre>
   *
   * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
   */
  private void setEnumvalue(
      int index, com.google.protobuf.EnumValue value) {
    value.getClass();
  ensureEnumvalueIsMutable();
    enumvalue_.set(index, value);
  }
  /**
   * <pre>
   * Enum value definitions.
   * </pre>
   *
   * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
   */
  private void addEnumvalue(com.google.protobuf.EnumValue value) {
    value.getClass();
  ensureEnumvalueIsMutable();
    enumvalue_.add(value);
  }
  /**
   * <pre>
   * Enum value definitions.
   * </pre>
   *
   * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
   */
  private void addEnumvalue(
      int index, com.google.protobuf.EnumValue value) {
    value.getClass();
  ensureEnumvalueIsMutable();
    enumvalue_.add(index, value);
  }
  /**
   * <pre>
   * Enum value definitions.
   * </pre>
   *
   * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
   */
  private void addAllEnumvalue(
      java.lang.Iterable<? extends com.google.protobuf.EnumValue> values) {
    ensureEnumvalueIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, enumvalue_);
  }
  /**
   * <pre>
   * Enum value definitions.
   * </pre>
   *
   * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
   */
  private void clearEnumvalue() {
    enumvalue_ = emptyProtobufList();
  }
  /**
   * <pre>
   * Enum value definitions.
   * </pre>
   *
   * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
   */
  private void removeEnumvalue(int index) {
    ensureEnumvalueIsMutable();
    enumvalue_.remove(index);
  }

  public static final int OPTIONS_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Option> options_;
  /**
   * <pre>
   * Protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 3;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.Option> getOptionsList() {
    return options_;
  }
  /**
   * <pre>
   * Protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 3;</code>
   */
  public java.util.List<? extends com.google.protobuf.OptionOrBuilder> 
      getOptionsOrBuilderList() {
    return options_;
  }
  /**
   * <pre>
   * Protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 3;</code>
   */
  @java.lang.Override
  public int getOptionsCount() {
    return options_.size();
  }
  /**
   * <pre>
   * Protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Option getOptions(int index) {
    return options_.get(index);
  }
  /**
   * <pre>
   * Protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 3;</code>
   */
  public com.google.protobuf.OptionOrBuilder getOptionsOrBuilder(
      int index) {
    return options_.get(index);
  }
  private void ensureOptionsIsMutable() {
    com.google.protobuf.Internal.ProtobufList<com.google.protobuf.Option> tmp = options_;
    if (!tmp.isModifiable()) {
      options_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <pre>
   * Protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 3;</code>
   */
  private void setOptions(
      int index, com.google.protobuf.Option value) {
    value.getClass();
  ensureOptionsIsMutable();
    options_.set(index, value);
  }
  /**
   * <pre>
   * Protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 3;</code>
   */
  private void addOptions(com.google.protobuf.Option value) {
    value.getClass();
  ensureOptionsIsMutable();
    options_.add(value);
  }
  /**
   * <pre>
   * Protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 3;</code>
   */
  private void addOptions(
      int index, com.google.protobuf.Option value) {
    value.getClass();
  ensureOptionsIsMutable();
    options_.add(index, value);
  }
  /**
   * <pre>
   * Protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 3;</code>
   */
  private void addAllOptions(
      java.lang.Iterable<? extends com.google.protobuf.Option> values) {
    ensureOptionsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, options_);
  }
  /**
   * <pre>
   * Protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 3;</code>
   */
  private void clearOptions() {
    options_ = emptyProtobufList();
  }
  /**
   * <pre>
   * Protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 3;</code>
   */
  private void removeOptions(int index) {
    ensureOptionsIsMutable();
    options_.remove(index);
  }

  public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
  private com.google.protobuf.SourceContext sourceContext_;
  /**
   * <pre>
   * The source context.
   * </pre>
   *
   * <code>.google.protobuf.SourceContext source_context = 4;</code>
   */
  @java.lang.Override
  public boolean hasSourceContext() {
    return sourceContext_ != null;
  }
  /**
   * <pre>
   * The source context.
   * </pre>
   *
   * <code>.google.protobuf.SourceContext source_context = 4;</code>
   */
  @java.lang.Override
  public com.google.protobuf.SourceContext getSourceContext() {
    return sourceContext_ == null ? com.google.protobuf.SourceContext.getDefaultInstance() : sourceContext_;
  }
  /**
   * <pre>
   * The source context.
   * </pre>
   *
   * <code>.google.protobuf.SourceContext source_context = 4;</code>
   */
  private void setSourceContext(com.google.protobuf.SourceContext value) {
    value.getClass();
  sourceContext_ = value;
    
    }
  /**
   * <pre>
   * The source context.
   * </pre>
   *
   * <code>.google.protobuf.SourceContext source_context = 4;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeSourceContext(com.google.protobuf.SourceContext value) {
    value.getClass();
  if (sourceContext_ != null &&
        sourceContext_ != com.google.protobuf.SourceContext.getDefaultInstance()) {
      sourceContext_ =
        com.google.protobuf.SourceContext.newBuilder(sourceContext_).mergeFrom(value).buildPartial();
    } else {
      sourceContext_ = value;
    }
    
  }
  /**
   * <pre>
   * The source context.
   * </pre>
   *
   * <code>.google.protobuf.SourceContext source_context = 4;</code>
   */
  private void clearSourceContext() {  sourceContext_ = null;
    
  }

  public static final int SYNTAX_FIELD_NUMBER = 5;
  private int syntax_;
  /**
   * <pre>
   * The source syntax.
   * </pre>
   *
   * <code>.google.protobuf.Syntax syntax = 5;</code>
   * @return The enum numeric value on the wire for syntax.
   */
  @java.lang.Override
  public int getSyntaxValue() {
    return syntax_;
  }
  /**
   * <pre>
   * The source syntax.
   * </pre>
   *
   * <code>.google.protobuf.Syntax syntax = 5;</code>
   * @return The syntax.
   */
  @java.lang.Override
  public com.google.protobuf.Syntax getSyntax() {
    com.google.protobuf.Syntax result = com.google.protobuf.Syntax.forNumber(syntax_);
    return result == null ? com.google.protobuf.Syntax.UNRECOGNIZED : result;
  }
  /**
   * <pre>
   * The source syntax.
   * </pre>
   *
   * <code>.google.protobuf.Syntax syntax = 5;</code>
   * @param value The enum numeric value on the wire for syntax to set.
   */
  private void setSyntaxValue(int value) {
      syntax_ = value;
  }
  /**
   * <pre>
   * The source syntax.
   * </pre>
   *
   * <code>.google.protobuf.Syntax syntax = 5;</code>
   * @param value The syntax to set.
   */
  private void setSyntax(com.google.protobuf.Syntax value) {
    syntax_ = value.getNumber();
    
  }
  /**
   * <pre>
   * The source syntax.
   * </pre>
   *
   * <code>.google.protobuf.Syntax syntax = 5;</code>
   */
  private void clearSyntax() {
    
    syntax_ = 0;
  }

  public static com.google.protobuf.Enum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.protobuf.Enum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.protobuf.Enum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.protobuf.Enum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.protobuf.Enum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.protobuf.Enum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.protobuf.Enum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.protobuf.Enum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.protobuf.Enum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.protobuf.Enum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.protobuf.Enum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.protobuf.Enum parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.google.protobuf.Enum prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Enum type definition.
   * </pre>
   *
   * Protobuf type {@code google.protobuf.Enum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.protobuf.Enum, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.protobuf.Enum)
      com.google.protobuf.EnumOrBuilder {
    // Construct using com.google.protobuf.Enum.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Enum type name.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      return instance.getName();
    }
    /**
     * <pre>
     * Enum type name.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      return instance.getNameBytes();
    }
    /**
     * <pre>
     * Enum type name.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      copyOnWrite();
      instance.setName(value);
      return this;
    }
    /**
     * <pre>
     * Enum type name.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      copyOnWrite();
      instance.clearName();
      return this;
    }
    /**
     * <pre>
     * Enum type name.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNameBytes(value);
      return this;
    }

    /**
     * <pre>
     * Enum value definitions.
     * </pre>
     *
     * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
     */
    @java.lang.Override
    public java.util.List<com.google.protobuf.EnumValue> getEnumvalueList() {
      return java.util.Collections.unmodifiableList(
          instance.getEnumvalueList());
    }
    /**
     * <pre>
     * Enum value definitions.
     * </pre>
     *
     * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
     */
    @java.lang.Override
    public int getEnumvalueCount() {
      return instance.getEnumvalueCount();
    }/**
     * <pre>
     * Enum value definitions.
     * </pre>
     *
     * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
     */
    @java.lang.Override
    public com.google.protobuf.EnumValue getEnumvalue(int index) {
      return instance.getEnumvalue(index);
    }
    /**
     * <pre>
     * Enum value definitions.
     * </pre>
     *
     * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
     */
    public Builder setEnumvalue(
        int index, com.google.protobuf.EnumValue value) {
      copyOnWrite();
      instance.setEnumvalue(index, value);
      return this;
    }
    /**
     * <pre>
     * Enum value definitions.
     * </pre>
     *
     * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
     */
    public Builder setEnumvalue(
        int index, com.google.protobuf.EnumValue.Builder builderForValue) {
      copyOnWrite();
      instance.setEnumvalue(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Enum value definitions.
     * </pre>
     *
     * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
     */
    public Builder addEnumvalue(com.google.protobuf.EnumValue value) {
      copyOnWrite();
      instance.addEnumvalue(value);
      return this;
    }
    /**
     * <pre>
     * Enum value definitions.
     * </pre>
     *
     * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
     */
    public Builder addEnumvalue(
        int index, com.google.protobuf.EnumValue value) {
      copyOnWrite();
      instance.addEnumvalue(index, value);
      return this;
    }
    /**
     * <pre>
     * Enum value definitions.
     * </pre>
     *
     * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
     */
    public Builder addEnumvalue(
        com.google.protobuf.EnumValue.Builder builderForValue) {
      copyOnWrite();
      instance.addEnumvalue(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Enum value definitions.
     * </pre>
     *
     * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
     */
    public Builder addEnumvalue(
        int index, com.google.protobuf.EnumValue.Builder builderForValue) {
      copyOnWrite();
      instance.addEnumvalue(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Enum value definitions.
     * </pre>
     *
     * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
     */
    public Builder addAllEnumvalue(
        java.lang.Iterable<? extends com.google.protobuf.EnumValue> values) {
      copyOnWrite();
      instance.addAllEnumvalue(values);
      return this;
    }
    /**
     * <pre>
     * Enum value definitions.
     * </pre>
     *
     * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
     */
    public Builder clearEnumvalue() {
      copyOnWrite();
      instance.clearEnumvalue();
      return this;
    }
    /**
     * <pre>
     * Enum value definitions.
     * </pre>
     *
     * <code>repeated .google.protobuf.EnumValue enumvalue = 2;</code>
     */
    public Builder removeEnumvalue(int index) {
      copyOnWrite();
      instance.removeEnumvalue(index);
      return this;
    }

    /**
     * <pre>
     * Protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 3;</code>
     */
    @java.lang.Override
    public java.util.List<com.google.protobuf.Option> getOptionsList() {
      return java.util.Collections.unmodifiableList(
          instance.getOptionsList());
    }
    /**
     * <pre>
     * Protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 3;</code>
     */
    @java.lang.Override
    public int getOptionsCount() {
      return instance.getOptionsCount();
    }/**
     * <pre>
     * Protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 3;</code>
     */
    @java.lang.Override
    public com.google.protobuf.Option getOptions(int index) {
      return instance.getOptions(index);
    }
    /**
     * <pre>
     * Protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 3;</code>
     */
    public Builder setOptions(
        int index, com.google.protobuf.Option value) {
      copyOnWrite();
      instance.setOptions(index, value);
      return this;
    }
    /**
     * <pre>
     * Protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 3;</code>
     */
    public Builder setOptions(
        int index, com.google.protobuf.Option.Builder builderForValue) {
      copyOnWrite();
      instance.setOptions(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 3;</code>
     */
    public Builder addOptions(com.google.protobuf.Option value) {
      copyOnWrite();
      instance.addOptions(value);
      return this;
    }
    /**
     * <pre>
     * Protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 3;</code>
     */
    public Builder addOptions(
        int index, com.google.protobuf.Option value) {
      copyOnWrite();
      instance.addOptions(index, value);
      return this;
    }
    /**
     * <pre>
     * Protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 3;</code>
     */
    public Builder addOptions(
        com.google.protobuf.Option.Builder builderForValue) {
      copyOnWrite();
      instance.addOptions(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 3;</code>
     */
    public Builder addOptions(
        int index, com.google.protobuf.Option.Builder builderForValue) {
      copyOnWrite();
      instance.addOptions(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 3;</code>
     */
    public Builder addAllOptions(
        java.lang.Iterable<? extends com.google.protobuf.Option> values) {
      copyOnWrite();
      instance.addAllOptions(values);
      return this;
    }
    /**
     * <pre>
     * Protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 3;</code>
     */
    public Builder clearOptions() {
      copyOnWrite();
      instance.clearOptions();
      return this;
    }
    /**
     * <pre>
     * Protocol buffer options.
     * </pre>
     *
     * <code>repeated .google.protobuf.Option options = 3;</code>
     */
    public Builder removeOptions(int index) {
      copyOnWrite();
      instance.removeOptions(index);
      return this;
    }

    /**
     * <pre>
     * The source context.
     * </pre>
     *
     * <code>.google.protobuf.SourceContext source_context = 4;</code>
     */
    @java.lang.Override
    public boolean hasSourceContext() {
      return instance.hasSourceContext();
    }
    /**
     * <pre>
     * The source context.
     * </pre>
     *
     * <code>.google.protobuf.SourceContext source_context = 4;</code>
     */
    @java.lang.Override
    public com.google.protobuf.SourceContext getSourceContext() {
      return instance.getSourceContext();
    }
    /**
     * <pre>
     * The source context.
     * </pre>
     *
     * <code>.google.protobuf.SourceContext source_context = 4;</code>
     */
    public Builder setSourceContext(com.google.protobuf.SourceContext value) {
      copyOnWrite();
      instance.setSourceContext(value);
      return this;
      }
    /**
     * <pre>
     * The source context.
     * </pre>
     *
     * <code>.google.protobuf.SourceContext source_context = 4;</code>
     */
    public Builder setSourceContext(
        com.google.protobuf.SourceContext.Builder builderForValue) {
      copyOnWrite();
      instance.setSourceContext(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The source context.
     * </pre>
     *
     * <code>.google.protobuf.SourceContext source_context = 4;</code>
     */
    public Builder mergeSourceContext(com.google.protobuf.SourceContext value) {
      copyOnWrite();
      instance.mergeSourceContext(value);
      return this;
    }
    /**
     * <pre>
     * The source context.
     * </pre>
     *
     * <code>.google.protobuf.SourceContext source_context = 4;</code>
     */
    public Builder clearSourceContext() {  copyOnWrite();
      instance.clearSourceContext();
      return this;
    }

    /**
     * <pre>
     * The source syntax.
     * </pre>
     *
     * <code>.google.protobuf.Syntax syntax = 5;</code>
     * @return The enum numeric value on the wire for syntax.
     */
    @java.lang.Override
    public int getSyntaxValue() {
      return instance.getSyntaxValue();
    }
    /**
     * <pre>
     * The source syntax.
     * </pre>
     *
     * <code>.google.protobuf.Syntax syntax = 5;</code>
     * @param value The syntax to set.
     * @return This builder for chaining.
     */
    public Builder setSyntaxValue(int value) {
      copyOnWrite();
      instance.setSyntaxValue(value);
      return this;
    }
    /**
     * <pre>
     * The source syntax.
     * </pre>
     *
     * <code>.google.protobuf.Syntax syntax = 5;</code>
     * @return The syntax.
     */
    @java.lang.Override
    public com.google.protobuf.Syntax getSyntax() {
      return instance.getSyntax();
    }
    /**
     * <pre>
     * The source syntax.
     * </pre>
     *
     * <code>.google.protobuf.Syntax syntax = 5;</code>
     * @param value The enum numeric value on the wire for syntax to set.
     * @return This builder for chaining.
     */
    public Builder setSyntax(com.google.protobuf.Syntax value) {
      copyOnWrite();
      instance.setSyntax(value);
      return this;
    }
    /**
     * <pre>
     * The source syntax.
     * </pre>
     *
     * <code>.google.protobuf.Syntax syntax = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSyntax() {
      copyOnWrite();
      instance.clearSyntax();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.protobuf.Enum)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.protobuf.Enum();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "name_",
            "enumvalue_",
            com.google.protobuf.EnumValue.class,
            "options_",
            com.google.protobuf.Option.class,
            "sourceContext_",
            "syntax_",
          };
          java.lang.String info =
              "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0208\u0002\u001b" +
              "\u0003\u001b\u0004\t\u0005\f";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.google.protobuf.Enum> parser = PARSER;
        if (parser == null) {
          synchronized (com.google.protobuf.Enum.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.google.protobuf.Enum>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:google.protobuf.Enum)
  private static final com.google.protobuf.Enum DEFAULT_INSTANCE;
  static {
    Enum defaultInstance = new Enum();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      Enum.class, defaultInstance);
  }

  public static com.google.protobuf.Enum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Enum> PARSER;

  public static com.google.protobuf.Parser<Enum> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

