package behavioral.command.example1;

// receiver
public class Light {

    private boolean isOn = false;

    public void toggle() {
        if (isOn) {
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }

    private void on() {
        System.out.println("Light switched On.");
    }

    private void off() {
        System.out.println("Light switched Off.");
    }
}
