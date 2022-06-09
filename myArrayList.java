public class myArrayList<T> implements myList<T> {
    private Object[] items; 
    private int actualSize; //actual number of items that are stored in items array     

    public myArrayList(){
        actualSize = 0;
        items = new Object[actualSize];
    }

    public myArrayList(myCollection<? extends T> toCopy){
        this();
        while(toCopy.iterator().hasNext()){
            add(toCopy.iterator().next());
        }
    }

    @Override
    public void add(T item) {
        items = new Object[++actualSize];
        items[actualSize - 1] = item;
    }

    @Override
    public int size() {
        return actualSize;
    }

    @Override
    public boolean contains(T item) {
        boolean check = false;
        
        while(iterator().hasNext() && check == false){
            check |= (iterator().next().equals(item));
        }

        return check;
    }

    @Override
    public void clear() {
        actualSize = 0;
    }

    @Override
    public myIterator<T> iterator() {
        return new myIterator<T>(){
            int pos = 0;

            @Override
            public boolean hasNext() {
                return pos < actualSize;
            }

            @Override
            public T next() {
                return (T)items[++actualSize];
            }
        };
    }

    @Override
    public T get(int index) throws OutOfBoundException {
        if(index >= 0 && index < actualSize) return (T) items[index];
        else throw new OutOfBoundException("Error!");
    }
}
