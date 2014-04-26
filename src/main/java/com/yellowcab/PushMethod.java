/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.yellowcab;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Represents the way that messages are sent out.
 * 
 */
public class PushMethod implements org.apache.thrift.TBase<PushMethod, PushMethod._Fields>, java.io.Serializable, Cloneable, Comparable<PushMethod> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PushMethod");

  private static final org.apache.thrift.protocol.TField PUSH_PROTOCOL_FIELD_DESC = new org.apache.thrift.protocol.TField("pushProtocol", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PUSH_MESSAGE_BINDINGS_FIELD_DESC = new org.apache.thrift.protocol.TField("pushMessageBindings", org.apache.thrift.protocol.TType.SET, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PushMethodStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PushMethodTupleSchemeFactory());
  }

  /**
   * * This field identifies a protocol binding that can be
   *   used by the Producer to push content from this Data
   *   Collection to a Consumer's Inbox Service instance.
   *   This MUST be a TAXII Protocol Binding Version ID as
   *   defined in a TAXII Protocol Binding Specification or by
   *   a third party.
   * *
   */
  public String pushProtocol; // required
  /**
   *     * This field identifies the message bindings that can be
   *       used by the Producer to push content from this Data
   *       Collection to an Inbox Service instance using the
   *       protocol identified in the Push Protocol field. Each
   *       message binding MUST be a TAXII Message Binding
   *       Version ID as defined in a TAXII Message Binding
   *       Specification or by a third party.
   * *
   */
  public Set<String> pushMessageBindings; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * * This field identifies a protocol binding that can be
     *   used by the Producer to push content from this Data
     *   Collection to a Consumer's Inbox Service instance.
     *   This MUST be a TAXII Protocol Binding Version ID as
     *   defined in a TAXII Protocol Binding Specification or by
     *   a third party.
     * *
     */
    PUSH_PROTOCOL((short)1, "pushProtocol"),
    /**
     *     * This field identifies the message bindings that can be
     *       used by the Producer to push content from this Data
     *       Collection to an Inbox Service instance using the
     *       protocol identified in the Push Protocol field. Each
     *       message binding MUST be a TAXII Message Binding
     *       Version ID as defined in a TAXII Message Binding
     *       Specification or by a third party.
     * *
     */
    PUSH_MESSAGE_BINDINGS((short)2, "pushMessageBindings");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PUSH_PROTOCOL
          return PUSH_PROTOCOL;
        case 2: // PUSH_MESSAGE_BINDINGS
          return PUSH_MESSAGE_BINDINGS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PUSH_PROTOCOL, new org.apache.thrift.meta_data.FieldMetaData("pushProtocol", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PUSH_MESSAGE_BINDINGS, new org.apache.thrift.meta_data.FieldMetaData("pushMessageBindings", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PushMethod.class, metaDataMap);
  }

  public PushMethod() {
  }

  public PushMethod(
    String pushProtocol,
    Set<String> pushMessageBindings)
  {
    this();
    this.pushProtocol = pushProtocol;
    this.pushMessageBindings = pushMessageBindings;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PushMethod(PushMethod other) {
    if (other.isSetPushProtocol()) {
      this.pushProtocol = other.pushProtocol;
    }
    if (other.isSetPushMessageBindings()) {
      Set<String> __this__pushMessageBindings = new HashSet<String>(other.pushMessageBindings);
      this.pushMessageBindings = __this__pushMessageBindings;
    }
  }

  public PushMethod deepCopy() {
    return new PushMethod(this);
  }

  @Override
  public void clear() {
    this.pushProtocol = null;
    this.pushMessageBindings = null;
  }

  /**
   * * This field identifies a protocol binding that can be
   *   used by the Producer to push content from this Data
   *   Collection to a Consumer's Inbox Service instance.
   *   This MUST be a TAXII Protocol Binding Version ID as
   *   defined in a TAXII Protocol Binding Specification or by
   *   a third party.
   * *
   */
  public String getPushProtocol() {
    return this.pushProtocol;
  }

  /**
   * * This field identifies a protocol binding that can be
   *   used by the Producer to push content from this Data
   *   Collection to a Consumer's Inbox Service instance.
   *   This MUST be a TAXII Protocol Binding Version ID as
   *   defined in a TAXII Protocol Binding Specification or by
   *   a third party.
   * *
   */
  public PushMethod setPushProtocol(String pushProtocol) {
    this.pushProtocol = pushProtocol;
    return this;
  }

  public void unsetPushProtocol() {
    this.pushProtocol = null;
  }

  /** Returns true if field pushProtocol is set (has been assigned a value) and false otherwise */
  public boolean isSetPushProtocol() {
    return this.pushProtocol != null;
  }

  public void setPushProtocolIsSet(boolean value) {
    if (!value) {
      this.pushProtocol = null;
    }
  }

  public int getPushMessageBindingsSize() {
    return (this.pushMessageBindings == null) ? 0 : this.pushMessageBindings.size();
  }

  public java.util.Iterator<String> getPushMessageBindingsIterator() {
    return (this.pushMessageBindings == null) ? null : this.pushMessageBindings.iterator();
  }

  public void addToPushMessageBindings(String elem) {
    if (this.pushMessageBindings == null) {
      this.pushMessageBindings = new HashSet<String>();
    }
    this.pushMessageBindings.add(elem);
  }

  /**
   *     * This field identifies the message bindings that can be
   *       used by the Producer to push content from this Data
   *       Collection to an Inbox Service instance using the
   *       protocol identified in the Push Protocol field. Each
   *       message binding MUST be a TAXII Message Binding
   *       Version ID as defined in a TAXII Message Binding
   *       Specification or by a third party.
   * *
   */
  public Set<String> getPushMessageBindings() {
    return this.pushMessageBindings;
  }

  /**
   *     * This field identifies the message bindings that can be
   *       used by the Producer to push content from this Data
   *       Collection to an Inbox Service instance using the
   *       protocol identified in the Push Protocol field. Each
   *       message binding MUST be a TAXII Message Binding
   *       Version ID as defined in a TAXII Message Binding
   *       Specification or by a third party.
   * *
   */
  public PushMethod setPushMessageBindings(Set<String> pushMessageBindings) {
    this.pushMessageBindings = pushMessageBindings;
    return this;
  }

  public void unsetPushMessageBindings() {
    this.pushMessageBindings = null;
  }

  /** Returns true if field pushMessageBindings is set (has been assigned a value) and false otherwise */
  public boolean isSetPushMessageBindings() {
    return this.pushMessageBindings != null;
  }

  public void setPushMessageBindingsIsSet(boolean value) {
    if (!value) {
      this.pushMessageBindings = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PUSH_PROTOCOL:
      if (value == null) {
        unsetPushProtocol();
      } else {
        setPushProtocol((String)value);
      }
      break;

    case PUSH_MESSAGE_BINDINGS:
      if (value == null) {
        unsetPushMessageBindings();
      } else {
        setPushMessageBindings((Set<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PUSH_PROTOCOL:
      return getPushProtocol();

    case PUSH_MESSAGE_BINDINGS:
      return getPushMessageBindings();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PUSH_PROTOCOL:
      return isSetPushProtocol();
    case PUSH_MESSAGE_BINDINGS:
      return isSetPushMessageBindings();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PushMethod)
      return this.equals((PushMethod)that);
    return false;
  }

  public boolean equals(PushMethod that) {
    if (that == null)
      return false;

    boolean this_present_pushProtocol = true && this.isSetPushProtocol();
    boolean that_present_pushProtocol = true && that.isSetPushProtocol();
    if (this_present_pushProtocol || that_present_pushProtocol) {
      if (!(this_present_pushProtocol && that_present_pushProtocol))
        return false;
      if (!this.pushProtocol.equals(that.pushProtocol))
        return false;
    }

    boolean this_present_pushMessageBindings = true && this.isSetPushMessageBindings();
    boolean that_present_pushMessageBindings = true && that.isSetPushMessageBindings();
    if (this_present_pushMessageBindings || that_present_pushMessageBindings) {
      if (!(this_present_pushMessageBindings && that_present_pushMessageBindings))
        return false;
      if (!this.pushMessageBindings.equals(that.pushMessageBindings))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(PushMethod other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPushProtocol()).compareTo(other.isSetPushProtocol());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPushProtocol()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pushProtocol, other.pushProtocol);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPushMessageBindings()).compareTo(other.isSetPushMessageBindings());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPushMessageBindings()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pushMessageBindings, other.pushMessageBindings);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("PushMethod(");
    boolean first = true;

    sb.append("pushProtocol:");
    if (this.pushProtocol == null) {
      sb.append("null");
    } else {
      sb.append(this.pushProtocol);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("pushMessageBindings:");
    if (this.pushMessageBindings == null) {
      sb.append("null");
    } else {
      sb.append(this.pushMessageBindings);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (pushProtocol == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'pushProtocol' was not present! Struct: " + toString());
    }
    if (pushMessageBindings == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'pushMessageBindings' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PushMethodStandardSchemeFactory implements SchemeFactory {
    public PushMethodStandardScheme getScheme() {
      return new PushMethodStandardScheme();
    }
  }

  private static class PushMethodStandardScheme extends StandardScheme<PushMethod> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PushMethod struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PUSH_PROTOCOL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pushProtocol = iprot.readString();
              struct.setPushProtocolIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PUSH_MESSAGE_BINDINGS
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set80 = iprot.readSetBegin();
                struct.pushMessageBindings = new HashSet<String>(2*_set80.size);
                for (int _i81 = 0; _i81 < _set80.size; ++_i81)
                {
                  String _elem82;
                  _elem82 = iprot.readString();
                  struct.pushMessageBindings.add(_elem82);
                }
                iprot.readSetEnd();
              }
              struct.setPushMessageBindingsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PushMethod struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.pushProtocol != null) {
        oprot.writeFieldBegin(PUSH_PROTOCOL_FIELD_DESC);
        oprot.writeString(struct.pushProtocol);
        oprot.writeFieldEnd();
      }
      if (struct.pushMessageBindings != null) {
        oprot.writeFieldBegin(PUSH_MESSAGE_BINDINGS_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, struct.pushMessageBindings.size()));
          for (String _iter83 : struct.pushMessageBindings)
          {
            oprot.writeString(_iter83);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PushMethodTupleSchemeFactory implements SchemeFactory {
    public PushMethodTupleScheme getScheme() {
      return new PushMethodTupleScheme();
    }
  }

  private static class PushMethodTupleScheme extends TupleScheme<PushMethod> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PushMethod struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.pushProtocol);
      {
        oprot.writeI32(struct.pushMessageBindings.size());
        for (String _iter84 : struct.pushMessageBindings)
        {
          oprot.writeString(_iter84);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PushMethod struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.pushProtocol = iprot.readString();
      struct.setPushProtocolIsSet(true);
      {
        org.apache.thrift.protocol.TSet _set85 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.pushMessageBindings = new HashSet<String>(2*_set85.size);
        for (int _i86 = 0; _i86 < _set85.size; ++_i86)
        {
          String _elem87;
          _elem87 = iprot.readString();
          struct.pushMessageBindings.add(_elem87);
        }
      }
      struct.setPushMessageBindingsIsSet(true);
    }
  }

}
