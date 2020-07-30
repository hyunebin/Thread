package Thread;

public class Under_classEx {
    public static void main(String[] args){
        Thread thread = new Under_class();
        thread.start();

        for(int i=0; i < 5; i++){
            System.out.println("ding");
            try {
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}
