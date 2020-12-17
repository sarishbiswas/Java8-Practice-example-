package Easy.Array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if(numRows==0)
            return list;
        List<Integer> li = new ArrayList<>();
        li.add(1);
        list.add(li);
        for (int i=1;i<numRows;i++){
            List<Integer> l = new ArrayList<>();
            l.add(1);
            for(int j=1;j<i;j++){
                int s = list.get(i-1).get(j-1)+list.get(i-1).get(j);
                l.add(s);
            }
            l.add(1);
            list.add(l);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
