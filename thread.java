package labsession3;

import java.util.Scanner;

public class thread extends Thread {
    @Override
    public void run() {
        int n;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int x = 2;
        try {

            while (true){
                Thread.sleep(1500);
                if (isNguyenTo(x)){
                    System.out.println("Hiển Thị: "+x);
                    count++;
                }
                if (count ==n){
                    break;
                }
                if (x == 2){
                    x++;
                }else {
                    x += 2;
                }



            }
        }catch (Exception e){}

    }
    public static boolean isNguyenTo(int n){
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
           if (n%i ==0){
               return false;
           }
        }
        return true;
    }
}
