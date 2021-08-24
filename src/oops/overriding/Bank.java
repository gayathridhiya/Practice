package oops.overriding;

public class Bank {
    public float getIntRate()
    {
        return 0f;
    }
}
class SBI extends Bank
{
    @Override
    public float getIntRate() {
        //return super.getIntRate();
        return 3.2f;
    }
}
class DB extends Bank
{
    @Override
    public float getIntRate()
    {
        return 6.5f;
    }
}

class Test
{
    public static void main(String[] args) {
        Bank bank= new Bank();
        System.out.println(bank.getIntRate());
        Bank bank1= new SBI();
        System.out.println(bank1.getIntRate());
        Bank bank2= new DB();
        System.out.println(bank2.getIntRate());



    }
}

//a static method cannot be overridden

//Rules for Java Method Overriding
//The method must have the same name as in the parent class
//The method must have the same parameter as in the parent class.
//There must be an IS-A relationship (inheritance).