import java.util.Scanner;

import java.util.Random;
public class textToImage {

    public static void main(String[] args) {

        System.out.println("What size should it be");
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        int comun = scan.nextInt();
        int[][] arr = new int[comun][comun];
        int yes;

        do{
            for (int a = 0; a < comun; a++) {
                for (int b = 0; b < comun; b++) {
                    int n = r.nextInt(8);
                    arr[a][b] = n;

                }
            }


            for (int a = 0; a < comun; a++) {
                for (int b = 0; b < comun; b++) {
                    if (arr[a][b] == 7) {
                        System.out.print("\uD83D\uDFE8");

                    }
                    if (arr[a][b] == 6) {
                        System.out.print("\uD83D\uDFE5");

                    }
                    if (arr[a][b] == 5) {
                        System.out.print("\uD83D\uDFE7");

                    }
                    if (arr[a][b] == 4) {
                        System.out.print("\uD83D\uDFE9");

                    }
                    if (arr[a][b] == 3) {
                        System.out.print("\uD83D\uDFE6");

                    }
                    if (arr[a][b] == 2) {
                        System.out.print("\uD83D\uDFEA");

                    }
                    if (arr[a][b] == 1) {
                        System.out.print("⬛");

                    }
                    if (arr[a][b] == 0) {
                        System.out.print("⬜");

                    }


                }
                System.out.println();
            }




       /* int[] age = new int[3];
        for (int i = 0;i<comun;i++) {

            int n = r.nextInt(2);
            System.out.println(n);

        }
*/
             //yes = scan.nextInt();
            yes = 1;
        }while(yes==1);

    }
}
