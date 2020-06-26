package behavioral.state.example1;

public class FanLowState extends State {
    private final Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on med.");
        fan.setState(fan.getFanMedState());
    }

    public String toString() {
        return "Fan is low";
    }
}
