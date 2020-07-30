package Thread;

import java.awt.*;
// Thread의 run() 재정의
public class MultiThread implements  Runnable{
    public void run(){
        Toolkit toolkit = Toolkit .getDefaultToolkit();
        for(int i = 0; i < 5; i++){
            toolkit.beep();
            try {
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}
