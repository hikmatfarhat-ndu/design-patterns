package observer;
public interface Subject {
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    /* cannot call it notify() it is defined in Object */
    public void notifyObservers();
}
