package Model.Enrolls;

import Model.People.Customer;
import Model.PostOfficeSchemes.Scheme_type;
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
 * Filename: Enrolls.java
 * @author: Shraddha Bhagwat
 * Overview: This is the Enrolls class. In this file we have achieved the following
 * - Created Attributes
 * Customer c_temp
 * Scheme_type s_temp
 * String date
 * int amt
 * - Created Setters and Getters
 * - Created a Display Function to call the getters and display Instance data
 *
 */

public class Enrolls {
    Customer c_temp;
    Scheme_type s_temp;
    String date;
    int amt;

    public Enrolls(Customer c_temp, Scheme_type s_temp, String date, int amt)
    {
        setC_temp(c_temp);
        setS_temp(s_temp);
        setDate(date);
        setAmount(amt);
    }

    public void setC_temp(Customer c_temp) {
        this.c_temp = c_temp;
    }

    public void setS_temp(Scheme_type s_temp) {
        this.s_temp = s_temp;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAmount(int amt) {
        this.amt = amt;
    }

    public Customer getC_temp() {return c_temp;}

    public Scheme_type getS_temp() {
        return s_temp;
    }

    public String getDate() {
        return date;
    }

    public int getAmount() {
        return amt;
    }
}
