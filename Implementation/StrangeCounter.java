package Implementation;

import java.util.Scanner;

/*
 * @author -- rajatgoyal715
 */

public class StrangeCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        long a=3;
        long b=1;
        long c=3;
        while(t>c){
            b=c+1;
            a*=2;
            c+=a;
        }
        System.out.println((a+b)-t);
    }
}
