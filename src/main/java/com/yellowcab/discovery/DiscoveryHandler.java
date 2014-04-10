package com.yellowcab.discovery;


import yellowcab.DiscoveryService;
import yellowcab.Service;

import java.util.HashSet;
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
    static{
        dummyServices.add(new Service("First","localhost", (short) 8080,false));
        dummyServices.add(new Service("second","l27.0.0.1", (short) 80,false));

    }
    @Override
    public Set<Service> knownServices() throws org.apache.thrift.TException {
        return dummyServices;
    }
}
