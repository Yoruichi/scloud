// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Bundle.proto

package com.redteamobile.scloud;

/**
 * <pre>
 * The response message to show bundle list
 * </pre>
 *
 * Protobuf type {@code Reply2ListBundle}
 */
public  final class Reply2ListBundle extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Reply2ListBundle)
    Reply2ListBundleOrBuilder {
  // Use Reply2ListBundle.newBuilder() to construct.
  private Reply2ListBundle(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Reply2ListBundle() {
    success_ = false;
    bundles_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Reply2ListBundle(
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

            success_ = input.readBool();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              bundles_ = new java.util.ArrayList<com.redteamobile.scloud.BundleDetail>();
              mutable_bitField0_ |= 0x00000002;
            }
            bundles_.add(
                input.readMessage(com.redteamobile.scloud.BundleDetail.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        bundles_ = java.util.Collections.unmodifiableList(bundles_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.redteamobile.scloud.BundlePb.internal_static_Reply2ListBundle_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.redteamobile.scloud.BundlePb.internal_static_Reply2ListBundle_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.redteamobile.scloud.Reply2ListBundle.class, com.redteamobile.scloud.Reply2ListBundle.Builder.class);
  }

  private int bitField0_;
  public static final int SUCCESS_FIELD_NUMBER = 1;
  private boolean success_;
  /**
   * <code>optional bool success = 1;</code>
   */
  public boolean getSuccess() {
    return success_;
  }

  public static final int BUNDLES_FIELD_NUMBER = 2;
  private java.util.List<com.redteamobile.scloud.BundleDetail> bundles_;
  /**
   * <code>repeated .BundleDetail bundles = 2;</code>
   */
  public java.util.List<com.redteamobile.scloud.BundleDetail> getBundlesList() {
    return bundles_;
  }
  /**
   * <code>repeated .BundleDetail bundles = 2;</code>
   */
  public java.util.List<? extends com.redteamobile.scloud.BundleDetailOrBuilder> 
      getBundlesOrBuilderList() {
    return bundles_;
  }
  /**
   * <code>repeated .BundleDetail bundles = 2;</code>
   */
  public int getBundlesCount() {
    return bundles_.size();
  }
  /**
   * <code>repeated .BundleDetail bundles = 2;</code>
   */
  public com.redteamobile.scloud.BundleDetail getBundles(int index) {
    return bundles_.get(index);
  }
  /**
   * <code>repeated .BundleDetail bundles = 2;</code>
   */
  public com.redteamobile.scloud.BundleDetailOrBuilder getBundlesOrBuilder(
      int index) {
    return bundles_.get(index);
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
    if (success_ != false) {
      output.writeBool(1, success_);
    }
    for (int i = 0; i < bundles_.size(); i++) {
      output.writeMessage(2, bundles_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (success_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, success_);
    }
    for (int i = 0; i < bundles_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, bundles_.get(i));
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
    if (!(obj instanceof com.redteamobile.scloud.Reply2ListBundle)) {
      return super.equals(obj);
    }
    com.redteamobile.scloud.Reply2ListBundle other = (com.redteamobile.scloud.Reply2ListBundle) obj;

    boolean result = true;
    result = result && (getSuccess()
        == other.getSuccess());
    result = result && getBundlesList()
        .equals(other.getBundlesList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSuccess());
    if (getBundlesCount() > 0) {
      hash = (37 * hash) + BUNDLES_FIELD_NUMBER;
      hash = (53 * hash) + getBundlesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.redteamobile.scloud.Reply2ListBundle parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.redteamobile.scloud.Reply2ListBundle parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.redteamobile.scloud.Reply2ListBundle parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.redteamobile.scloud.Reply2ListBundle parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.redteamobile.scloud.Reply2ListBundle parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.redteamobile.scloud.Reply2ListBundle parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.redteamobile.scloud.Reply2ListBundle parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.redteamobile.scloud.Reply2ListBundle parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.redteamobile.scloud.Reply2ListBundle parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.redteamobile.scloud.Reply2ListBundle parseFrom(
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
  public static Builder newBuilder(com.redteamobile.scloud.Reply2ListBundle prototype) {
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
   * <pre>
   * The response message to show bundle list
   * </pre>
   *
   * Protobuf type {@code Reply2ListBundle}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Reply2ListBundle)
      com.redteamobile.scloud.Reply2ListBundleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.redteamobile.scloud.BundlePb.internal_static_Reply2ListBundle_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.redteamobile.scloud.BundlePb.internal_static_Reply2ListBundle_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.redteamobile.scloud.Reply2ListBundle.class, com.redteamobile.scloud.Reply2ListBundle.Builder.class);
    }

    // Construct using com.redteamobile.scloud.Reply2ListBundle.newBuilder()
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
        getBundlesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      success_ = false;

      if (bundlesBuilder_ == null) {
        bundles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        bundlesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.redteamobile.scloud.BundlePb.internal_static_Reply2ListBundle_descriptor;
    }

    public com.redteamobile.scloud.Reply2ListBundle getDefaultInstanceForType() {
      return com.redteamobile.scloud.Reply2ListBundle.getDefaultInstance();
    }

    public com.redteamobile.scloud.Reply2ListBundle build() {
      com.redteamobile.scloud.Reply2ListBundle result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.redteamobile.scloud.Reply2ListBundle buildPartial() {
      com.redteamobile.scloud.Reply2ListBundle result = new com.redteamobile.scloud.Reply2ListBundle(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.success_ = success_;
      if (bundlesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          bundles_ = java.util.Collections.unmodifiableList(bundles_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.bundles_ = bundles_;
      } else {
        result.bundles_ = bundlesBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.redteamobile.scloud.Reply2ListBundle) {
        return mergeFrom((com.redteamobile.scloud.Reply2ListBundle)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.redteamobile.scloud.Reply2ListBundle other) {
      if (other == com.redteamobile.scloud.Reply2ListBundle.getDefaultInstance()) return this;
      if (other.getSuccess() != false) {
        setSuccess(other.getSuccess());
      }
      if (bundlesBuilder_ == null) {
        if (!other.bundles_.isEmpty()) {
          if (bundles_.isEmpty()) {
            bundles_ = other.bundles_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureBundlesIsMutable();
            bundles_.addAll(other.bundles_);
          }
          onChanged();
        }
      } else {
        if (!other.bundles_.isEmpty()) {
          if (bundlesBuilder_.isEmpty()) {
            bundlesBuilder_.dispose();
            bundlesBuilder_ = null;
            bundles_ = other.bundles_;
            bitField0_ = (bitField0_ & ~0x00000002);
            bundlesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBundlesFieldBuilder() : null;
          } else {
            bundlesBuilder_.addAllMessages(other.bundles_);
          }
        }
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
      com.redteamobile.scloud.Reply2ListBundle parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.redteamobile.scloud.Reply2ListBundle) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean success_ ;
    /**
     * <code>optional bool success = 1;</code>
     */
    public boolean getSuccess() {
      return success_;
    }
    /**
     * <code>optional bool success = 1;</code>
     */
    public Builder setSuccess(boolean value) {
      
      success_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool success = 1;</code>
     */
    public Builder clearSuccess() {
      
      success_ = false;
      onChanged();
      return this;
    }

    private java.util.List<com.redteamobile.scloud.BundleDetail> bundles_ =
      java.util.Collections.emptyList();
    private void ensureBundlesIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        bundles_ = new java.util.ArrayList<com.redteamobile.scloud.BundleDetail>(bundles_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.redteamobile.scloud.BundleDetail, com.redteamobile.scloud.BundleDetail.Builder, com.redteamobile.scloud.BundleDetailOrBuilder> bundlesBuilder_;

    /**
     * <code>repeated .BundleDetail bundles = 2;</code>
     */
    public java.util.List<com.redteamobile.scloud.BundleDetail> getBundlesList() {
      if (bundlesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(bundles_);
      } else {
        return bundlesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .BundleDetail bundles = 2;</code>
     */
    public int getBundlesCount() {
      if (bundlesBuilder_ == null) {
        return bundles_.size();
      } else {
        return bundlesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .BundleDetail bundles = 2;</code>
     */
    public com.redteamobile.scloud.BundleDetail getBundles(int index) {
      if (bundlesBuilder_ == null) {
        return bundles_.get(index);
      } else {
        return bundlesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .BundleDetail bundles = 2;</code>
     */
    public Builder setBundles(
        int index, com.redteamobile.scloud.BundleDetail value) {
      if (bundlesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBundlesIsMutable();
        bundles_.set(index, value);
        onChanged();
      } else {
        bundlesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .BundleDetail bundles = 2;</code>
     */
    public Builder setBundles(
        int index, com.redteamobile.scloud.BundleDetail.Builder builderForValue) {
      if (bundlesBuilder_ == null) {
        ensureBundlesIsMutable();
        bundles_.set(index, builderForValue.build());
        onChanged();
      } else {
        bundlesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .BundleDetail bundles = 2;</code>
     */
    public Builder addBundles(com.redteamobile.scloud.BundleDetail value) {
      if (bundlesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBundlesIsMutable();
        bundles_.add(value);
        onChanged();
      } else {
        bundlesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .BundleDetail bundles = 2;</code>
     */
    public Builder addBundles(
        int index, com.redteamobile.scloud.BundleDetail value) {
      if (bundlesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBundlesIsMutable();
        bundles_.add(index, value);
        onChanged();
      } else {
        bundlesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .BundleDetail bundles = 2;</code>
     */
    public Builder addBundles(
        com.redteamobile.scloud.BundleDetail.Builder builderForValue) {
      if (bundlesBuilder_ == null) {
        ensureBundlesIsMutable();
        bundles_.add(builderForValue.build());
        onChanged();
      } else {
        bundlesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .BundleDetail bundles = 2;</code>
     */
    public Builder addBundles(
        int index, com.redteamobile.scloud.BundleDetail.Builder builderForValue) {
      if (bundlesBuilder_ == null) {
        ensureBundlesIsMutable();
        bundles_.add(index, builderForValue.build());
        onChanged();
      } else {
        bundlesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .BundleDetail bundles = 2;</code>
     */
    public Builder addAllBundles(
        java.lang.Iterable<? extends com.redteamobile.scloud.BundleDetail> values) {
      if (bundlesBuilder_ == null) {
        ensureBundlesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, bundles_);
        onChanged();
      } else {
        bundlesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .BundleDetail bundles = 2;</code>
     */
    public Builder clearBundles() {
      if (bundlesBuilder_ == null) {
        bundles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        bundlesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .BundleDetail bundles = 2;</code>
     */
    public Builder removeBundles(int index) {
      if (bundlesBuilder_ == null) {
        ensureBundlesIsMutable();
        bundles_.remove(index);
        onChanged();
      } else {
        bundlesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .BundleDetail bundles = 2;</code>
     */
    public com.redteamobile.scloud.BundleDetail.Builder getBundlesBuilder(
        int index) {
      return getBundlesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .BundleDetail bundles = 2;</code>
     */
    public com.redteamobile.scloud.BundleDetailOrBuilder getBundlesOrBuilder(
        int index) {
      if (bundlesBuilder_ == null) {
        return bundles_.get(index);  } else {
        return bundlesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .BundleDetail bundles = 2;</code>
     */
    public java.util.List<? extends com.redteamobile.scloud.BundleDetailOrBuilder> 
         getBundlesOrBuilderList() {
      if (bundlesBuilder_ != null) {
        return bundlesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(bundles_);
      }
    }
    /**
     * <code>repeated .BundleDetail bundles = 2;</code>
     */
    public com.redteamobile.scloud.BundleDetail.Builder addBundlesBuilder() {
      return getBundlesFieldBuilder().addBuilder(
          com.redteamobile.scloud.BundleDetail.getDefaultInstance());
    }
    /**
     * <code>repeated .BundleDetail bundles = 2;</code>
     */
    public com.redteamobile.scloud.BundleDetail.Builder addBundlesBuilder(
        int index) {
      return getBundlesFieldBuilder().addBuilder(
          index, com.redteamobile.scloud.BundleDetail.getDefaultInstance());
    }
    /**
     * <code>repeated .BundleDetail bundles = 2;</code>
     */
    public java.util.List<com.redteamobile.scloud.BundleDetail.Builder> 
         getBundlesBuilderList() {
      return getBundlesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.redteamobile.scloud.BundleDetail, com.redteamobile.scloud.BundleDetail.Builder, com.redteamobile.scloud.BundleDetailOrBuilder> 
        getBundlesFieldBuilder() {
      if (bundlesBuilder_ == null) {
        bundlesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.redteamobile.scloud.BundleDetail, com.redteamobile.scloud.BundleDetail.Builder, com.redteamobile.scloud.BundleDetailOrBuilder>(
                bundles_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        bundles_ = null;
      }
      return bundlesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:Reply2ListBundle)
  }

  // @@protoc_insertion_point(class_scope:Reply2ListBundle)
  private static final com.redteamobile.scloud.Reply2ListBundle DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.redteamobile.scloud.Reply2ListBundle();
  }

  public static com.redteamobile.scloud.Reply2ListBundle getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Reply2ListBundle>
      PARSER = new com.google.protobuf.AbstractParser<Reply2ListBundle>() {
    public Reply2ListBundle parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Reply2ListBundle(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Reply2ListBundle> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Reply2ListBundle> getParserForType() {
    return PARSER;
  }

  public com.redteamobile.scloud.Reply2ListBundle getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
