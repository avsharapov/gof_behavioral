package behavioral.command.example1;

import java.util.ArrayList;
import java.util.List;

// invoker
public class Switch {
    List<Command> lc = new ArrayList<>();

    public void store(Command command) {
        lc.add(command);
    }

    public void execute() {
        for (Command command : lc) {
            command.execute();
        }
    }
}
