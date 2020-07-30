package Thread;
// 주 스레드의 작업을 돋는 보조적인 역활을 수행하는 스레드
public class DemonThread extends Thread{
    public void save(){
        System.out.println("작업 내용을 저장합니다.");
    }

    public void run(){
        while(true){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                break;
            }
            save();
        }
    }
}

class DaemonEX{
    public static void main(String[] args){
        DemonThread demonThread = new DemonThread();
        demonThread.setDaemon(true); // 데몬 스레드로 만듬
        demonThread.start();

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){}

        System.out.println("메인 스레드 종료");
    }
}
