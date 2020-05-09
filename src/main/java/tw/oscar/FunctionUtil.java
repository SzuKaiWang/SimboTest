package tw.oscar;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionUtil {
    public static Collection<Integer> compute(Collection<Integer> collection, int target) {
        Collection result = null;
        List list = collection.stream().collect(Collectors.toList());

        for (int i = 0 ; i < list.size() ; i++){
            for (int j = (i+1) ; j < list.size() ; j++){
                int a = (int) list.get(i);
                int b = (int) list.get(j);
                if (target == (a+b)){
                    result = new HashSet();
                    result.add(a);
                    result.add(b);
                    return result;
                }
            }
        }

        return result;
    }
}
