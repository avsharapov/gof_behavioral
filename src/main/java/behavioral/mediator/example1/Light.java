package behavioral.mediator.example1;

// receiver
public class Light {

    private boolean isOn     = false;
    private String  location = "";

    public Light(String location) {
        this.location = location;
    }

    public boolean isOn() {
        return isOn;
    }

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
        System.out.println(location + ". Light switched On.");
    }

    private void off() {
        System.out.println(location + ". Light switched Off.");
    }
}
