package Tablica;

public class Tablica {


    public static void main(String[] args) {

        int start = (int) System.currentTimeMillis();

            for (int i = 1,j=1;  j<=10 ; i++) {
                System.out.printf("%2d ",  j * i);
                if(i%10==0) {
                    System.out.println();
                    j++;
                    i = 0;
                }
            }

        int stop = (int) System.currentTimeMillis();

        System.out.println(stop - start);



    }


}
