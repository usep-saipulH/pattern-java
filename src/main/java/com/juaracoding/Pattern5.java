package com.juaracoding;

public class Pattern5 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++){
            for (j = 5; j >=1; j--){
                if ((j%2 == 0 && (i+j)<5) ){
                    System.out.print(",");
                } else if ((i+j)<5) {
                    System.out.print(j);
                } else if (i%2 == 0) {
                    System.out.println();
                    break;
                }
            }
        }




















//        for (int i = 1; i <= 5; i++){
//            for (int j = 5; j >= 1; j-- ) {
//                if (i + j < 5) {
//                    if (i % 2 == 0) {
//                        break;
//                    } else if (j %2 == 0){
//                        System.out.print(",");
//                    } else {
//                        System.out.print(j);
//                    }
//                }
//            }System.out.println();
//        }
    }

}
