import java.awt.Toolkit;
public class App {
    public static void main(String[] args){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Thread t1 = new Thread(()->{
            for(int i = 0; i < 5; i++){
                toolkit.beep();
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    
                }
            }
        });
        t1.start();
        for(int i = 0; i < 5; i++){
            System.out.println("Beep!");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                
            }
        }
    }
}