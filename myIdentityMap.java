public class myIdentityMap<K,V> implements myMap<K,V> {     
    private myArrayList<myPair<K,V>> a;

    @Override
    public V get(K index) throws OutOfBoundException {
        while(a.iterator().hasNext()){
            if(a.iterator().next().first.equals(index)) return a.iterator().next().second;
        }
        throw new OutOfBoundException("Errr");
    }

    @Override
    public void put(K k, V v) {
        a.add(new myPair(k,v));
    }

    @Override
    public void clear() {
        a = new myArrayList<>();

        
    }
    
}
