// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Merchant.proto

package com.redteamobile.scloud;

/**
 * Protobuf type {@code MerchantInfo}
 */
public  final class MerchantInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:MerchantInfo)
    MerchantInfoOrBuilder {
  // Use MerchantInfo.newBuilder() to construct.
  private MerchantInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MerchantInfo() {
    id_ = 0;
    code_ = "";
    status_ = 0;
    name_ = "";
    channelId_ = 0;
    requestId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private MerchantInfo(
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
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            code_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 40: {

            channelId_ = input.readInt32();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            requestId_ = s;
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
    return com.redteamobile.scloud.MerchantPb.internal_static_MerchantInfo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.redteamobile.scloud.MerchantPb.internal_static_MerchantInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.redteamobile.scloud.MerchantInfo.class, com.redteamobile.scloud.MerchantInfo.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>optional int32 id = 1;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int CODE_FIELD_NUMBER = 2;
  private volatile java.lang.Object code_;
  /**
   * <code>optional string code = 2;</code>
   */
  public java.lang.String getCode() {
    java.lang.Object ref = code_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      code_ = s;
      return s;
    }
  }
  /**
   * <code>optional string code = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCodeBytes() {
    java.lang.Object ref = code_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      code_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private int status_;
  /**
   * <code>optional .Merchant.MerchantStatus status = 3;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>optional .Merchant.MerchantStatus status = 3;</code>
   */
  public com.redteamobile.scloud.Merchant.MerchantStatus getStatus() {
    com.redteamobile.scloud.Merchant.MerchantStatus result = com.redteamobile.scloud.Merchant.MerchantStatus.valueOf(status_);
    return result == null ? com.redteamobile.scloud.Merchant.MerchantStatus.UNRECOGNIZED : result;
  }

  public static final int NAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object name_;
  /**
   * <code>optional string name = 4;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>optional string name = 4;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHANNEL_ID_FIELD_NUMBER = 5;
  private int channelId_;
  /**
   * <code>optional int32 channel_id = 5;</code>
   */
  public int getChannelId() {
    return channelId_;
  }

  public static final int REQUEST_ID_FIELD_NUMBER = 6;
  private volatile java.lang.Object requestId_;
  /**
   * <code>optional string request_id = 6;</code>
   */
  public java.lang.String getRequestId() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      requestId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string request_id = 6;</code>
   */
  public com.google.protobuf.ByteString
      getRequestIdBytes() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      requestId_ = b;
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
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (!getCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, code_);
    }
    if (status_ != com.redteamobile.scloud.Merchant.MerchantStatus.ACTIVE.getNumber()) {
      output.writeEnum(3, status_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, name_);
    }
    if (channelId_ != 0) {
      output.writeInt32(5, channelId_);
    }
    if (!getRequestIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, requestId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (!getCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, code_);
    }
    if (status_ != com.redteamobile.scloud.Merchant.MerchantStatus.ACTIVE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, status_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, name_);
    }
    if (channelId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, channelId_);
    }
    if (!getRequestIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, requestId_);
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
    if (!(obj instanceof com.redteamobile.scloud.MerchantInfo)) {
      return super.equals(obj);
    }
    com.redteamobile.scloud.MerchantInfo other = (com.redteamobile.scloud.MerchantInfo) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && getCode()
        .equals(other.getCode());
    result = result && status_ == other.status_;
    result = result && getName()
        .equals(other.getName());
    result = result && (getChannelId()
        == other.getChannelId());
    result = result && getRequestId()
        .equals(other.getRequestId());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCode().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + CHANNEL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getChannelId();
    hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRequestId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.redteamobile.scloud.MerchantInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.redteamobile.scloud.MerchantInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.redteamobile.scloud.MerchantInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.redteamobile.scloud.MerchantInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.redteamobile.scloud.MerchantInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.redteamobile.scloud.MerchantInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.redteamobile.scloud.MerchantInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.redteamobile.scloud.MerchantInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.redteamobile.scloud.MerchantInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.redteamobile.scloud.MerchantInfo parseFrom(
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
  public static Builder newBuilder(com.redteamobile.scloud.MerchantInfo prototype) {
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
   * Protobuf type {@code MerchantInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:MerchantInfo)
      com.redteamobile.scloud.MerchantInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.redteamobile.scloud.MerchantPb.internal_static_MerchantInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.redteamobile.scloud.MerchantPb.internal_static_MerchantInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.redteamobile.scloud.MerchantInfo.class, com.redteamobile.scloud.MerchantInfo.Builder.class);
    }

    // Construct using com.redteamobile.scloud.MerchantInfo.newBuilder()
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
      id_ = 0;

      code_ = "";

      status_ = 0;

      name_ = "";

      channelId_ = 0;

      requestId_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.redteamobile.scloud.MerchantPb.internal_static_MerchantInfo_descriptor;
    }

    public com.redteamobile.scloud.MerchantInfo getDefaultInstanceForType() {
      return com.redteamobile.scloud.MerchantInfo.getDefaultInstance();
    }

    public com.redteamobile.scloud.MerchantInfo build() {
      com.redteamobile.scloud.MerchantInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.redteamobile.scloud.MerchantInfo buildPartial() {
      com.redteamobile.scloud.MerchantInfo result = new com.redteamobile.scloud.MerchantInfo(this);
      result.id_ = id_;
      result.code_ = code_;
      result.status_ = status_;
      result.name_ = name_;
      result.channelId_ = channelId_;
      result.requestId_ = requestId_;
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
      if (other instanceof com.redteamobile.scloud.MerchantInfo) {
        return mergeFrom((com.redteamobile.scloud.MerchantInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.redteamobile.scloud.MerchantInfo other) {
      if (other == com.redteamobile.scloud.MerchantInfo.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getCode().isEmpty()) {
        code_ = other.code_;
        onChanged();
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getChannelId() != 0) {
        setChannelId(other.getChannelId());
      }
      if (!other.getRequestId().isEmpty()) {
        requestId_ = other.requestId_;
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
      com.redteamobile.scloud.MerchantInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.redteamobile.scloud.MerchantInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <code>optional int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>optional int32 id = 1;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object code_ = "";
    /**
     * <code>optional string code = 2;</code>
     */
    public java.lang.String getCode() {
      java.lang.Object ref = code_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        code_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string code = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCodeBytes() {
      java.lang.Object ref = code_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        code_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string code = 2;</code>
     */
    public Builder setCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string code = 2;</code>
     */
    public Builder clearCode() {
      
      code_ = getDefaultInstance().getCode();
      onChanged();
      return this;
    }
    /**
     * <code>optional string code = 2;</code>
     */
    public Builder setCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      code_ = value;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <code>optional .Merchant.MerchantStatus status = 3;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>optional .Merchant.MerchantStatus status = 3;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .Merchant.MerchantStatus status = 3;</code>
     */
    public com.redteamobile.scloud.Merchant.MerchantStatus getStatus() {
      com.redteamobile.scloud.Merchant.MerchantStatus result = com.redteamobile.scloud.Merchant.MerchantStatus.valueOf(status_);
      return result == null ? com.redteamobile.scloud.Merchant.MerchantStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .Merchant.MerchantStatus status = 3;</code>
     */
    public Builder setStatus(com.redteamobile.scloud.Merchant.MerchantStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .Merchant.MerchantStatus status = 3;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>optional string name = 4;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string name = 4;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string name = 4;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 4;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 4;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int channelId_ ;
    /**
     * <code>optional int32 channel_id = 5;</code>
     */
    public int getChannelId() {
      return channelId_;
    }
    /**
     * <code>optional int32 channel_id = 5;</code>
     */
    public Builder setChannelId(int value) {
      
      channelId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 channel_id = 5;</code>
     */
    public Builder clearChannelId() {
      
      channelId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object requestId_ = "";
    /**
     * <code>optional string request_id = 6;</code>
     */
    public java.lang.String getRequestId() {
      java.lang.Object ref = requestId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        requestId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string request_id = 6;</code>
     */
    public com.google.protobuf.ByteString
        getRequestIdBytes() {
      java.lang.Object ref = requestId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        requestId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string request_id = 6;</code>
     */
    public Builder setRequestId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      requestId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string request_id = 6;</code>
     */
    public Builder clearRequestId() {
      
      requestId_ = getDefaultInstance().getRequestId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string request_id = 6;</code>
     */
    public Builder setRequestIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      requestId_ = value;
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


    // @@protoc_insertion_point(builder_scope:MerchantInfo)
  }

  // @@protoc_insertion_point(class_scope:MerchantInfo)
  private static final com.redteamobile.scloud.MerchantInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.redteamobile.scloud.MerchantInfo();
  }

  public static com.redteamobile.scloud.MerchantInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MerchantInfo>
      PARSER = new com.google.protobuf.AbstractParser<MerchantInfo>() {
    public MerchantInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new MerchantInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MerchantInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MerchantInfo> getParserForType() {
    return PARSER;
  }

  public com.redteamobile.scloud.MerchantInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
