package com.yellowcab.discovery;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import yellowcab.DiscoveryService;

/**
 * Created by Travis on 4/10/2014.
 */
public class DiscoveryServer {

    public static DiscoveryService.Processor processor;

    public static DiscoveryHandler handler;
public static void simple(DiscoveryService.Processor processor){
    try {
        TServerTransport serverTransport = new TServerSocket(9090);
        TServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(processor));

        System.out.println("Starting discovery service server...");;
        server.serve();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    public static void main(String [] args) {
        try {
            handler = new DiscoveryHandler();
            processor = new DiscoveryService.Processor(handler);

            Runnable simple = new Runnable() {
                public void run() {
                    simple(processor);
                }
            };

            new Thread(simple).start();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}
