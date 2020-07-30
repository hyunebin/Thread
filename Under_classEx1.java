package Thread;

import java.awt.*;

public class Under_classEx1 {
    public static void main(String[] args){
        Thread thread = new Thread(){
          public void run(){
              Toolkit toolkit = Toolkit.getDefaultToolkit();
              for(int i = 0; i < 5; i++){
                  toolkit.beep();
                  try {
                      Thread.sleep(500);
                  }catch (Exception e){}
              }
          }
        };
        thread.start();
        for(int i =0; i < 5; i++){
            System.out.println("ding");
             try {
                 Thread.sleep(500);
             }catch (Exception e){}
        }
    }
}
