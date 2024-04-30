// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CarPark.proto

package org.sample.park.autogenerated;

/**
 * Protobuf type {@code org.sample.park.autogenerated.Vehicle}
 */
public  final class Vehicle extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.sample.park.autogenerated.Vehicle)
    VehicleOrBuilder {
  // Use Vehicle.newBuilder() to construct.
  private Vehicle(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Vehicle() {
    vehicleNumber_ = "";
    vehicleType_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Vehicle(
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

            vehicleNumber_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            vehicleType_ = s;
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
    return org.sample.park.autogenerated.CarPark.internal_static_org_sample_park_Vehicle_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.sample.park.autogenerated.CarPark.internal_static_org_sample_park_Vehicle_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.sample.park.autogenerated.Vehicle.class, org.sample.park.autogenerated.Vehicle.Builder.class);
  }

  public static final int VEHICLE_NUMBER_FIELD_NUMBER = 1;
  private volatile java.lang.Object vehicleNumber_;
  /**
   * <code>string vehicle_number = 1;</code>
   */
  public java.lang.String getVehicleNumber() {
    java.lang.Object ref = vehicleNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vehicleNumber_ = s;
      return s;
    }
  }
  /**
   * <code>string vehicle_number = 1;</code>
   */
  public com.google.protobuf.ByteString
      getVehicleNumberBytes() {
    java.lang.Object ref = vehicleNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      vehicleNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VEHICLE_TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object vehicleType_;
  /**
   * <code>string vehicle_type = 2;</code>
   */
  public java.lang.String getVehicleType() {
    java.lang.Object ref = vehicleType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vehicleType_ = s;
      return s;
    }
  }
  /**
   * <code>string vehicle_type = 2;</code>
   */
  public com.google.protobuf.ByteString
      getVehicleTypeBytes() {
    java.lang.Object ref = vehicleType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      vehicleType_ = b;
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
    if (!getVehicleNumberBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, vehicleNumber_);
    }
    if (!getVehicleTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, vehicleType_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getVehicleNumberBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, vehicleNumber_);
    }
    if (!getVehicleTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, vehicleType_);
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
    if (!(obj instanceof org.sample.park.autogenerated.Vehicle)) {
      return super.equals(obj);
    }
    org.sample.park.autogenerated.Vehicle other = (org.sample.park.autogenerated.Vehicle) obj;

    boolean result = true;
    result = result && getVehicleNumber()
        .equals(other.getVehicleNumber());
    result = result && getVehicleType()
        .equals(other.getVehicleType());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + VEHICLE_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getVehicleNumber().hashCode();
    hash = (37 * hash) + VEHICLE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getVehicleType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.sample.park.autogenerated.Vehicle parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sample.park.autogenerated.Vehicle parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sample.park.autogenerated.Vehicle parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sample.park.autogenerated.Vehicle parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sample.park.autogenerated.Vehicle parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sample.park.autogenerated.Vehicle parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sample.park.autogenerated.Vehicle parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sample.park.autogenerated.Vehicle parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sample.park.autogenerated.Vehicle parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.sample.park.autogenerated.Vehicle parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sample.park.autogenerated.Vehicle parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sample.park.autogenerated.Vehicle parseFrom(
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
  public static Builder newBuilder(org.sample.park.autogenerated.Vehicle prototype) {
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
   * Protobuf type {@code org.sample.park.autogenerated.Vehicle}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.sample.park.autogenerated.Vehicle)
      org.sample.park.autogenerated.VehicleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.sample.park.autogenerated.CarPark.internal_static_org_sample_park_Vehicle_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sample.park.autogenerated.CarPark.internal_static_org_sample_park_Vehicle_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sample.park.autogenerated.Vehicle.class, org.sample.park.autogenerated.Vehicle.Builder.class);
    }

    // Construct using org.sample.park.autogenerated.Vehicle.newBuilder()
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
      vehicleNumber_ = "";

      vehicleType_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.sample.park.autogenerated.CarPark.internal_static_org_sample_park_Vehicle_descriptor;
    }

    public org.sample.park.autogenerated.Vehicle getDefaultInstanceForType() {
      return org.sample.park.autogenerated.Vehicle.getDefaultInstance();
    }

    public org.sample.park.autogenerated.Vehicle build() {
      org.sample.park.autogenerated.Vehicle result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.sample.park.autogenerated.Vehicle buildPartial() {
      org.sample.park.autogenerated.Vehicle result = new org.sample.park.autogenerated.Vehicle(this);
      result.vehicleNumber_ = vehicleNumber_;
      result.vehicleType_ = vehicleType_;
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
      if (other instanceof org.sample.park.autogenerated.Vehicle) {
        return mergeFrom((org.sample.park.autogenerated.Vehicle)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.sample.park.autogenerated.Vehicle other) {
      if (other == org.sample.park.autogenerated.Vehicle.getDefaultInstance()) return this;
      if (!other.getVehicleNumber().isEmpty()) {
        vehicleNumber_ = other.vehicleNumber_;
        onChanged();
      }
      if (!other.getVehicleType().isEmpty()) {
        vehicleType_ = other.vehicleType_;
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
      org.sample.park.autogenerated.Vehicle parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.sample.park.autogenerated.Vehicle) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object vehicleNumber_ = "";
    /**
     * <code>string vehicle_number = 1;</code>
     */
    public java.lang.String getVehicleNumber() {
      java.lang.Object ref = vehicleNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vehicleNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string vehicle_number = 1;</code>
     */
    public com.google.protobuf.ByteString
        getVehicleNumberBytes() {
      java.lang.Object ref = vehicleNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vehicleNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string vehicle_number = 1;</code>
     */
    public Builder setVehicleNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      vehicleNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string vehicle_number = 1;</code>
     */
    public Builder clearVehicleNumber() {
      
      vehicleNumber_ = getDefaultInstance().getVehicleNumber();
      onChanged();
      return this;
    }
    /**
     * <code>string vehicle_number = 1;</code>
     */
    public Builder setVehicleNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      vehicleNumber_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object vehicleType_ = "";
    /**
     * <code>string vehicle_type = 2;</code>
     */
    public java.lang.String getVehicleType() {
      java.lang.Object ref = vehicleType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vehicleType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string vehicle_type = 2;</code>
     */
    public com.google.protobuf.ByteString
        getVehicleTypeBytes() {
      java.lang.Object ref = vehicleType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vehicleType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string vehicle_type = 2;</code>
     */
    public Builder setVehicleType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      vehicleType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string vehicle_type = 2;</code>
     */
    public Builder clearVehicleType() {
      
      vehicleType_ = getDefaultInstance().getVehicleType();
      onChanged();
      return this;
    }
    /**
     * <code>string vehicle_type = 2;</code>
     */
    public Builder setVehicleTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      vehicleType_ = value;
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


    // @@protoc_insertion_point(builder_scope:org.sample.park.autogenerated.Vehicle)
  }

  // @@protoc_insertion_point(class_scope:org.sample.park.autogenerated.Vehicle)
  private static final org.sample.park.autogenerated.Vehicle DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.sample.park.autogenerated.Vehicle();
  }

  public static org.sample.park.autogenerated.Vehicle getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Vehicle>
      PARSER = new com.google.protobuf.AbstractParser<Vehicle>() {
    public Vehicle parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Vehicle(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Vehicle> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Vehicle> getParserForType() {
    return PARSER;
  }

  public org.sample.park.autogenerated.Vehicle getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

