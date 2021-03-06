public interface myList<T> extends myCollection<T> {
    T get(int index) throws OutOfBoundException;

    default void print() throws OutOfBoundException{
        for(int i = 0; i < size(); ++i){
            System.out.println(get(i) + "\n");
        }
    }

    
}
