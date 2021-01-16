import com.test.example.Request;
import com.test.example.Response;
import com.test.example.TestServiceGrpc;
import io.grpc.stub.StreamObserver;

public class ServiceImpl extends TestServiceGrpc.TestServiceImplBase {

    @Override
    public void call(Request request, StreamObserver<Response> responseObserver) {
        Response response = Response.newBuilder().setOutput("output").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        System.out.println(response);
    }
}
