package org.example;

public class Exercise4 {
    public static int calculate(){
        int[] t = {1, 5, 3, 8, 2, 3, 5, 5, 5, 5};
        int s =0;
        for (int j=0; j<34; j++) {
            s += (t[j]*4)/5;
        }
        return s;
    }

    public static void main(String[] args) {
        calculate();
    }
}
