package com.yellowcab.discovery;


import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import yellowcab.DiscoveryService;
import yellowcab.Service;

import java.util.Set;

/**
 * Simple client to check for known services.
 *
 * @see yellowcab.Service
 */
public class DiscoveryClient {

    public static void main(String [] args) {


        try {
            TTransport transport;

            transport = new TSocket("localhost", 9090);
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);
           DiscoveryService.Client client = new DiscoveryService.Client(protocol);

            perform(client);

            transport.close();
        } catch (TException x) {
            x.printStackTrace();
        }
    }

    private static void perform(DiscoveryService.Client client) throws TException{
        Set<Service> services = client.knownServices();
        System.out.println(services + " services!");
    }

}
