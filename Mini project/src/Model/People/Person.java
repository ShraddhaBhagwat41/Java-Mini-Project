package Model.People;
/**
 * Identification comments:
 *   Name:Shraddha Bhagwat
 *   Experiment No: 07
 *   Experiment Title: Implementing JSON File Handling in Java to store relationship objects data.Reading a json file
 *    to objects and writing objects to a json data file
 *   Experiment Date: 20/02/24
 *   @version 1.0
 *
 *
 * Beginning comments:
 * Filename: Person.java
 * @author: Shraddha Bhagwat
 * Overview: This is the Person class. In this file we have achieved the following
 * - Created Attributes
 * --- String name
 * --- String gender
 * --- int age
 * --- String address
 * --- String mobile
 * - Created Setters and Getters
 * - Created constructors and overloaded them
 * - Created a Display Function to call the getters and display Instance data
 *
 */


public class Person {
    String name;
    String gender;
    int age;
    String address;
    String mobile;
    //Creating default constructor

    public Person() {
        System.out.println("Creating a customer:");

    }
    //Declaring parameterized constructor, using method overloading
    public Person(String name, String gender, int age, String address, String mobile)
    {
        this.setName(name);
        this.setGender(gender);
        this.setAge(age);
        this.setAddress(address);
        this.setMobile(mobile);
    }
    //Using setters and getters
    public void setName(String name){this.name=name;}
    public void setGender(String gender){this.gender=gender;}
    public void setAge(int age){this.age=age;}
    public void setAddress(String address){this.address=address;}
    public void setMobile(String mobile){this.mobile=mobile;}
    public String getName(){return name;}
    public String getGender(){return gender;}
    public int getAge(){return age;}
    public String getAddress(){return address;}
    public String getMobile(){return mobile;}
    //Using display function to show all the values
    public void display()
    {
        System.out.println("Customer's name: "+getName());
        System.out.println("Customer's gender: "+getGender());
        System.out.println("Customer's age: "+getAge());
        System.out.println("Customer's Address: "+getAddress());
        System.out.println("Customer's Mobile No: "+getMobile());
    }

}

