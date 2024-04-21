package clonetest;

abstract class Bike{
    abstract void run();
}

class EmpAbsClass extends Bike{
    void run(){System.out.println("running safely..");}

    public static void main(String args[]){
        Bike obj = new EmpAbsClass();
        obj.run();
    }
}
