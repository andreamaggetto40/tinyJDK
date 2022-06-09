public class myArrayList<T> implements myList<T> {
    private Object[] items; 
    private int actualSize; //actual number of items that are stored in items array

    public myArrayList(){
        items = new Object[100]; //100 is the capacity of array, i.e how many items it can actually store
        actualSize = 0;
    }

    @Override
    public void add(T item) {
        
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
        return null;
    }

    @Override
    public T get(int index) throws OutOfBoundException {
        if(index >= 0 && index < actualSize) return (T) items[index];
        else throw new OutOfBoundException("Error!");
    }
    

}
