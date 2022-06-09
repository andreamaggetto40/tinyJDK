public interface myCollection<T> extends myIterable<T> {
    void add(T item);
    int size();
    boolean contains(T item);  
    void clear();
  
    default boolean isEmpty(){
        return size() == 0;
    }

    
}
