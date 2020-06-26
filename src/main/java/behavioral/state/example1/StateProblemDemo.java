package behavioral.state.example1;

public class StateProblemDemo {

    public static void main(String[] args) {
        ProblemFan fan = new ProblemFan();
        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);
    }

}

class ProblemFan {

    static final int OFF = 0;
    static final int LOW = 1;
    static final int MED = 2;

    int state = OFF;

    // many if else statements - it's a problem
    public void pullChain() {
        if (state == OFF) {
            System.out.println("Turning fan on to low.");
            state = LOW;
        } else if (state == LOW) {
            System.out.println("Turning fan med.");
            state = MED;
        } else if (state == MED) {
            System.out.println("Turning fan off.");
            state = OFF;
        }
    }

    public String toString() {
        if (state == OFF) {
            return "Fan is off";
        } else if (state == LOW) {
            return "Fan is on low";
        } else if (state == MED) {
            return "Fan is on med";
        }
        return "Invalid state.";
    }
}