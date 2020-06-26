package behavioral.command.example1;

// client
public class CommandDemo1 {

    public static void main(String[] args) {
        Light  light       = new Light();
        Switch lightSwitch = new Switch();

        Command toggleCommand = new ToggleCommand(light);
        lightSwitch.store(toggleCommand);
        lightSwitch.store(toggleCommand);
        lightSwitch.store(toggleCommand);
        System.out.println("---------------");
        lightSwitch.execute();
    }
}
