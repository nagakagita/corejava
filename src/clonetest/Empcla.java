package clonetest;

public class Empcla implements EmpInterface{
    @Override
    public void get() {

    }

    @Override
    public void put() {

    }

    public static void main(String[] args) {
        EmpInterface en= new Empcla();
        en.get();
    }
}
