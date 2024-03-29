package Thread;

public class ThreadEx {
    public static void main(String[] args){
        Thread thread1 = new MovieThread();
        thread1.start();

        Thread thread2 = new Thread(new MusicRunnable());
        thread2.start();
    }
}

class MovieThread extends Thread{
    public void run(){
        for(int i = 0; i < 3; i++){
            System.out.println("1번  동영상을 재생합니다.");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }
}

class MusicRunnable  implements Runnable{
    public void run(){
        for(int i = 0; i < 3; i++){
            System.out.println("2번  동영상을 재생합니다.");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }
}
