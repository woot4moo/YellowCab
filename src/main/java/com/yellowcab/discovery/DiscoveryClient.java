package com.yellowcab.discovery;


import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import yellowcab.DiscoveryRequest;
import yellowcab.DiscoveryResponse;
import yellowcab.DiscoveryService;
import yellowcab.MessageBodyType;
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

            //perform(client);
            sendMessage(client);
            transport.close();
        } catch (TException x) {
            x.printStackTrace();
        }
    }

    private static void perform(DiscoveryService.Client client) throws TException{
        Set<Service> services = client.knownServices();
        System.out.println(services + " services!");
    }

    private static void sendMessage(DiscoveryService.Client client) throws TException{
        DiscoveryRequest request = new DiscoveryRequest();
        request.setMessageType(MessageBodyType.INBOX_MESSAGE);
        DiscoveryResponse response = client.makeRequest(request);
        System.out.println("Response: " + response);
    }
}
