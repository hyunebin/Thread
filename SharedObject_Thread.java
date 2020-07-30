package Thread;

import java.util.Calendar;

public class SharedObject_Thread {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        User1 user1 =new User1();
        user1.setCalculator(calculator);// 공유 객체 설정
        user1.start();

        User2 user2 = new User2();
        user2.setCalculator(calculator);// 공유 객체 설정
        user2.start();
    }
}

class Calculator{
    private int memory;

    public int getMemory(){
        return memory;
    }

    public synchronized void setMemory(int memory){ // 임계치 설정
        this.memory = memory;
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){}
        System.out.println(Thread.currentThread().getName() + " : " + this.memory);
    }
}

class User1 extends Thread{
    private Calculator calculator;

    public void setCalculator(Calculator calculator){
        this.setName("User1");
        this.calculator = calculator;
    }

    public void run(){
        calculator.setMemory(50);
    }
}

class User2 extends  Thread{
    private Calculator calculator;
    public void setCalculator(Calculator calculator){
        this.setName("User2");
        this.calculator = calculator;
    }

    public void run(){
        calculator.setMemory(10);
    }
}