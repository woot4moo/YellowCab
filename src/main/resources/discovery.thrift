namespace java com.yellowcab
namespace py com.yellowcab

/**
* Represents a service that can be discovered
**/
struct Service{
    1: required string serviceName;
    2: required string address;
    3: required i16 port;
    4: required bool isActive;
}

/**
* Represents the TAXII specific message body types.
**/
enum MessageBodyType{

    /**
      This message is sent to a Collection Management Service to request information about the available
      TAXII Data Collections. The body of this message is empty.
    **/
    COLLECTION_INFORMATION_REQUEST,
    /**
      This message is sent in response to a TAXII Collection Information Request if the request is successful. If
      there is an error condition, a TAXII Status Message indicating the nature of the error is sent instead.
      Note that the Producer is under no obligation to list all Collections and can exclude any or all Collections
      from this response for any reason. For example, the Producer might wish to exclude Collections created
      for a specific customer from a list of all Collections. As such, different requesters might be given
      different lists of Collections to their requests to the same Collection Management Service.
    **/
    COLLECTION_INFORMATION_RESPONSE,
   /**
     This message is sent to a Discovery Service to request information about provided TAXII Services. Such
     information includes what TAXII Services are offered, how the TAXII Daemons that support those
     Services can be accessed, and what protocols and message bindings are supported. The body of this
     message is empty.
    **/
   DISCOVERY_REQUEST,
   /**
     This message is sent from a Discovery Service in response to a TAXII Discovery Request if the request is
     successful. If there is an error condition, a TAXII Status Message indicating the nature of the error is sent
     instead.
    **/
   DISCOVERY_RESPONSE,
   /**
     A TAXII Inbox Message is used to push content from one entity to the TAXII Inbox Service of another
     entity.
    **/
   INBOX_MESSAGE,
   /**
     This message is used to establish a new subscription or manage an existing subscription. The Collection
     Management Service responds with a TAXII Manage Collection Subscription Response if the request is
     successful and will be honored or with a TAXII Status Message if the request is being rejected or there
     was an error.
    **/
   MANAGE_COLLECTION_SUBSCRIPTION_REQUEST,
   /**
     This message is returned in response to a TAXII Manage Collection Request Message if the requested
     action was successfully completed.
    **/
   MANAGE_COLLECTION_SUBSCRIPTION_RESPONSE,
   /**
     The TAXII Poll Fulfillment Request is used to collect results from a Poll Service where the result set has
     already been created. In general, this is used to collect results using Asynchronous Polling (see Section
     3.6.2) or to collect multiple parts of a large result set over a Multi-Part Poll Exchange (see Section 3.6.1).
    **/
   POLL_FULFILLMENT_REQUEST,
   /**
     This message is sent from a Consumer to a TAXII Poll Service to request that data from the TAXII Data
     Collection be returned to the Consumer. Poll Requests are always made against a specific TAXII Data
     Collection. Whether or not the Consumer needs an established subscription to that TAXII Data Collection
     in order to receive content is left to the Producer and can vary across Data Collections.
    **/
   POLL_REQUEST,
   /**
     This message is sent from a Consumer to a TAXII Poll Service to request that data from the TAXII Data
     Collection be returned to the Consumer. Poll Requests are always made against a specific TAXII Data
     Collection. Whether or not the Consumer needs an established subscription to that TAXII Data Collection
     in order to receive content is left to the Producer and can vary across Data Collections.
    **/
   POLL_RESPONSE,
   /**
     A TAXII Status Message is used to indicate a condition of success or error. Status Messages are always
     sent from a TAXII Daemon to a TAXII Client in response to a TAXII Message. A TAXII Status Message can
     be used to indicate that an error occurred when processing a received TAXII Message. Error conditions
     can occur because the request itself was invalid or because the recipient was unwilling or unable to
     honor the request. The Status Message is also used in the Inbox Exchange (see Section 3.2) to indicate
     successful reception of an Inbox Message or for Asynchronous Polling (see Section 3.6.2) to indicate a
     Poll Request will be fulfilled at a later time.
   **/
   STATUS

}

/**
* Represents a message that is TAXII compliant.
**/
struct Message{
    1: required string id;
    2: required string inResponseTo;
}

/**
* Response detail types for MessageStatusType
**/
struct MessageStatusDetail{
    1: required string key;
    2: required string value;
}

/**
* All binding information taken from: http://taxii.mitre.org/specifications/version1.1/TAXII_Services_Specification.pdf
**/
enum MessageStatusType{

    /**
    This is used to indicate that a Producer encountered an unexpected error
    when creating a result set under Asynchronous Polling. (See Section 3.6.2.)
    As a result, the result set in question is not going to be available to the
    Consumer.
     */
    ASYNCHRONOUS_POLL_ERROR,
    /**
    The message sent could not be interpreted by the TAXII Daemon (e.g., it
    was malformed and could not be parsed).
     */
    BAD_MESSAGE,
    /**
      This is used in cases where the TAXII Client's action is being denied for
      reasons other than a failure to provide appropriate authentication
      credentials. For example, a Collection Management Service might limit the
      number of subscriptions a given Consumer is allowed to create. In this case,
      if a Consumer attempts to create a too many subscriptions, a TAXII
      Daemon might send a Status Message of type "Denied".
     */
    DENIED,
    /**
    This is used to indicate a problem with the use of the Destination Collection
    Name field in an Inbox Message. It can indicate either that:
     The recipient of an Inbox Message requires that the sender indicate
    a Destination Collection Name, but the Inbox Message did not do
    so.
     The recipient of an Inbox Message prohibits the sender from
    dictating a Destination Collection Name, but the Inbox Message
    had one or more Destination Collection Name fields.
    See Section 3.2.1 for more on pushing content to Data Collections.

     */
    DESTINATION_COLLECTION_ERROR,
    /**
    A general indication of failure. This might indicate some problem that does
    not have a defined Status Type, but MAY also be sent in place of any other
    TAXII Status Messages if a TAXII Daemon does not wish to disclose details
    for the failure of a request.

     */
    FAILURE,
    /**
    This Status Type is sent in response to a Poll Fulfillment Request that
    requests a particular Result Part Number but the result has fewer than that
    number of parts.
     */
    INVALID_RESPONSE_PART,
    /**
    This Status Type is sent in response to a Poll Fulfillment Request that
    requests a particular Result Part Number but the result has fewer than that
    number of parts.
     */
    NETWORK_ERROR,
    /**
    The request named a target (e.g., a TAXII Data Collection name) that does
    not exist on the TAXII Daemon.

     */
    NOT_FOUND,
    /**
    This is sent in response to a Poll Request to indicate that the requested
    results will be provided at a later time (rather than in a direct Poll
    Response). It is primarily used in cases where the Poll Request takes more
    time to process than allowed by the underlying protocol but the Producer
    still intends to create a result set and make it available.

     */
    PENDING,
    /**
    The requester attempted to create a subscription where the requester only
    polls for content, but the associated TAXII Data Collection is not available to
    the requester via polling.
     */
    POLLING_NOT_SUPPORTED,
    /**
    The request cannot be performed at the current time but may be possible
    in the future. The requested action will not occur until and unless the
    request is repeated.

     */
    RETRY,
    /**
    The message sent was interpreted by the TAXII Daemon and the requested
    action was completed successfully. Note that some request messages have
    a corresponding response message used to indicate successful completion
    of a request. In these cases, that response message MUST be used instead
    of sending a Status Message of type "Success".
     */
        SUCCESS,
    /**
    The requested activity requires authentication, but either the TAXII Client
    did not provide authentication or their authenticated identity did not have
    appropriate access rights. (Note that any authentication credentials are
    provided at the protocol level rather than as part of a TAXII Message.)

     */
    UNAUTHORIZED,
        /**
        The requester identified a set of content bindings to be used in the
        fulfillment of its request, but none of those content bindings are supported
        for the requested action.

         */
        UNSUPPORTED_CONTENT_BINDING,
    /**
    The requester identified a set of message bindings to be used in the
    fulfillment of its request, but none of those message bindings are
    supported for the requested action.

     */
    UNSUPPORTED_MESSAGE_BINDING,

    /**
    The requester identified a set of protocol bindings to be used in the
    fulfillment of its request, but none of
     */
    UNSUPPORTED_PROTOCOL_BINDING,
    /**
    The requester included a Query expression, but the format of the Query
    Expression was not supported (or the receiving Service does not support
    Query.)

     */
    UNSUPPORTED_QUERY_FORMAT
}

/**
* Represents the status of a message.
**/
struct MessageStatus{
    1: required MessageStatusType status;
    /**
     Additional information for the status. There is no expectation
     that this field be interpretable by a machine; it is instead
     targeted to a human operator.
    **/
    2: optional string description;
    3: required Message message;
    /**
      Additional information for the status. There is no expectation
      that this field be interpretable by a machine; it is instead
      targeted to a human operator.
    **/
    4: required list<MessageStatusDetail> statusDetails;
}

struct StatusMessage{
    1: required MessageStatus messageStatus;
    2: required MessageBodyType bodyType;
}


/**
* A wrapper for TAXII compliant requests
**/
struct TAXIIRequest{
    1: required MessageBodyType messageType;
}

/**
* A wrapper for TAXII compliant requests
**/
struct TAXIIResponse{
    1: required MessageStatusType status;
}

/**
* To be used by the Discovery Daemon requests
**/
struct DiscoveryRequest{
    1: required MessageBodyType messageType = MessageBodyType.DISCOVERY_REQUEST;
}


/**
  If the Discovery Daemon detects an error that prevents processing of the message then it MUST respond with an
  appropriate Status Message indicating that the exchange failed. Otherwise, the Discovery Daemon
  passes the relevant information to its TAXII Back-end. The TAXII Back-end uses this information, along
  with its own access control policy, to create a list of TAXII Services to be returned or determine that the
  request will not be fulfilled. (E.g., the request might be denied due to a lack of authorization on the part
  of the requester.) If the request is honored, a list of TAXII Services is packaged into a Discovery Response
  which is sent back to the TAXII Client. (Not that this list might be 0-length if there are no services the
  requester is permitted to see.) The TAXII Client receives this message and passes the information to its
  own TAXII Back-end for processing. If the Discovery Daemon does not respond with a Discovery
  Response for any reason, the Discovery Daemon MUST respond with a Status Message indicating the
  reason that prevented it from returning a successful response. A TAXII Status Message MUST only be
  returned to indicate an error occurred or that the request was denied
**/
struct DiscoveryResponse{
    1: optional MessageStatusType status;
    2: optional list<Service> allowedServices;
}
/**
 * Responsible for TAXII discovery specification as detailed in section 2.1.1 of
 * http://taxii.mitre.org/specifications/version1.1/TAXII_Services_Specification.pdf
**/
service DiscoveryService{
    set<Service> knownServices(),
    DiscoveryResponse makeRequest(1: DiscoveryRequest request);
}

