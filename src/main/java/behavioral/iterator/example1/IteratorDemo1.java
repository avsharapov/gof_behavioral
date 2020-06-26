package behavioral.iterator.example1;

import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        BikeRepository repo = new BikeRepository();
        repo.addBike("Cervelo");
        repo.addBike("Scott");
        repo.addBike("Fuji");

        for (String s : repo) {
            System.out.println(s);
        }
    }
}
