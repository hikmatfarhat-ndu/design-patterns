public class NewsDriver {
    public static void main(String[] args){
        NewsAgency observable = new NewsAgency();
        NewsChannel observer1 = new NewsChannel("Channel 1");
        NewsChannel observer2 = new NewsChannel("Channel 2");
        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.updateNews("news");
    }
}
