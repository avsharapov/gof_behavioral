package behavioral.mediator.example1;

import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

public class MediatorEverydayDemo {
    private final Toolkit toolkit;
    private final Timer   timer;

    public MediatorEverydayDemo(int seconds) {
        toolkit = Toolkit.getDefaultToolkit();
        timer   = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000L);
        timer.schedule(new RemindTaskWithoutBeep(), (long) seconds * 2 * 1000);
    }

    class RemindTask extends TimerTask {

        @Override
        public void run() {
            System.out.println("Time's up!");
            toolkit.beep();
        }
    }

    class RemindTaskWithoutBeep extends TimerTask {

        @Override
        public void run() {
            System.out.println("Now Time's really up!");
            timer.cancel();
        }
    }

    public static void main(String[] args) {
        System.out.println("About to schedule task.");
        new MediatorEverydayDemo(3);
        System.out.println("Task scheduled.");
    }
}
