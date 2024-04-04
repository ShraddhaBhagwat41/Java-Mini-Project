package Model.People;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
 * Filename: manageCustomer.java
 * @author:Shraddha Bhagwat
 * Overview: This is the manageCustomer class. In this file we have achieved the following
 * - Created Attributes
 * ---  private int linesBeingDisplayed;
 * ---  private int firstLineIndex;
 * ---  int lastLineIndex;
 * ---  int highlightedLine;
 * - manageCustomer Class extends abstract class FileHandlingCustomer and implements Interface displayable
 * - Created constructors and overloaded them based on no. of parameters
 * - Created body for abstract class methods
 * - Created method body for the Displayable Interface
 * - The class reads and writes into the Customer.json file by reading and writing it
 * - Created Table for Customer
 */


public class manageCustomer extends FileHandlingCustomer{

    ArrayList<Customer> customers = new ArrayList();
    ObjectMapper objectMapper = new ObjectMapper();
    private int linesBeingDisplayed;
    private int firstLineIndex;
    int lastLineIndex;
    int highlightedLine;
    String filePath = "Mini project/src/Model/People/Customer.json";

    public manageCustomer() {
        this.readCustomerJsonFile(filePath);
    }

    public ArrayList<Customer> readCustomerJsonFile(String filePath) {customers.removeAll(customers);

        try {
            JsonNode rootNode = objectMapper.readTree(new File(filePath));

            // Iterate through JSON array
            if (rootNode.isArray()) {
                for (JsonNode node : rootNode) {
                    int id = node.get("id").asInt();
                    String name = node.get("name").asText();
                    String gender = node.get("gender").asText();
                    int age = node.get("age").asInt();
                    String address = node.get("address").asText();
                    String mobile = node.get("mobile").asText();
                    long aadhar_no = node.get("aadhar_no").asLong();
                    Customer cust = new Customer(id,  name, gender, age, address, mobile,aadhar_no);
                    customers.add(cust);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return this.customers;
    }


public void writeCustomerJsonFile(String file_path, ArrayList<Customer> Customers) throws IOException {
    ArrayList<Map<String, Object>> Customers_to_be_written = new ArrayList<>();
    for (int i = 0; i < Customers.size(); i++) {
        HashMap<String, Object> data = new HashMap<>();
        data.put("id", Customers.get(i).getId());
        data.put("name", Customers.get(i).getName());
        data.put("gender", Customers.get(i).getGender());
        data.put("age", Customers.get(i).getAge());
        data.put("address", Customers.get(i).getAddress());
        data.put("mobile", Customers.get(i).getMobile());
        data.put("aadhar_no", Customers.get(i).getAadhar_no());
        Customers_to_be_written.add(data);
    }
    objectMapper.writeValue(Paths.get(file_path).toFile(), Customers_to_be_written);
}

    public void setCustomerTable(ArrayList<Customer> e) {
        this.customers = customers;
    }

    public ArrayList<String> getHeaders() {
        ArrayList<String> headers = new ArrayList();
        headers.add("id");
        headers.add("name");
        headers.add("gender");
        headers.add("age");
        headers.add("address");
        headers.add("mobile");
        headers.add("aadhar_no");
        return headers;
    }

    public ArrayList<String> getLine(int line) {
        ArrayList<String> customer_details = new ArrayList();
        customer_details.add(String.valueOf(this.customers.get(line).getId()));
        customer_details.add(this.customers.get(line).getName());
        customer_details.add(this.customers.get(line).getGender());
        customer_details.add(String.valueOf(this.customers.get(line).getAge()));
        customer_details.add(String.valueOf(this.customers.get(line).getAddress()));
        customer_details.add(this.customers.get(line).getMobile());
        customer_details.add(String.valueOf(this.customers.get(line).getAadhar_no()));
        return customer_details;
    }

    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
        ArrayList<ArrayList<String>> customers_subset = new ArrayList();

        for(int i = firstLine; i <= lastLine; ++i) {
            customers_subset.add(this.getLine(i));
        }

        return customers_subset;
    }

    public int getFirstLineToDisplay() {
        return this.firstLineIndex;
    }

    public int getLineToHighlight() {
        return this.highlightedLine;
    }

    public int getLastLineToDisplay() {
        this.setLastLineToDisplay(this.getFirstLineToDisplay() + this.getLinesBeingDisplayed() - 1);
        return this.lastLineIndex;
    }

    public int getLinesBeingDisplayed() {
        return this.linesBeingDisplayed;
    }

    public void setFirstLineToDisplay(int firstLine) {
        this.firstLineIndex = firstLine;
    }

    public void setLineToHighlight(int highlightedLine) {
        this.highlightedLine = highlightedLine;
    }

    public void setLastLineToDisplay(int lastLine) {
        this.lastLineIndex = lastLine;
    }

    public void setLinesBeingDisplayed(int numberOfLines) {
        this.linesBeingDisplayed = numberOfLines;
    }

    public ArrayList<Customer> getTable() {
        return this.customers;
    }
    public void addNewCustomer(int id, String name, String gender, int age, String address, String mobile, long aadhar_no) throws IOException{
        readCustomerJsonFile(filePath);
        Customer temp_cust=new Customer(id,  name, gender, age,  address, mobile,aadhar_no);
        customers.add(temp_cust);
        writeCustomerJsonFile(filePath,customers);

    }
    public void editCustomer(int edit_cust_idx, int id, String name, String gender, int age, String address, String mobile, long aadhar_no) throws IOException {
        readCustomerJsonFile(filePath);
        customers.get(edit_cust_idx).setId(id);
        customers.get(edit_cust_idx).setName(name);
        customers.get(edit_cust_idx).setGender(gender);
        customers.get(edit_cust_idx).setAge(age);
        customers.get(edit_cust_idx).setAddress(address);
        customers.get(edit_cust_idx).setMobile(mobile);
        customers.get(edit_cust_idx).setAadhar_no(aadhar_no);
        writeCustomerJsonFile(filePath, customers);
    }
    public int deleteCustomer(int del_cust_id) throws IOException {
        readCustomerJsonFile(filePath);
        int c_id = customers.get(del_cust_id).getId();
        customers.remove(del_cust_id);
        writeCustomerJsonFile(filePath,customers);
        return c_id;
    }}
