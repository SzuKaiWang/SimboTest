import org.junit.Assert;
import org.junit.Test;
import tw.oscar.Q2FunctionUtil;

import java.util.*;


public class Q2FunctionTest {

    @Test
    public void testFunction(){
        List list = new LinkedList();
        list.add(1);
        list.add(4);
        list.add(7);
        list.add(23);
        list.add(9);
        int target = 13;
        Assert.assertEquals(target, Q2FunctionUtil.compute(list,target).stream().reduce((a, b) -> (int)a+(int)b).hashCode());

    }
}
