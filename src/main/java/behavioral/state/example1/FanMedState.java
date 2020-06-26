package behavioral.state.example1;

public class FanMedState extends State {
    private final Fan fan;

    public FanMedState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on high.");
        fan.setState(fan.getFanHighState());
    }

    public String toString() {
        return "Fan is med";
    }
}
