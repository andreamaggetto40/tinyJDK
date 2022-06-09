public class myLinkedSet<T> implements myCollection<T> { 
    private myLinkedList<T> l;

    @Override
    public void add(T item) {
        if(!l.contains(item)) l.add(item);
    }

    @Override
    public int size() {
        return l.size();
    }

    @Override
    public boolean contains(T item) {
        return l.contains(item);
    }

    @Override
    public void clear() {
        l.clear();
    }

    @Override
    public myIterator<T> iterator() {
        return l.iterator();
    }

    
}
