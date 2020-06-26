package behavioral.chainofresponsibility.example1;

public class ChainOfResponsibilityDemo {

    public static void main(String[] args) {
        Handler bryan   = new Director();
        Handler crystal = new VP();
        Handler jeff    = new CEO();

        bryan.setSuccessor(crystal);
        crystal.setSuccessor(jeff);

        Request request = new Request(RequestType.CONFERENCE, 500);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1500);
        bryan.handleRequest(request);
    }
}
