public interface myMap<K,V>  {
    V get(K index) throws OutOfBoundException;  
    void put(K k, V v);
    void clear();
}
