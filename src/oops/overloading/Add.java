package oops.overloading;


//There are two ways to overload the method in java
//
//By changing number of arguments
//By changing the data type
public class Add {
    public int add(int a, int b)
    {
        return a+b;
    }

    public int add(int ... a)   //overloading achieved by varying number of arguments
    {
        int sum=0;
        for(int i:a)
        {
            sum+=i;
        }
        return sum;
    }

    public double add(double a, double b) //overloading achieved by changing datatype
    {
        return a+b;
    }

    //The first add method receives two integer arguments and third add method receives two double arguments.
}
class Test
{
    public static void main(String[] args) {
        Add obj= new Add();

        int sum=obj.add(1,2);
        int sum1=obj.add(1,2,3,5,6,7);
        double sum2= obj.add(1.3,1.7);



        System.out.println(sum + " " + sum1 + " "+ sum2);

    }



}

//In java, method overloading is not possible by changing the return type of the method only because of ambiguity.