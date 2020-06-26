package behavioral.state.example1;

public class FanOffState extends State {

    private final Fan fan;

    public FanOffState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on low.");
        fan.setState(fan.getFanLowState());
    }

    public String toString() {
        return "Fan is off";
    }
}
