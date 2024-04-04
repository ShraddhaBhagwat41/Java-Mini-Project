package Model.People;
/**
 * Identification comments:
 * Name:Shraddha Bhagwat
 * Experiment No: 07
 * Experiment Title:Implementing JSON File Handling in Java to store relationship objects data.Reading a json file
 *   to objects and writing objects to a json data file
 * Experiment Date: 20/02/24
 *  @version 1.0
 *
 *
 * Beginning comments:
 * Filename: Customer.java
 * @author: Shraddha Bhagwat
 * Overview: This is the Customer class. In this file we have achieved the following
 * - Created Attributes
 * --- int id
 * --- long aadhar_no
 *  --- int ppl_count which is declared as static variable

 * - Created Setters and Getters
 * - Created constructors and overloaded them based on no. of parameters
 * - Created static setters and getters
 * - Made use of single inheritance where Person Class is the base class and Customer Class is derived class
 * - Accessed methods of base class using the keyword super
 * - Created a Display Function to call the getters and display Instance data
 *
 */

public class Customer extends Person{
    private static int ppl_count=0;
    int id;
    long aadhar_no;
    //ppl_count is initialized using setter and getter
    public static void setPpl_count(int ppl_count){Customer.ppl_count=ppl_count;}

    public static int getPpl_count(){return ppl_count;}
    //Declaring a default constructor
    public Customer()
    {
//        setPpl_count(getPpl_count()+1);
//        setId(getPpl_count());
    }
    public Customer(int id,  String name, String gender, int age, String address, String mobile, long aadhar_no )
    {
        super(name, gender, age, address, mobile);
        setPpl_count((getPpl_count()+1));
        this.setId(id);
        this.setAadhar_no(aadhar_no);
    }
    //Creating setters and getters
    public void setId(int id){this.id=id;}
    public void setAadhar_no(long aadhar_no){this.aadhar_no=aadhar_no;}

    public int getId() {
        return id;
    }
    public long getAadhar_no(){return aadhar_no;}
    //Display function used for displaying all the values
    public void display()
    {
        System.out.println("Customer's Id:"+getId());
        System.out.println("Customer's Aadhar No.:"+getAadhar_no());
        super.display();
    }
}

