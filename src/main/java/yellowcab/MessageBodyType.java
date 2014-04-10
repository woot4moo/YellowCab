/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package yellowcab;


/**
 * Represents the TAXII specific message body types.
 * 
 */
public enum MessageBodyType implements org.apache.thrift.TEnum {
  /**
   *   This message is sent to a Collection Management Service to request information about the available
   *   TAXII Data Collections. The body of this message is empty.
   * *
   */
  COLLECTION_INFORMATION_REQUEST(0),
  /**
   *   This message is sent in response to a TAXII Collection Information Request if the request is successful. If
   *   there is an error condition, a TAXII Status Message indicating the nature of the error is sent instead.
   *   Note that the Producer is under no obligation to list all Collections and can exclude any or all Collections
   *   from this response for any reason. For example, the Producer might wish to exclude Collections created
   *   for a specific customer from a list of all Collections. As such, different requesters might be given
   *   different lists of Collections to their requests to the same Collection Management Service.
   * *
   */
  COLLECTION_INFORMATION_RESPONSE(1),
  /**
   *  This message is sent to a Discovery Service to request information about provided TAXII Services. Such
   *  information includes what TAXII Services are offered, how the TAXII Daemons that support those
   *  Services can be accessed, and what protocols and message bindings are supported. The body of this
   *  message is empty.
   * *
   */
  DISCOVERY_REQUEST(2),
  /**
   *  This message is sent from a Discovery Service in response to a TAXII Discovery Request if the request is
   *  successful. If there is an error condition, a TAXII Status Message indicating the nature of the error is sent
   *  instead.
   * *
   */
  DISCOVERY_RESPONSE(3),
  /**
   *  A TAXII Inbox Message is used to push content from one entity to the TAXII Inbox Service of another
   *  entity.
   * *
   */
  INBOX_MESSAGE(4),
  /**
   *  This message is used to establish a new subscription or manage an existing subscription. The Collection
   *  Management Service responds with a TAXII Manage Collection Subscription Response if the request is
   *  successful and will be honored or with a TAXII Status Message if the request is being rejected or there
   *  was an error.
   * *
   */
  MANAGE_COLLECTION_SUBSCRIPTION_REQUEST(5),
  /**
   *  This message is returned in response to a TAXII Manage Collection Request Message if the requested
   *  action was successfully completed.
   * *
   */
  MANAGE_COLLECTION_SUBSCRIPTION_RESPONSE(6),
  /**
   *  The TAXII Poll Fulfillment Request is used to collect results from a Poll Service where the result set has
   *  already been created. In general, this is used to collect results using Asynchronous Polling (see Section
   *  3.6.2) or to collect multiple parts of a large result set over a Multi-Part Poll Exchange (see Section 3.6.1).
   * *
   */
  POLL_FULFILLMENT_REQUEST(7),
  /**
   *  This message is sent from a Consumer to a TAXII Poll Service to request that data from the TAXII Data
   *  Collection be returned to the Consumer. Poll Requests are always made against a specific TAXII Data
   *  Collection. Whether or not the Consumer needs an established subscription to that TAXII Data Collection
   *  in order to receive content is left to the Producer and can vary across Data Collections.
   * *
   */
  POLL_REQUEST(8),
  /**
   *  This message is sent from a Consumer to a TAXII Poll Service to request that data from the TAXII Data
   *  Collection be returned to the Consumer. Poll Requests are always made against a specific TAXII Data
   *  Collection. Whether or not the Consumer needs an established subscription to that TAXII Data Collection
   *  in order to receive content is left to the Producer and can vary across Data Collections.
   * *
   */
  POLL_RESPONSE(9),
  /**
   *  A TAXII Status Message is used to indicate a condition of success or error. Status Messages are always
   *   sent from a TAXII Daemon to a TAXII Client in response to a TAXII Message. A TAXII Status Message can
   *   be used to indicate that an error occurred when processing a received TAXII Message. Error conditions
   *   can occur because the request itself was invalid or because the recipient was unwilling or unable to
   *   honor the request. The Status Message is also used in the Inbox Exchange (see Section 3.2) to indicate
   *   successful reception of an Inbox Message or for Asynchronous Polling (see Section 3.6.2) to indicate a
   *   Poll Request will be fulfilled at a later time.
   * *
   */
  STATUS(10);

  private final int value;

  private MessageBodyType(int value) {
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
  public static MessageBodyType findByValue(int value) { 
    switch (value) {
      case 0:
        return COLLECTION_INFORMATION_REQUEST;
      case 1:
        return COLLECTION_INFORMATION_RESPONSE;
      case 2:
        return DISCOVERY_REQUEST;
      case 3:
        return DISCOVERY_RESPONSE;
      case 4:
        return INBOX_MESSAGE;
      case 5:
        return MANAGE_COLLECTION_SUBSCRIPTION_REQUEST;
      case 6:
        return MANAGE_COLLECTION_SUBSCRIPTION_RESPONSE;
      case 7:
        return POLL_FULFILLMENT_REQUEST;
      case 8:
        return POLL_REQUEST;
      case 9:
        return POLL_RESPONSE;
      case 10:
        return STATUS;
      default:
        return null;
    }
  }
}
