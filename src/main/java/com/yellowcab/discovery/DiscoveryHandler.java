package com.yellowcab.discovery;


import com.yellowcab.DiscoveryRequest;
import com.yellowcab.DiscoveryResponse;
import com.yellowcab.DiscoveryService;
import com.yellowcab.InboxServiceContent;
import com.yellowcab.Message;
import com.yellowcab.MessageBodyType;
import com.yellowcab.MessageStatusType;
import com.yellowcab.Query;
import com.yellowcab.ServiceInstance;
import com.yellowcab.ServiceType;
import com.yellowcab.TAXIIHeader;
import org.apache.thrift.TException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *  Responsible for figuring out which services are available.  This is typically
 *  based on permissions in conjunction with heartbeats received from an external
 *  messaging queue.  If a user is not authorized to see a service, it should
 *  not be returned in the set of "known" services.
 *
 *  @see com.yellowcab.Service
 */
public class DiscoveryHandler implements DiscoveryService.Iface{

    private static Set<ServiceInstance> dummyServices = new HashSet<>();
    static{
        Message message1 = new Message("12","14");
        Message message2 = new Message("13","14");
        List<InboxServiceContent> inboxServiceContents = new LinkedList<>();
        inboxServiceContents.add(new InboxServiceContent(new LinkedList<String>()));

        List<Query> queries = new LinkedList<>();
        queries.add(new Query("formatId1","expression"));
        List<String> bindings = new LinkedList<>();
        bindings.add("first");
        bindings.add("second");
        ServiceInstance one = new ServiceInstance(ServiceType.INBOX,"1.0","http","127.0.0.1",bindings);
        one.setInboxServiceAcceptedContents(inboxServiceContents);
        one.setMessage(message1);
        one.setSupportedQueries(queries);
       dummyServices.add(one);
        ServiceInstance two =new ServiceInstance(ServiceType.POLL,"1.0","http","127.0.0.1",bindings);
        two.setMessage(message2);
        dummyServices.add(two);

    }


    @Override
    public Set<ServiceInstance> knownServices() throws TException {
        return dummyServices;
    }

    @Override
    public DiscoveryResponse makeRequest(DiscoveryRequest request) throws TException {
        TAXIIHeader header = new TAXIIHeader("1",MessageBodyType.DISCOVERY_RESPONSE);
        if(!request.getMessageType().equals(MessageBodyType.DISCOVERY_REQUEST)){
            DiscoveryResponse badResponse = new DiscoveryResponse();
            badResponse.setStatus(MessageStatusType.FAILURE);
            badResponse.setHeader(header);
            return badResponse;
        }
        //parse request for validation purposes.
        List<ServiceInstance> serviceList = new ArrayList<>();
        serviceList.addAll(knownServices());
        DiscoveryResponse response = new DiscoveryResponse();
        response.setAllowedServices(serviceList);
        response.setHeader(header);
        return response;
    }


}
