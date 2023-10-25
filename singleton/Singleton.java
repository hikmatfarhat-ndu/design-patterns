public class Singleton{
    private static Singleton instance = null;
    private Singleton(){}
    /* make the getInstance thread safe */
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}