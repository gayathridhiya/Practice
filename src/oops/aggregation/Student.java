package oops.aggregation;


//Code reuse is also best achieved by aggregation when there is no is-a relationship.
//HAS -A RELATIONSHIP

class Address
{
    int doorNo;
    String city,state,country;

    public Address(int doorNo, String city, String state, String country) {
        this.doorNo = doorNo;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "doorNo=" + doorNo +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
public class Student {
    int roll;
    String name;
    Address address;  //Student HAS A address

    public Student(int roll, String name,Address address) {
        this.roll = roll;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        Address address1= new Address(10, "Coimbatore","TN","India");
        Student student=new Student(101,"Ram", address1);
        System.out.println(student);


    }
}
