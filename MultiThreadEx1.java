package Thread;

import java.awt.*;

//해당 예제는 매개변수에 익명구현 객체를 사용 ! 이방법을 더 많이 사용함

public class MultiThreadEx1 {
    public static void main(String[] args){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i = 0; i < 5; i++){
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    }catch (Exception e){}
                }
            }
        });
        thread.start();

        for (int i = 0; i < 5; i++){
            System.out.println("띵");
            try {
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}
