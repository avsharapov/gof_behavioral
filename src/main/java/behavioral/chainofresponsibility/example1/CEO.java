package behavioral.chainofresponsibility.example1;

public class CEO extends Handler {

    @Override
    void handleRequest(Request request) {
        System.out.println("CEOs can approve anything they want");
    }

}
