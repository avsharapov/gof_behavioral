package behavioral.observer.example1;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Observable;
import java.util.Observer;

public class ObserverEverydayDemo {
    public static void main(String[] args) {
        NewTwitterStream messageStream = new NewTwitterStream();

        NewClient client1 = new NewClient("Bryan");
        NewClient client2 = new NewClient("Mark");

        messageStream.addPropertyChangeListener(client1);
        messageStream.addPropertyChangeListener(client2);

        messageStream.someoneTweeted();
    }
}

// concrete subject
class TwitterStream extends Observable {

    public void someoneTweeted() {
        setChanged();
        notifyObservers();
    }
}

class Client implements Observer {

    private final String name;

    Client(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Update " + name + "'s stream, someone tweeted something.");
    }
}

class NewTwitterStream {
    private final PropertyChangeSupport support;

    public NewTwitterStream() {
        this.support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    public void someoneTweeted() {
        support.firePropertyChange("news", "oldValue", "newValue");
    }
}

class NewClient implements PropertyChangeListener {
    private final String name;

    NewClient(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Update " + name + "'s stream, someone tweeted:" + evt.getOldValue() + "/" + evt.getNewValue());
    }
}