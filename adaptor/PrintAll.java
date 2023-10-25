import java.util.Iterator;
import java.util.ArrayList;
public class PrintAll {

    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");list.add("World");
        /* using an iterator */
        Iterator<String> iterator = list.iterator();
        printAll(iterator);
        /* using composition */
        IteratorAdapter<String> itr = new IteratorAdapter<String>
                            ((new Months()).getMonths());
        printAll(itr);
        /*using inheritance */
        StringTokenizerAdapter st=new StringTokenizerAdapter("This is COMP 6226");
        printAll(st);
        
    }
    public static void printAll(Iterator<String> itr){
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
