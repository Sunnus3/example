// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HelloSerive.proto

package com.github.arugal.example.grpc.gencode;

public final class HelloSerive {
  private HelloSerive() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_arugal_example_grpc_gencode_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_github_arugal_example_grpc_gencode_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_github_arugal_example_grpc_gencode_HelloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_github_arugal_example_grpc_gencode_HelloResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021HelloSerive.proto\022&com.github.arugal.e" +
      "xample.grpc.gencode\"3\n\014HelloRequest\022\021\n\tf" +
      "irstName\030\001 \001(\t\022\020\n\010lastName\030\002 \001(\t\"!\n\rHell" +
      "oResponse\022\020\n\010greeting\030\001 \001(\t2\375\001\n\013HelloSer" +
      "ice\022t\n\005hello\0224.com.github.arugal.example" +
      ".grpc.gencode.HelloRequest\0325.com.github." +
      "arugal.example.grpc.gencode.HelloRespons" +
      "e\022x\n\007collect\0224.com.github.arugal.example" +
      ".grpc.gencode.HelloRequest\0325.com.github." +
      "arugal.example.grpc.gencode.HelloRespons" +
      "e(\001B\002P\001b\006proto3"
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
    internal_static_com_github_arugal_example_grpc_gencode_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_github_arugal_example_grpc_gencode_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_github_arugal_example_grpc_gencode_HelloRequest_descriptor,
        new java.lang.String[] { "FirstName", "LastName", });
    internal_static_com_github_arugal_example_grpc_gencode_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_github_arugal_example_grpc_gencode_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_github_arugal_example_grpc_gencode_HelloResponse_descriptor,
        new java.lang.String[] { "Greeting", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
