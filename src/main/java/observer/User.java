package observer;

import java.util.Observable;
import java.util.Observer;

public class User implements Observer {

    private String name;
    private String lastNotification;

    public User(String name) {
        this.name = name;
    }

    public String getLastNotification() {
        return this.lastNotification;
    }

    public void setTheme(Theme theme) {
        theme.addObserver(this);
    }

    @Override
    public void update(Observable theme, Object arg) {
        this.lastNotification = this.name + ", there is a new news article about " + theme.toString() +
                " that might interest you.";
    }
}
