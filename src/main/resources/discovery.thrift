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
 * Responsible for TAXII discovery specification as detailed in section 2.1.1 of
 * http://taxii.mitre.org/specifications/version1.1/TAXII_Services_Specification.pdf
**/
service DiscoveryService{
    set<Service> knownServices(),
}
