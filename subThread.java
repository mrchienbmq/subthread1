package labsession3;

public class subThread extends Thread {
    @Override
    public void run() {
        int count = 10;
        for (int i = count; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(10000);
                System.out.println("Chuc mung");
            } catch (Exception e) {

            }
        }
        System.out.println("Hết giờ");
    }
}
