/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.yellowcab;

import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents the header of a standard TAXII message
 * 
 */
public class TAXIIHeader implements org.apache.thrift.TBase<TAXIIHeader, TAXIIHeader._Fields>, java.io.Serializable, Cloneable, Comparable<TAXIIHeader> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAXIIHeader");

  private static final org.apache.thrift.protocol.TField MESSAGE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("messageId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField MESSAGE_BODY_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("messageBodyType", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField IN_RESPONSE_TO_FIELD_DESC = new org.apache.thrift.protocol.TField("inResponseTo", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField EXTENDED_HEADERS_FIELD_DESC = new org.apache.thrift.protocol.TField("extendedHeaders", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField SIGNATURE_FIELD_DESC = new org.apache.thrift.protocol.TField("signature", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TAXIIHeaderStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TAXIIHeaderTupleSchemeFactory());
  }

  public String messageId; // required
  /**
   * * The type of the TAXII Message. Only identifiers for defined
   *   TAXII Messages, as defined in Section 4.4, are allowed in this
   *   field. (I.e., third parties MUST NOT define their own TAXII
   *   Message Body Types.)
   * *
   * 
   * @see MessageBodyType
   */
  public MessageBodyType messageBodyType; // required
  /**
   * * Contains the Message ID of the message to which this is a
   *   response, if this message is a response.
   * *
   */
  public String inResponseTo; // optional
  /**
   * * Third parties MAY define their own additional header fields.
   *   Extended-Header fields that are not recognized by a recipient
   *   SHOULD be ignored. Requirements for Extended-Header fields
   *   are listed in Section 4.1.5
   * *
   */
  public List<String> extendedHeaders; // optional
  /**
   *  This field contains a cryptographic signature for this TAXII
   *   Message. The scope of this signature is the entire TAXII
   *   Message (i.e., Signatures contained in this field can sign all or
   *   any parts of the TAXII Message). Details for how a signature is
   *   expressed are covered in each TAXII Message Binding
   *   Specification.
   * *
   */
  public String signature; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MESSAGE_ID((short)1, "messageId"),
    /**
     * * The type of the TAXII Message. Only identifiers for defined
     *   TAXII Messages, as defined in Section 4.4, are allowed in this
     *   field. (I.e., third parties MUST NOT define their own TAXII
     *   Message Body Types.)
     * *
     * 
     * @see MessageBodyType
     */
    MESSAGE_BODY_TYPE((short)2, "messageBodyType"),
    /**
     * * Contains the Message ID of the message to which this is a
     *   response, if this message is a response.
     * *
     */
    IN_RESPONSE_TO((short)3, "inResponseTo"),
    /**
     * * Third parties MAY define their own additional header fields.
     *   Extended-Header fields that are not recognized by a recipient
     *   SHOULD be ignored. Requirements for Extended-Header fields
     *   are listed in Section 4.1.5
     * *
     */
    EXTENDED_HEADERS((short)4, "extendedHeaders"),
    /**
     *  This field contains a cryptographic signature for this TAXII
     *   Message. The scope of this signature is the entire TAXII
     *   Message (i.e., Signatures contained in this field can sign all or
     *   any parts of the TAXII Message). Details for how a signature is
     *   expressed are covered in each TAXII Message Binding
     *   Specification.
     * *
     */
    SIGNATURE((short)5, "signature");

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
        case 1: // MESSAGE_ID
          return MESSAGE_ID;
        case 2: // MESSAGE_BODY_TYPE
          return MESSAGE_BODY_TYPE;
        case 3: // IN_RESPONSE_TO
          return IN_RESPONSE_TO;
        case 4: // EXTENDED_HEADERS
          return EXTENDED_HEADERS;
        case 5: // SIGNATURE
          return SIGNATURE;
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
  private _Fields optionals[] = {_Fields.IN_RESPONSE_TO,_Fields.EXTENDED_HEADERS,_Fields.SIGNATURE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MESSAGE_ID, new org.apache.thrift.meta_data.FieldMetaData("messageId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MESSAGE_BODY_TYPE, new org.apache.thrift.meta_data.FieldMetaData("messageBodyType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, MessageBodyType.class)));
    tmpMap.put(_Fields.IN_RESPONSE_TO, new org.apache.thrift.meta_data.FieldMetaData("inResponseTo", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXTENDED_HEADERS, new org.apache.thrift.meta_data.FieldMetaData("extendedHeaders", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.SIGNATURE, new org.apache.thrift.meta_data.FieldMetaData("signature", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAXIIHeader.class, metaDataMap);
  }

  public TAXIIHeader() {
  }

  public TAXIIHeader(
    String messageId,
    MessageBodyType messageBodyType)
  {
    this();
    this.messageId = messageId;
    this.messageBodyType = messageBodyType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TAXIIHeader(TAXIIHeader other) {
    if (other.isSetMessageId()) {
      this.messageId = other.messageId;
    }
    if (other.isSetMessageBodyType()) {
      this.messageBodyType = other.messageBodyType;
    }
    if (other.isSetInResponseTo()) {
      this.inResponseTo = other.inResponseTo;
    }
    if (other.isSetExtendedHeaders()) {
      List<String> __this__extendedHeaders = new ArrayList<String>(other.extendedHeaders);
      this.extendedHeaders = __this__extendedHeaders;
    }
    if (other.isSetSignature()) {
      this.signature = other.signature;
    }
  }

  public TAXIIHeader deepCopy() {
    return new TAXIIHeader(this);
  }

  @Override
  public void clear() {
    this.messageId = null;
    this.messageBodyType = null;
    this.inResponseTo = null;
    this.extendedHeaders = null;
    this.signature = null;
  }

  public String getMessageId() {
    return this.messageId;
  }

  public TAXIIHeader setMessageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  public void unsetMessageId() {
    this.messageId = null;
  }

  /** Returns true if field messageId is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageId() {
    return this.messageId != null;
  }

  public void setMessageIdIsSet(boolean value) {
    if (!value) {
      this.messageId = null;
    }
  }

  /**
   * * The type of the TAXII Message. Only identifiers for defined
   *   TAXII Messages, as defined in Section 4.4, are allowed in this
   *   field. (I.e., third parties MUST NOT define their own TAXII
   *   Message Body Types.)
   * *
   * 
   * @see MessageBodyType
   */
  public MessageBodyType getMessageBodyType() {
    return this.messageBodyType;
  }

  /**
   * * The type of the TAXII Message. Only identifiers for defined
   *   TAXII Messages, as defined in Section 4.4, are allowed in this
   *   field. (I.e., third parties MUST NOT define their own TAXII
   *   Message Body Types.)
   * *
   * 
   * @see MessageBodyType
   */
  public TAXIIHeader setMessageBodyType(MessageBodyType messageBodyType) {
    this.messageBodyType = messageBodyType;
    return this;
  }

  public void unsetMessageBodyType() {
    this.messageBodyType = null;
  }

  /** Returns true if field messageBodyType is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageBodyType() {
    return this.messageBodyType != null;
  }

  public void setMessageBodyTypeIsSet(boolean value) {
    if (!value) {
      this.messageBodyType = null;
    }
  }

  /**
   * * Contains the Message ID of the message to which this is a
   *   response, if this message is a response.
   * *
   */
  public String getInResponseTo() {
    return this.inResponseTo;
  }

  /**
   * * Contains the Message ID of the message to which this is a
   *   response, if this message is a response.
   * *
   */
  public TAXIIHeader setInResponseTo(String inResponseTo) {
    this.inResponseTo = inResponseTo;
    return this;
  }

  public void unsetInResponseTo() {
    this.inResponseTo = null;
  }

  /** Returns true if field inResponseTo is set (has been assigned a value) and false otherwise */
  public boolean isSetInResponseTo() {
    return this.inResponseTo != null;
  }

  public void setInResponseToIsSet(boolean value) {
    if (!value) {
      this.inResponseTo = null;
    }
  }

  public int getExtendedHeadersSize() {
    return (this.extendedHeaders == null) ? 0 : this.extendedHeaders.size();
  }

  public java.util.Iterator<String> getExtendedHeadersIterator() {
    return (this.extendedHeaders == null) ? null : this.extendedHeaders.iterator();
  }

  public void addToExtendedHeaders(String elem) {
    if (this.extendedHeaders == null) {
      this.extendedHeaders = new ArrayList<String>();
    }
    this.extendedHeaders.add(elem);
  }

  /**
   * * Third parties MAY define their own additional header fields.
   *   Extended-Header fields that are not recognized by a recipient
   *   SHOULD be ignored. Requirements for Extended-Header fields
   *   are listed in Section 4.1.5
   * *
   */
  public List<String> getExtendedHeaders() {
    return this.extendedHeaders;
  }

  /**
   * * Third parties MAY define their own additional header fields.
   *   Extended-Header fields that are not recognized by a recipient
   *   SHOULD be ignored. Requirements for Extended-Header fields
   *   are listed in Section 4.1.5
   * *
   */
  public TAXIIHeader setExtendedHeaders(List<String> extendedHeaders) {
    this.extendedHeaders = extendedHeaders;
    return this;
  }

  public void unsetExtendedHeaders() {
    this.extendedHeaders = null;
  }

  /** Returns true if field extendedHeaders is set (has been assigned a value) and false otherwise */
  public boolean isSetExtendedHeaders() {
    return this.extendedHeaders != null;
  }

  public void setExtendedHeadersIsSet(boolean value) {
    if (!value) {
      this.extendedHeaders = null;
    }
  }

  /**
   *  This field contains a cryptographic signature for this TAXII
   *   Message. The scope of this signature is the entire TAXII
   *   Message (i.e., Signatures contained in this field can sign all or
   *   any parts of the TAXII Message). Details for how a signature is
   *   expressed are covered in each TAXII Message Binding
   *   Specification.
   * *
   */
  public String getSignature() {
    return this.signature;
  }

  /**
   *  This field contains a cryptographic signature for this TAXII
   *   Message. The scope of this signature is the entire TAXII
   *   Message (i.e., Signatures contained in this field can sign all or
   *   any parts of the TAXII Message). Details for how a signature is
   *   expressed are covered in each TAXII Message Binding
   *   Specification.
   * *
   */
  public TAXIIHeader setSignature(String signature) {
    this.signature = signature;
    return this;
  }

  public void unsetSignature() {
    this.signature = null;
  }

  /** Returns true if field signature is set (has been assigned a value) and false otherwise */
  public boolean isSetSignature() {
    return this.signature != null;
  }

  public void setSignatureIsSet(boolean value) {
    if (!value) {
      this.signature = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MESSAGE_ID:
      if (value == null) {
        unsetMessageId();
      } else {
        setMessageId((String)value);
      }
      break;

    case MESSAGE_BODY_TYPE:
      if (value == null) {
        unsetMessageBodyType();
      } else {
        setMessageBodyType((MessageBodyType)value);
      }
      break;

    case IN_RESPONSE_TO:
      if (value == null) {
        unsetInResponseTo();
      } else {
        setInResponseTo((String)value);
      }
      break;

    case EXTENDED_HEADERS:
      if (value == null) {
        unsetExtendedHeaders();
      } else {
        setExtendedHeaders((List<String>)value);
      }
      break;

    case SIGNATURE:
      if (value == null) {
        unsetSignature();
      } else {
        setSignature((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MESSAGE_ID:
      return getMessageId();

    case MESSAGE_BODY_TYPE:
      return getMessageBodyType();

    case IN_RESPONSE_TO:
      return getInResponseTo();

    case EXTENDED_HEADERS:
      return getExtendedHeaders();

    case SIGNATURE:
      return getSignature();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MESSAGE_ID:
      return isSetMessageId();
    case MESSAGE_BODY_TYPE:
      return isSetMessageBodyType();
    case IN_RESPONSE_TO:
      return isSetInResponseTo();
    case EXTENDED_HEADERS:
      return isSetExtendedHeaders();
    case SIGNATURE:
      return isSetSignature();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TAXIIHeader)
      return this.equals((TAXIIHeader)that);
    return false;
  }

  public boolean equals(TAXIIHeader that) {
    if (that == null)
      return false;

    boolean this_present_messageId = true && this.isSetMessageId();
    boolean that_present_messageId = true && that.isSetMessageId();
    if (this_present_messageId || that_present_messageId) {
      if (!(this_present_messageId && that_present_messageId))
        return false;
      if (!this.messageId.equals(that.messageId))
        return false;
    }

    boolean this_present_messageBodyType = true && this.isSetMessageBodyType();
    boolean that_present_messageBodyType = true && that.isSetMessageBodyType();
    if (this_present_messageBodyType || that_present_messageBodyType) {
      if (!(this_present_messageBodyType && that_present_messageBodyType))
        return false;
      if (!this.messageBodyType.equals(that.messageBodyType))
        return false;
    }

    boolean this_present_inResponseTo = true && this.isSetInResponseTo();
    boolean that_present_inResponseTo = true && that.isSetInResponseTo();
    if (this_present_inResponseTo || that_present_inResponseTo) {
      if (!(this_present_inResponseTo && that_present_inResponseTo))
        return false;
      if (!this.inResponseTo.equals(that.inResponseTo))
        return false;
    }

    boolean this_present_extendedHeaders = true && this.isSetExtendedHeaders();
    boolean that_present_extendedHeaders = true && that.isSetExtendedHeaders();
    if (this_present_extendedHeaders || that_present_extendedHeaders) {
      if (!(this_present_extendedHeaders && that_present_extendedHeaders))
        return false;
      if (!this.extendedHeaders.equals(that.extendedHeaders))
        return false;
    }

    boolean this_present_signature = true && this.isSetSignature();
    boolean that_present_signature = true && that.isSetSignature();
    if (this_present_signature || that_present_signature) {
      if (!(this_present_signature && that_present_signature))
        return false;
      if (!this.signature.equals(that.signature))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(TAXIIHeader other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMessageId()).compareTo(other.isSetMessageId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.messageId, other.messageId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessageBodyType()).compareTo(other.isSetMessageBodyType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageBodyType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.messageBodyType, other.messageBodyType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInResponseTo()).compareTo(other.isSetInResponseTo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInResponseTo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.inResponseTo, other.inResponseTo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExtendedHeaders()).compareTo(other.isSetExtendedHeaders());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExtendedHeaders()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.extendedHeaders, other.extendedHeaders);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSignature()).compareTo(other.isSetSignature());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSignature()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.signature, other.signature);
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
    StringBuilder sb = new StringBuilder("TAXIIHeader(");
    boolean first = true;

    sb.append("messageId:");
    if (this.messageId == null) {
      sb.append("null");
    } else {
      sb.append(this.messageId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("messageBodyType:");
    if (this.messageBodyType == null) {
      sb.append("null");
    } else {
      sb.append(this.messageBodyType);
    }
    first = false;
    if (isSetInResponseTo()) {
      if (!first) sb.append(", ");
      sb.append("inResponseTo:");
      if (this.inResponseTo == null) {
        sb.append("null");
      } else {
        sb.append(this.inResponseTo);
      }
      first = false;
    }
    if (isSetExtendedHeaders()) {
      if (!first) sb.append(", ");
      sb.append("extendedHeaders:");
      if (this.extendedHeaders == null) {
        sb.append("null");
      } else {
        sb.append(this.extendedHeaders);
      }
      first = false;
    }
    if (isSetSignature()) {
      if (!first) sb.append(", ");
      sb.append("signature:");
      if (this.signature == null) {
        sb.append("null");
      } else {
        sb.append(this.signature);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (messageId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'messageId' was not present! Struct: " + toString());
    }
    if (messageBodyType == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'messageBodyType' was not present! Struct: " + toString());
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

  private static class TAXIIHeaderStandardSchemeFactory implements SchemeFactory {
    public TAXIIHeaderStandardScheme getScheme() {
      return new TAXIIHeaderStandardScheme();
    }
  }

  private static class TAXIIHeaderStandardScheme extends StandardScheme<TAXIIHeader> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TAXIIHeader struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MESSAGE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.messageId = iprot.readString();
              struct.setMessageIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MESSAGE_BODY_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.messageBodyType = MessageBodyType.findByValue(iprot.readI32());
              struct.setMessageBodyTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IN_RESPONSE_TO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.inResponseTo = iprot.readString();
              struct.setInResponseToIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EXTENDED_HEADERS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.extendedHeaders = new ArrayList<String>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  String _elem2;
                  _elem2 = iprot.readString();
                  struct.extendedHeaders.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setExtendedHeadersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SIGNATURE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.signature = iprot.readString();
              struct.setSignatureIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TAXIIHeader struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.messageId != null) {
        oprot.writeFieldBegin(MESSAGE_ID_FIELD_DESC);
        oprot.writeString(struct.messageId);
        oprot.writeFieldEnd();
      }
      if (struct.messageBodyType != null) {
        oprot.writeFieldBegin(MESSAGE_BODY_TYPE_FIELD_DESC);
        oprot.writeI32(struct.messageBodyType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.inResponseTo != null) {
        if (struct.isSetInResponseTo()) {
          oprot.writeFieldBegin(IN_RESPONSE_TO_FIELD_DESC);
          oprot.writeString(struct.inResponseTo);
          oprot.writeFieldEnd();
        }
      }
      if (struct.extendedHeaders != null) {
        if (struct.isSetExtendedHeaders()) {
          oprot.writeFieldBegin(EXTENDED_HEADERS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.extendedHeaders.size()));
            for (String _iter3 : struct.extendedHeaders)
            {
              oprot.writeString(_iter3);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.signature != null) {
        if (struct.isSetSignature()) {
          oprot.writeFieldBegin(SIGNATURE_FIELD_DESC);
          oprot.writeString(struct.signature);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TAXIIHeaderTupleSchemeFactory implements SchemeFactory {
    public TAXIIHeaderTupleScheme getScheme() {
      return new TAXIIHeaderTupleScheme();
    }
  }

  private static class TAXIIHeaderTupleScheme extends TupleScheme<TAXIIHeader> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TAXIIHeader struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.messageId);
      oprot.writeI32(struct.messageBodyType.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetInResponseTo()) {
        optionals.set(0);
      }
      if (struct.isSetExtendedHeaders()) {
        optionals.set(1);
      }
      if (struct.isSetSignature()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetInResponseTo()) {
        oprot.writeString(struct.inResponseTo);
      }
      if (struct.isSetExtendedHeaders()) {
        {
          oprot.writeI32(struct.extendedHeaders.size());
          for (String _iter4 : struct.extendedHeaders)
          {
            oprot.writeString(_iter4);
          }
        }
      }
      if (struct.isSetSignature()) {
        oprot.writeString(struct.signature);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TAXIIHeader struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.messageId = iprot.readString();
      struct.setMessageIdIsSet(true);
      struct.messageBodyType = MessageBodyType.findByValue(iprot.readI32());
      struct.setMessageBodyTypeIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.inResponseTo = iprot.readString();
        struct.setInResponseToIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.extendedHeaders = new ArrayList<String>(_list5.size);
          for (int _i6 = 0; _i6 < _list5.size; ++_i6)
          {
            String _elem7;
            _elem7 = iprot.readString();
            struct.extendedHeaders.add(_elem7);
          }
        }
        struct.setExtendedHeadersIsSet(true);
      }
      if (incoming.get(2)) {
        struct.signature = iprot.readString();
        struct.setSignatureIsSet(true);
      }
    }
  }

}

