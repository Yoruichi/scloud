// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Bundle.proto

package com.redteamobile.scloud;

public final class BundlePb {
  private BundlePb() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Request2ListBundle_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Request2ListBundle_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Reply2ListBundle_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Reply2ListBundle_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BundleDetail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BundleDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BundleDetail_Network_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BundleDetail_Network_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014Bundle.proto\"e\n\022Request2ListBundle\022\025\n\r" +
      "merchant_code\030\001 \001(\t\022*\n\006status\030\002 \001(\0162\032.Bu" +
      "ndleDetail.BundleStatus\022\014\n\004type\030\003 \001(\005\"C\n" +
      "\020Reply2ListBundle\022\017\n\007success\030\001 \001(\010\022\036\n\007bu" +
      "ndles\030\002 \003(\0132\r.BundleDetail\"\323\002\n\014BundleDet" +
      "ail\022\n\n\002id\030\001 \001(\005\022\014\n\004type\030\002 \001(\t\022*\n\006status\030" +
      "\003 \001(\0162\032.BundleDetail.BundleStatus\022\020\n\010loc" +
      "ation\030\004 \001(\t\022\023\n\013data_volume\030\005 \001(\005\022\023\n\013dail" +
      "y_limit\030\006 \001(\005\022\020\n\010duration\030\007 \001(\005\022\033\n\023get_r" +
      "esource_method\030\010 \001(\005\022&\n\007network\030\t \001(\0132\025.",
      "BundleDetail.Network\0323\n\007Network\022\013\n\003mcc\030\001" +
      " \003(\t\022\014\n\004plmn\030\002 \003(\t\022\r\n\005fplmn\030\003 \003(\t\"5\n\014Bun" +
      "dleStatus\022\n\n\006ACTIVE\020\000\022\014\n\010INACTIVE\020\001\022\013\n\007E" +
      "XPIRED\020\0022D\n\nBundleServ\0226\n\nListBundle\022\023.R" +
      "equest2ListBundle\032\021.Reply2ListBundle\"\000B3" +
      "\n\027com.redteamobile.scloudB\010BundlePbP\001\210\001\001" +
      "\242\002\010BundlePbb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Request2ListBundle_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Request2ListBundle_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Request2ListBundle_descriptor,
        new java.lang.String[] { "MerchantCode", "Status", "Type", });
    internal_static_Reply2ListBundle_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Reply2ListBundle_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Reply2ListBundle_descriptor,
        new java.lang.String[] { "Success", "Bundles", });
    internal_static_BundleDetail_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_BundleDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BundleDetail_descriptor,
        new java.lang.String[] { "Id", "Type", "Status", "Location", "DataVolume", "DailyLimit", "Duration", "GetResourceMethod", "Network", });
    internal_static_BundleDetail_Network_descriptor =
      internal_static_BundleDetail_descriptor.getNestedTypes().get(0);
    internal_static_BundleDetail_Network_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BundleDetail_Network_descriptor,
        new java.lang.String[] { "Mcc", "Plmn", "Fplmn", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}