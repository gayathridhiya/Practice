package oops.covariant;

public class Car {

    public Car getBestCarInTermsofMilage()
    {

        return this;
    }
    public void display()
    {
        System.out.println("Its a Car");
    }
}
class Toyata extends Car{
    @Override
    public Toyata getBestCarInTermsofMilage()  //Overriding possible by changing return type
    {
        //return super.getBestCarInTermsofMilage(year);
        return this;

    }
    public void display()
    {
        System.out.println("Its Toyata");
    }
}

class Tester
{
    public static void main(String[] args) {
        Car car= new Car();
        car.getBestCarInTermsofMilage().display();
        Toyata car1= new Toyata();
        car1.getBestCarInTermsofMilage().display();

    }
}

//Before Java5, it was not possible to override any method by changing the return type. But now, since Java5, it is possible to override method by changing the return type if subclass overrides any method whose return type is Non-Primitive but it changes its return type to subclass type.
