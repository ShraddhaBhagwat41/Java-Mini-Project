package Model.PostOfficeSchemes;
/**
 * Identification comments:
 *   Name:Shraddha Bhagwat
 *   Experiment No: 07
 *   Experiment Title: Implementing JSON File Handling in Java to store relationship objects data.Reading a json file
 *   to objects and writing objects to a json data file
 *   Experiment Date: 20/02/24
 *   @version 1.0
 *
 *
 * Beginning comments:
 * Filename: Schemes.java
 * @author: Shraddha Bhagwat
 * Overview: This is the Schemes class. In this file we have achieved the following
 * - Created Attributes
 * --- String scheme_name
 * --- int duration
 * --- int int_rate
 * --- String eligibility_criteria
 * - Created Setters and Getters
 * - Created constructors and overloaded them
 * - Created a Display Function to call the getters and display Instance data
 *
 */

public class Schemes {String scheme_name;
    int duration;
    int int_rate;
    String eligibility_criteria;


    //Creating default constructor
    public Schemes(){
//        System.out.println("Creating a Scheme");
    }
    //Declaring parameterized constructor, using method overloading

    public Schemes(String scheme_name, int duration, int int_rate, String eligibility_criteria){
        this.setName(scheme_name);
        this.setDuration(duration);
        this.setIntrate(int_rate);
        this.setEligibility(eligibility_criteria);
    }
    //Using setters and getters
    public void setName(String scheme_name){this.scheme_name=scheme_name;}
    public void setDuration(int duration){this.duration=duration;}
    public void setIntrate(int int_rate){this.int_rate=int_rate;}
    public void setEligibility(String eligibility_criteria){this.eligibility_criteria=eligibility_criteria;}

    public String getName(){return scheme_name;}
    public int getDuration(){return duration;}

    public int getInt_rate() {
        return int_rate;
    }

    public String getEligibility_criteria() {
        return eligibility_criteria;
    }



    //Using display function to show all the values
    public void display()
    {
        System.out.println("Scheme name:"+getName());
        System.out.println("Scheme's duration:"+getDuration());
        System.out.println("Scheme's interest rate:"+getInt_rate());
        System.out.println("Scheme's eligibility criteria:"+getEligibility_criteria());
    }

}


