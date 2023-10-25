package observer;
import java.util.ArrayList;

public class NewsAgency implements Subject{
    private String news;
    private ArrayList<Observer> observers= new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        this.observers.add(o);
    }

    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }
    public void updateNews(String news) {
        this.news = news;
        notifyObservers();
    }
    public void notifyObservers() {
        for (Observer o : this.observers) {
            o.update(this.news);
        }
    }
    
} 