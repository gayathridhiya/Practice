package oops.inheritance;


//Inheritance - IS A Relationship
public class Parent {

    int parent_var=40000;
    public void fun1()
    {
        System.out.println("In Parent");
    }

}
class Child extends Parent
{
    int child_var = 1000;
    public void fun2()
    {
        System.out.println("In child");
    }

}
class Test
{
    public static void main(String args[]){
        Child c=new Child();
        System.out.println("Parent's variable is:"+c.parent_var);
        System.out.println("Child's variable is:"+c.child_var);
        c.fun1();
        c.fun2();
    }
}