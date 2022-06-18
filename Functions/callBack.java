import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;



public class callBack {

    public static <A,B> Collection<B> map(Collection<A> l,Function<A,B> f){
        Collection<B> output = new ArrayList<>();

        for(A a : l){
            output.add(f.apply(a));
        }

        return output;
    }    

    public static <X> void print(Collection<X> items){
        map(items, new Function<X,Void>(){

            @Override
            public Void apply(X t) {
                System.out.println(t);
                return null;
            }
        });
    }

    public static void main(String[] args) {    
        List<Integer> first = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        Collection<Integer> r1 = map(first, new Function<Integer,Integer>(){

            @Override
            public Integer apply(Integer x) {
                return x + 1;
            }
        });

        Collection<Object> r2 = map(first, a -> a + 2);

        
    }
}


