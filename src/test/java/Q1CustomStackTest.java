import org.junit.Assert;
import org.junit.Test;
import tw.oscar.Q1CustomStack;

public class Q1CustomStackTest {

    @Test
    public void testPush(){

        Q1CustomStack stack = new Q1CustomStack();
        int count = 5;
        for (int i = 0; i < count; i++){
            System.out.println("Push : " + i + ".");
            stack.push(i);
        }

        Assert.assertEquals(count,stack.size());
    }

    @Test
    public void testPop(){
        Q1CustomStack stack = new Q1CustomStack();
        int count = 5;
        for (int i = 0; i < count; i++){
            System.out.println("Push : " + i + ".");
            stack.push(i);
        }

        for (int i = 0; i < count; i++){
            int pop = stack.pop();
            System.out.println("Pop : " + pop + ".");
            Assert.assertEquals((count-1-i),pop);
            Assert.assertEquals((count-1-i), stack.size());
        }
    }

    @Test
    public void testTop(){
        Q1CustomStack stack = new Q1CustomStack();
        int count = 5;
        for (int i = 0; i < count; i++){
            System.out.println("Push : " + i + ".");
            stack.push(i);
        }

        for (int i = 0; i < count; i++){
            int top = stack.top();
            System.out.println("Top : " + top + ".");
            Assert.assertEquals((count-1),top);
        }

        Assert.assertEquals(count, stack.size());

    }

    @Test
    public void testGetMax(){
        Q1CustomStack stack = new Q1CustomStack();
        int count = 5;
        for (int i = 0; i < count; i++){
            System.out.println("Push : " + i + ".");
            stack.push(i);
        }

        Assert.assertEquals(count-1, stack.getMax());
    }

}
