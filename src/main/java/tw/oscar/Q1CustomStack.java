package tw.oscar;

import java.util.ArrayList;

public class Q1CustomStack {
    private ArrayList<Integer> array = null;
    private int pointer = 0;

    public Q1CustomStack(){
        array = new ArrayList();
    }


    public Boolean push(int i) {
        array.add(pointer++,i);
        return true;
    }

    public int top() {
        return array.get(pointer-1);
    }

    public int size() {
        return pointer;
    }

    public int pop() {
        return array.remove((pointer--)-1);
    }

    public int getMax() {
        int i = -9999999;
        for(int v :array) {
            if (v>i){
                i = v;
            }
        }
        return i;
    }
}
