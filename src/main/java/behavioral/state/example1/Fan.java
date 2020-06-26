package behavioral.state.example1;

public class Fan {
    private final State fanOffState;
    private final State fanLowState;
    private final State fanMedState;
    private final State fanHighState;

    private State state;


    public Fan() {
        fanOffState  = new FanOffState(this);
        fanLowState  = new FanLowState(this);
        fanMedState  = new FanMedState(this);
        fanHighState = new FanHighState(this);

        state = fanOffState;
    }

    public State getFanLowState() {
        return fanLowState;
    }

    public State getFanOffState() {
        return fanOffState;
    }

    public State getFanMedState() {
        return fanMedState;
    }

    public State getFanHighState() {
        return fanHighState;
    }

    public void pullChain() {
        state.handleRequest();
    }

    public String toString() {
        return state.toString();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

}
