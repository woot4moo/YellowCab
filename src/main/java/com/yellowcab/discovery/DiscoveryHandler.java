package com.yellowcab.discovery;


import org.apache.thrift.TException;
import yellowcab.DiscoveryRequest;
import yellowcab.DiscoveryResponse;
import yellowcab.DiscoveryService;
import yellowcab.MessageBodyType;
import yellowcab.MessageStatusType;
import yellowcab.Service;
import yellowcab.TAXIIRequest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *  Responsible for figuring out which services are available.  This is typically
 *  based on permissions in conjunction with heartbeats received from an external
 *  messaging queue.  If a user is not authorized to see a service, it should
 *  not be returned in the set of "known" services.
 *
 *  @see yellowcab.Service
 */
public class DiscoveryHandler implements DiscoveryService.Iface{

    private static Set<Service> dummyServices = new HashSet<>();
    private final TAXIIRequest discovery = new TAXIIRequest(MessageBodyType.DISCOVERY_REQUEST);
    static{
        dummyServices.add(new Service("First","localhost", (short) 8080,false));
        dummyServices.add(new Service("second","l27.0.0.1", (short) 80,false));

    }
    @Override
    public Set<Service> knownServices() throws org.apache.thrift.TException {
        return dummyServices;
    }

    @Override
    public DiscoveryResponse makeRequest(DiscoveryRequest request) throws TException {
        if(!request.getMessageType().equals(MessageBodyType.DISCOVERY_REQUEST)){
            DiscoveryResponse badResponse = new DiscoveryResponse();
            badResponse.setStatus(MessageStatusType.FAILURE);
            return badResponse;
        }
        //parse request for validation purposes.
        List<Service> serviceList = new ArrayList<>();
        serviceList.addAll(dummyServices);
        DiscoveryResponse response = new DiscoveryResponse();
        response.setAllowedServices(serviceList);
        return response;
    }

/*
    public TAXIIResponse foo(TAXIIRequest request) throws TException {

        /*
        if(discovery.equals(request)){
            return new TAXIIResponse(new MessageStatus(MessageStatusType.SUCCESS,new Message(),null));
        }
        return new TAXIIResponse(new MessageStatus(MessageStatusType.FAILURE,new Message(),null));

    }
       */
}
