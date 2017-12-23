// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Merchant.proto

package com.redteamobile.scloud;

/**
 * Protobuf type {@code QueryMerchantReq}
 */
public  final class QueryMerchantReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:QueryMerchantReq)
    QueryMerchantReqOrBuilder {
  // Use QueryMerchantReq.newBuilder() to construct.
  private QueryMerchantReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryMerchantReq() {
    merchantCode_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private QueryMerchantReq(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            merchantCode_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.redteamobile.scloud.MerchantPb.internal_static_QueryMerchantReq_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.redteamobile.scloud.MerchantPb.internal_static_QueryMerchantReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.redteamobile.scloud.QueryMerchantReq.class, com.redteamobile.scloud.QueryMerchantReq.Builder.class);
  }

  public static final int MERCHANT_CODE_FIELD_NUMBER = 1;
  private volatile java.lang.Object merchantCode_;
  /**
   * <code>optional string merchant_code = 1;</code>
   */
  public java.lang.String getMerchantCode() {
    java.lang.Object ref = merchantCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      merchantCode_ = s;
      return s;
    }
  }
  /**
   * <code>optional string merchant_code = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMerchantCodeBytes() {
    java.lang.Object ref = merchantCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      merchantCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getMerchantCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, merchantCode_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMerchantCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, merchantCode_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.redteamobile.scloud.QueryMerchantReq)) {
      return super.equals(obj);
    }
    com.redteamobile.scloud.QueryMerchantReq other = (com.redteamobile.scloud.QueryMerchantReq) obj;

    boolean result = true;
    result = result && getMerchantCode()
        .equals(other.getMerchantCode());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + MERCHANT_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getMerchantCode().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.redteamobile.scloud.QueryMerchantReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.redteamobile.scloud.QueryMerchantReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.redteamobile.scloud.QueryMerchantReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.redteamobile.scloud.QueryMerchantReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.redteamobile.scloud.QueryMerchantReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.redteamobile.scloud.QueryMerchantReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.redteamobile.scloud.QueryMerchantReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.redteamobile.scloud.QueryMerchantReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.redteamobile.scloud.QueryMerchantReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.redteamobile.scloud.QueryMerchantReq parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.redteamobile.scloud.QueryMerchantReq prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code QueryMerchantReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:QueryMerchantReq)
      com.redteamobile.scloud.QueryMerchantReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.redteamobile.scloud.MerchantPb.internal_static_QueryMerchantReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.redteamobile.scloud.MerchantPb.internal_static_QueryMerchantReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.redteamobile.scloud.QueryMerchantReq.class, com.redteamobile.scloud.QueryMerchantReq.Builder.class);
    }

    // Construct using com.redteamobile.scloud.QueryMerchantReq.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      merchantCode_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.redteamobile.scloud.MerchantPb.internal_static_QueryMerchantReq_descriptor;
    }

    public com.redteamobile.scloud.QueryMerchantReq getDefaultInstanceForType() {
      return com.redteamobile.scloud.QueryMerchantReq.getDefaultInstance();
    }

    public com.redteamobile.scloud.QueryMerchantReq build() {
      com.redteamobile.scloud.QueryMerchantReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.redteamobile.scloud.QueryMerchantReq buildPartial() {
      com.redteamobile.scloud.QueryMerchantReq result = new com.redteamobile.scloud.QueryMerchantReq(this);
      result.merchantCode_ = merchantCode_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.redteamobile.scloud.QueryMerchantReq) {
        return mergeFrom((com.redteamobile.scloud.QueryMerchantReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.redteamobile.scloud.QueryMerchantReq other) {
      if (other == com.redteamobile.scloud.QueryMerchantReq.getDefaultInstance()) return this;
      if (!other.getMerchantCode().isEmpty()) {
        merchantCode_ = other.merchantCode_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.redteamobile.scloud.QueryMerchantReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.redteamobile.scloud.QueryMerchantReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object merchantCode_ = "";
    /**
     * <code>optional string merchant_code = 1;</code>
     */
    public java.lang.String getMerchantCode() {
      java.lang.Object ref = merchantCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        merchantCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string merchant_code = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMerchantCodeBytes() {
      java.lang.Object ref = merchantCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        merchantCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string merchant_code = 1;</code>
     */
    public Builder setMerchantCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      merchantCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string merchant_code = 1;</code>
     */
    public Builder clearMerchantCode() {
      
      merchantCode_ = getDefaultInstance().getMerchantCode();
      onChanged();
      return this;
    }
    /**
     * <code>optional string merchant_code = 1;</code>
     */
    public Builder setMerchantCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      merchantCode_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:QueryMerchantReq)
  }

  // @@protoc_insertion_point(class_scope:QueryMerchantReq)
  private static final com.redteamobile.scloud.QueryMerchantReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.redteamobile.scloud.QueryMerchantReq();
  }

  public static com.redteamobile.scloud.QueryMerchantReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryMerchantReq>
      PARSER = new com.google.protobuf.AbstractParser<QueryMerchantReq>() {
    public QueryMerchantReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new QueryMerchantReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryMerchantReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryMerchantReq> getParserForType() {
    return PARSER;
  }

  public com.redteamobile.scloud.QueryMerchantReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

