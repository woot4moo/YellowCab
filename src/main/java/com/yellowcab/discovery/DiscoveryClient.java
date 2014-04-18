package com.yellowcab.discovery;


import com.yellowcab.DiscoveryRequest;
import com.yellowcab.DiscoveryResponse;
import com.yellowcab.DiscoveryService;
import com.yellowcab.MessageBodyType;
import com.yellowcab.ServiceInstance;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import java.util.Set;

/**
 * Simple client to check for known services.
 *
 * @see com.yellowcab.Service
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
        Set<ServiceInstance> services = client.knownServices();
        System.out.println(services + " services!");
    }

    /**
     * Sends a {@link com.yellowcab.DiscoveryRequest} to determine if there are any available services
     * @param client - The client handling this request.
     * @throws TException
     * @see com.yellowcab.DiscoveryService.Client
     */
    private static void sendMessage(DiscoveryService.Client client) throws TException{
        DiscoveryRequest request = new DiscoveryRequest();
        request.setMessageType(MessageBodyType.DISCOVERY_REQUEST);
        DiscoveryResponse response = client.makeRequest(request);
        System.out.println("Response: " + response);
    }
}
