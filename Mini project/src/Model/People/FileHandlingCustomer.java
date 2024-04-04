package Model.People;


import java.io.IOException;
import java.util.ArrayList;
/**
 * Identification comments:
 *   Name: Shraddha Bhagwat
 *   Experiment No: 07
 *   Experiment Title: Implementation of Abstract Class and Abstract Methods for the entities of the relationship and Implementing JSON File Handling in Java to store objects data. Reading a json file to objects and writing objects to a json data file.
 *   Experiment Date: 20/02/24
 *   @version 1.0
 *
 *
 * Beginning comments:
 * Filename: FileHandlingCustomer.java
 * @author: Shraddha Bhagwat
 * Overview: This is the FileHandlingCustomer Abstract class. In this file we have achieved the following
 *
 * - Created protected Abstract Methods for Array List of Customer by passing parameters
 * - Methods created for the abstract class read and write the Customer.json file
 */

public abstract class FileHandlingCustomer {
    public FileHandlingCustomer(){}
    protected abstract ArrayList<Customer> readCustomerJsonFile(String file_path);
    protected abstract void writeCustomerJsonFile(String file_path, ArrayList<Customer> customers) throws IOException;
}

