/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.yellowcab;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * All binding information taken from: http://taxii.mitre.org/specifications/version1.1/TAXII_Services_Specification.pdf
 * 
 */
public enum MessageStatusType implements org.apache.thrift.TEnum {
  /**
   * This is used to indicate that a Producer encountered an unexpected error
   * when creating a result set under Asynchronous Polling. (See Section 3.6.2.)
   * As a result, the result set in question is not going to be available to the
   * Consumer.
   */
  ASYNCHRONOUS_POLL_ERROR(0),
  /**
   * The message sent could not be interpreted by the TAXII Daemon (e.g., it
   * was malformed and could not be parsed).
   */
  BAD_MESSAGE(1),
  /**
   * This is used in cases where the TAXII Client's action is being denied for
   * reasons other than a failure to provide appropriate authentication
   * credentials. For example, a Collection Management Service might limit the
   * number of subscriptions a given Consumer is allowed to create. In this case,
   * if a Consumer attempts to create a too many subscriptions, a TAXII
   * Daemon might send a Status Message of type "Denied".
   */
  DENIED(2),
  /**
   * This is used to indicate a problem with the use of the Destination Collection
   * Name field in an Inbox Message. It can indicate either that:
   *  The recipient of an Inbox Message requires that the sender indicate
   * a Destination Collection Name, but the Inbox Message did not do
   * so.
   *  The recipient of an Inbox Message prohibits the sender from
   * dictating a Destination Collection Name, but the Inbox Message
   * had one or more Destination Collection Name fields.
   * See Section 3.2.1 for more on pushing content to Data Collections.
   * 
   */
  DESTINATION_COLLECTION_ERROR(3),
  /**
   * A general indication of failure. This might indicate some problem that does
   * not have a defined Status Type, but MAY also be sent in place of any other
   * TAXII Status Messages if a TAXII Daemon does not wish to disclose details
   * for the failure of a request.
   * 
   */
  FAILURE(4),
  /**
   * This Status Type is sent in response to a Poll Fulfillment Request that
   * requests a particular Result Part Number but the result has fewer than that
   * number of parts.
   */
  INVALID_RESPONSE_PART(5),
  /**
   * This Status Type is sent in response to a Poll Fulfillment Request that
   * requests a particular Result Part Number but the result has fewer than that
   * number of parts.
   */
  NETWORK_ERROR(6),
  /**
   * The request named a target (e.g., a TAXII Data Collection name) that does
   * not exist on the TAXII Daemon.
   * 
   */
  NOT_FOUND(7),
  /**
   * This is sent in response to a Poll Request to indicate that the requested
   * results will be provided at a later time (rather than in a direct Poll
   * Response). It is primarily used in cases where the Poll Request takes more
   * time to process than allowed by the underlying protocol but the Producer
   * still intends to create a result set and make it available.
   * 
   */
  PENDING(8),
  /**
   * The requester attempted to create a subscription where the requester only
   * polls for content, but the associated TAXII Data Collection is not available to
   * the requester via polling.
   */
  POLLING_NOT_SUPPORTED(9),
  /**
   * The request cannot be performed at the current time but may be possible
   * in the future. The requested action will not occur until and unless the
   * request is repeated.
   * 
   */
  RETRY(10),
  /**
   * The message sent was interpreted by the TAXII Daemon and the requested
   * action was completed successfully. Note that some request messages have
   * a corresponding response message used to indicate successful completion
   * of a request. In these cases, that response message MUST be used instead
   * of sending a Status Message of type "Success".
   */
  SUCCESS(11),
  /**
   * The requested activity requires authentication, but either the TAXII Client
   * did not provide authentication or their authenticated identity did not have
   * appropriate access rights. (Note that any authentication credentials are
   * provided at the protocol level rather than as part of a TAXII Message.)
   * 
   */
  UNAUTHORIZED(12),
  /**
   * The requester identified a set of content bindings to be used in the
   * fulfillment of its request, but none of those content bindings are supported
   * for the requested action.
   * 
   */
  UNSUPPORTED_CONTENT_BINDING(13),
  /**
   * The requester identified a set of message bindings to be used in the
   * fulfillment of its request, but none of those message bindings are
   * supported for the requested action.
   * 
   */
  UNSUPPORTED_MESSAGE_BINDING(14),
  /**
   * The requester identified a set of protocol bindings to be used in the
   * fulfillment of its request, but none of
   */
  UNSUPPORTED_PROTOCOL_BINDING(15),
  /**
   * The requester included a Query expression, but the format of the Query
   * Expression was not supported (or the receiving Service does not support
   * Query.)
   * 
   */
  UNSUPPORTED_QUERY_FORMAT(16);

  private final int value;

  private MessageStatusType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static MessageStatusType findByValue(int value) { 
    switch (value) {
      case 0:
        return ASYNCHRONOUS_POLL_ERROR;
      case 1:
        return BAD_MESSAGE;
      case 2:
        return DENIED;
      case 3:
        return DESTINATION_COLLECTION_ERROR;
      case 4:
        return FAILURE;
      case 5:
        return INVALID_RESPONSE_PART;
      case 6:
        return NETWORK_ERROR;
      case 7:
        return NOT_FOUND;
      case 8:
        return PENDING;
      case 9:
        return POLLING_NOT_SUPPORTED;
      case 10:
        return RETRY;
      case 11:
        return SUCCESS;
      case 12:
        return UNAUTHORIZED;
      case 13:
        return UNSUPPORTED_CONTENT_BINDING;
      case 14:
        return UNSUPPORTED_MESSAGE_BINDING;
      case 15:
        return UNSUPPORTED_PROTOCOL_BINDING;
      case 16:
        return UNSUPPORTED_QUERY_FORMAT;
      default:
        return null;
    }
  }
}
