package adaptor;
import java.util.Vector;
import java.util.Enumeration;
public class Months {
    Vector<String> months;
    public Months(){
        months = new Vector<>();
        months.add("January");months.add("February");
        months.add("March");months.add("April");
        months.add("May");months.add("June");
        months.add("July");months.add("August");
        months.add("September");months.add("October");
        months.add("November");months.add("December");
    }
    public Enumeration<String> getMonths(){
        return months.elements();
    }    
}
