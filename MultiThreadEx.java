package Thread;
//해당 객체는 인터페이스를 실행객체로 말들어 매개변수에 적용
public class MultiThreadEx {
    public static void main(String[] args){
        Runnable beep = new MultiThread();
        Thread thread = new Thread(beep);
        thread.start();

        for(int i = 0;i < 5; i++){
            System.out.println("띵");
            try{
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}
