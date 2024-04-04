package Model.PostOfficeSchemes;
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
 * Filename: Scheme_type.java
 * @author: Shraddha Bhagwat
 * Overview: This is the Scheme_type class. In this file we have achieved the following
 * - Created Attributes
 * --- int scheme_id
 * --- String scheme_type
 *  --- int scheme_count which is declared as static variable

 * - Created Setters and Getters
 * - Created constructors and overloaded them based on no. of parameters
 * - Created static setters and getters
 * - Made use of single inheritance where Schemes Class is the base class and Scheme_type Class is derived class
 * - Accessed methods of base class using the keyword super
 * - Created a Display Function to call the getters and display Instance data
 *
 */
public class Scheme_type extends Schemes{private static int scheme_count=0;
    int scheme_id;
    String scheme_type;

    public static void setScheme_count(int scheme_count){Scheme_type.scheme_count=scheme_count;}
    public static int getScheme_count(){return scheme_count;}
    //Declaring a default constructor
    public Scheme_type()
    {
        setScheme_count(getScheme_count()+1);
        setScheme_id(getScheme_count());
    }
    //Declaring a parameterized constructor, method overloading
    // super keyword automatically calls the constructor from parent class
    public Scheme_type(String scheme_type, String scheme_name, int duration, int int_rate, String eligibility_criteria)
    {
        super(scheme_name, duration, int_rate, eligibility_criteria);
        setScheme_id(getScheme_count()+1);
        this.setScheme_id(scheme_count);
        this.setScheme_types(scheme_type);
    }
    public Scheme_type(int scheme_id, String scheme_type, String scheme_name, int duration, int int_rate, String eligibility_criteria)
    {
        super(scheme_name,duration,int_rate,eligibility_criteria);
        setScheme_id(getScheme_count()+1);
        this.setScheme_id(scheme_id);
        this.setScheme_types(scheme_type);
    }
    //Creating setters and getters
    public void setScheme_id(int scheme_id) {
        this.scheme_id = scheme_id;
    }

    public void setScheme_types(String scheme_type) {
        this.scheme_type = scheme_type;
    }

    public int getScheme_id() {
        return scheme_id;
    }

    public String getScheme_type() {
        return scheme_type;
    }



    //Display function used for displaying all the values

    public void display()
    {
        System.out.println("Scheme Id: "+getScheme_id());
        System.out.println("Scheme type: "+getScheme_type());

        super.display();
    }


}


