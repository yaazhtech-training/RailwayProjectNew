package com.yaazhtech.railwayManagement.Demo;

class DataExtract extends Thread {
    public void run() {
        for (int DbUpdate = 0; DbUpdate < 5; DbUpdate++) {
            System.out.println("Updating the database");
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
    class Num{
        void print(){
            for(int numbers=0;numbers<5;numbers++){
                System.out.println(numbers);
            }
        }
    }
    public class Multithreading {
        public static void main (String[] args){
            DataExtract data = new DataExtract();
            Num num = new Num();
            data.start();
            num.print();
        }
}
