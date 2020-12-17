package Test;
public class CheckPallindrome {
    public static void main(String[] args) {
//        String str = "adba";
//        String str = "abbda";
//        String str = "aba";
        String str = "a";
        char[] arr = str.toCharArray();
        int l = arr.length;
        int index = -1;
        for(int i=0;i<Math.floor(l/2);i++){
            if(arr[i]!=arr[l-i-1]){
                if(arr[i+1]==arr[l-i-1])
                    index=i;
                else
                    index=l-i-1;
                break;
            }
        }
        System.out.println("The index is : "+index);
    }
}
