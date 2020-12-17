package Easy.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class PascalsTriangle2 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        for (int i=1;i<=rowIndex;i++){
            List<Integer> curr = new ArrayList<>();
            curr.add(0,1);
            for(int j=1;j<i;j++){
                curr.add(j, prev.get(j)+prev.get(j-1));
            }
            curr.add(i,1);
            prev = curr;
        }
        return prev;
    }
    public static void main(String[] args) {
        System.out.println(getRow(6));
    }
}
