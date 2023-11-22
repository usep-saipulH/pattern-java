package com.juaracoding;

public class Pattern10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            for (int j = 10; j >=1; j--){
                if (j %2 == 0 && (i+j) <= 10){
                    System.out.print(",");
                }
                 else if ( i+j <= 10) {
                    System.out.print(j);
                } else if (i %2 == 0) {
                    System.out.println();
                    break;
                }
            }
        }
    }
}