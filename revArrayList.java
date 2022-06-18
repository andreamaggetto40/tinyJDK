import java.util.ArrayList;
import java.util.Iterator;

public class revArrayList<T> extends ArrayList<T> {

    public revArrayList(){
        super();
    }
    public revArrayList(int capacity){
        super(capacity);
    }

    private class internalIterator{
        public void main(String[] args) {
            
        }
    }

    @Override
    public Iterator<T> iterator(){
        return new Iterator<T>(){   
            private int pos = size() - 1;

            @Override
            public boolean hasNext() {
                return pos >= 0;
            }

            @Override
            public T next() {   
                return get(pos--);
            }
            
        };
    }
}
