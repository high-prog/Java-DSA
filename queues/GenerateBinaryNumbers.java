package queues;

import java.util.LinkedList;
import java.util.Queue;

//Question 1 : Generate Binary Numbers
// Given a number N.The task is to generate and print all binary numbers with decimal values from 1 to N.
// Sample Input 1: N =2
// Sample Output 1: 1 10

// Sample Input 2: 5.
// Sample Output 2: 1 10 11 100 101

public class GenerateBinaryNumbers {
    public static void main(String[] args) {
        int n = 5;
        printBins(n);
    }

    public static void printBins(int n){
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while(n-- > 0){
            String s1 = q.remove();
            System.out.print(s1 + " ");
            String s2 = s1;
            q.add(s1 + "0");
            q.add(s2 + "1");
        }


    }
}
