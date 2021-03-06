import grpc.ChannelManager;
import io.grpc.ServerBuilder;
import service.ServiceImpl;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {


    public static void main(String[] args) throws IOException, InterruptedException {
        io.grpc.Server server;
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
        server = ServerBuilder.forPort(2000).addService(new ServiceImpl()).executor(executor).build().start();
        System.out.println(server);

        ChannelManager.call();
        server.awaitTermination();

    }
}
