public class myLinkedList<T> implements myList<T> {

    private class Node{
        public T info; public Node next;

        public Node(T info, Node next){
            this.info = info;
            this.next = next;
        }
    }

    private Node head,tail;

    public myLinkedList(){
        head = tail = null;
    }

    @Override
    public void add(T item) {
        Node toAdd = new Node(item,null);

        if(head == null) head = tail = toAdd;
        else{
            tail.next = toAdd; tail = tail.next;
        }
    }

    @Override
    public int size() {
        int amount = 0;

        for(Node counter = head; counter != null; ++amount, counter = counter.next);

        return amount;
    }

    @Override
    public boolean contains(T item) {
        boolean check = false;

        while(iterator().hasNext() && !check){
            check |= (iterator().next().equals(item));
        }

        return check;

    }

    @Override
    public void clear() {
        head = tail = null;
    }

    @Override
    public myIterator<T> iterator(){
        return null;
    }

    @Override
    public T get(int index) throws OutOfBoundException {
        Node counter = head;

        for(int i = 0; i < index && counter != null; ++i, counter = counter.next);

        if(counter != null) return counter.info;
        else throw new OutOfBoundException("The item isn't in the list!");
    }

}
