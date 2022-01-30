package deenn.com;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Ceo oga = new Ceo("John",01,"john@gmail.com","Boss");
//        oga.hire();
//        oga.fire();
        int[] arr = {1,10,-1,9,8,81,3,4,6,7, 90};
        System.out.println(secondHighest(arr));





    }
    public static int secondHighest(int[] arr) {
        Arrays.sort(arr);
        int temp;
        boolean flag = true;
       while (flag) {
           flag = false;
           for (int i = 0; i < arr.length-1; i++) {
               if (arr[i] < arr[i+1]) {
                   temp = arr[i];
                   arr[i] = arr[i+1];
                   arr[i+1] = temp;
                   flag = true;
               }
           }
       }
        return arr[1];
    }
}
