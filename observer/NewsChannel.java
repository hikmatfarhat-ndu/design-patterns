package observer;
public class NewsChannel implements Observer {
    private String news;
    private String name;

    public NewsChannel(String n){
        this.name=n;
    }
    @Override
    public void update(Object news) {
        this.news=(String)news;
        System.out.println(this.name+" received news: "+this.news);
    } 
}