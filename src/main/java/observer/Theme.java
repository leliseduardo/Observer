package observer;

import java.util.Observable;

public class Theme extends Observable {

    private String description;

    public Theme(String description) {
        this.description = description;
    }

    public void updateNewsForTheme() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return this.description;
    }
}
