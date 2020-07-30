package Thread;

public class interruptThread { // 불안정한 stop 대신  run()를 중지
    public static void main(String[] args){
        Thread thread = new PrintThread2();
        thread.start();

        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){}
        thread.interrupt();
    }
}

class PrintThread2 extends Thread{
    public void run(){
        try {
            while (true){
                System.out.println("실행중");
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){}

        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}

/*
다른 방법

class PrintThread2 extends Thread{
    public void run(){
        try {
            while (true){
                System.out.println("실행중");
                if(Thread.interrupted()){
                    break;
                }
            }
        }catch (InterruptedException e){}

        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}


 */
