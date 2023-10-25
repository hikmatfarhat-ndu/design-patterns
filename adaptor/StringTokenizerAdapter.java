package adaptor;
import java.util.StringTokenizer;
import java.util.Iterator;
public class StringTokenizerAdapter extends StringTokenizer 
                                    implements Iterator<String> {

    public StringTokenizerAdapter(final String str) {
        super(str);
    }

    @Override
    public boolean hasNext() {
        return hasMoreTokens();
    }

    @Override
    public String next() {
        return nextToken();
    }
}
 
