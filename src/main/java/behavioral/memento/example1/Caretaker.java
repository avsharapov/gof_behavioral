package behavioral.memento.example1;

import java.util.ArrayDeque;
import java.util.Deque;

// caretaker
public class Caretaker {
    private final Deque<EmployeeMemento> employeeHistory
            = new ArrayDeque<>();

    public void save(Employee emp) {
        employeeHistory.push(emp.save());
    }

    public void revert(Employee emp) {
        emp.revert(employeeHistory.pop());
    }
}
