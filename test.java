import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class test {

    public static <A,B> Collection<B> map(Collection<A> l, Function<A,B> function){
        Collection<B> output = new ArrayList<>();

        for(A it : l){
            output.add(function.apply(it));
        }

        return output;
    }

    public void main(String[] args) {
        List<Integer> l = new ArrayList<>();

        for(int i = 0; i < 10; ++i) l.add(i);

        map(l, new Function<Integer,Integer>(){
            @Override
            public Integer apply(Integer x){
                return x + 1;
            }
        });

        
    }


}
