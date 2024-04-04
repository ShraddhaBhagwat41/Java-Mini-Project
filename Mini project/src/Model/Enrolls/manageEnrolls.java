package Model.Enrolls;

import Model.People.Customer;
import Model.People.manageCustomer;
import Model.PostOfficeSchemes.Scheme_type;
import Model.PostOfficeSchemes.managescheme_type;
import Model.displayable;
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
 * Filename: manageEnrolls.java
 * @author:Shraddha Bhagwat
 * Overview: This is the manageEnrollsclass. In this file we have achieved the following
 * - Created Attributes
 * ---  private int linesBeingDisplayed;
 * ---  private int firstLineIndex;
 * ---  int lastLineIndex;
 * ---  int highlightedLine;
 * - manageEnrolls Class extends abstract class FileHandlingEnrolls and implements Interface displayable
 * - Created constructors and overloaded them based on no. of parameters
 * - Created body for abstract class methods
 * - Created method body for the Displayable Interface
 * - The class reads and writes into the Enrolls.json file by reading and writing it
 * - Created Table for Enrolls
 */


public class manageEnrolls extends FileHandlingEnrolls implements displayable {
    ArrayList<Customer> customers = new ArrayList<Customer>();

    ArrayList<Scheme_type> scheme_types = new ArrayList<Scheme_type>();

    ArrayList<Enrolls> enrolls = new ArrayList<Enrolls>();

    ObjectMapper objectMapper = new ObjectMapper();
    ArrayList<Map<String, Object>> enroll_data = new ArrayList<>();

    private int linesBeingDisplayed;
    private int firstLineIndex;
    int lastLineIndex;
    int highlightedLine;
    String filePath = "Mini project/src/Model/Enrolls/Enrolls.json";
    Customer c_temp_obj = new Customer();
    Scheme_type s_temp_obj = new Scheme_type();

    public manageEnrolls(){
        manageCustomer ms1 = new manageCustomer();
        customers = ms1.getTable();
        managescheme_type ps1 = new managescheme_type();
        scheme_types = ps1.getTable();
        readEnrollsJsonFile(filePath);
    }

    public ArrayList<Enrolls>  readEnrollsJsonFile(String file_path){
        enrolls.removeAll(enrolls);
        try{
            JsonNode rootNode = objectMapper.readTree(new File(file_path));


            if (rootNode.isArray()){
                for(JsonNode node : rootNode){

                    int c_temp = node.get("c_temp").asInt();
                    for (Customer customer : customers) {
                        if (c_temp == customer.getId()) {
                            c_temp_obj = customer;
                        }
                    }
                    int s_temp = node.get("s_temp").asInt();
                    for (Scheme_type scheme_type : scheme_types) {
                        if (s_temp == scheme_type.getScheme_id()) {
                            s_temp_obj = scheme_type;
                        }
                    }

                    String date = node.get("date").asText();
                    int amt = node.get("amt").asInt();
                    enrolls.add(new Enrolls(c_temp_obj,s_temp_obj,date,amt));
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        return enrolls;
    }

    public void writeEnrollsJsonFile(String file_path, ArrayList<Enrolls> enrolls) throws IOException{
        ArrayList<Map<String, Object>> enrolls_to_be_written = new ArrayList<>();

        for (int i = 0; i < enrolls.size(); i++) {
            HashMap <String, Object> data = new HashMap<>();
            data.put("c_temp", enrolls.get(i).getC_temp().getId());
            data.put("s_temp", enrolls.get(i).getS_temp().getScheme_id());
            data.put("date", enrolls.get(i).getDate());
            data.put("amt", enrolls.get(i).getAmount());
            enrolls_to_be_written.add(data);

        }

        objectMapper.writeValue(Paths.get(file_path).toFile(), enrolls_to_be_written);
    }

    public void display(){
        for(int i=0; i<enrolls.size(); i++){
            System.out.print("c_temp");
            System.out.print(enrolls.get(i).getC_temp().getId());
            System.out.print("s_temp");
            System.out.print(enrolls.get(i).getS_temp().getScheme_id());
            System.out.print("date");
            System.out.print(enrolls.get(i).getDate());
            System.out.print("amt");
            System.out.print(enrolls.get(i).getAmount());
            System.out.print("\n-----------------------------------------------------");
        }
    }
    public ArrayList<String> getHeaders() {

        ArrayList<String> headers=new ArrayList<String>();
        headers.add("c_temp");
        headers.add("s_temp");
        headers.add("date");
        headers.add("amt");
        return headers;
    }

    public ArrayList<String> getLine(int line){
        readEnrollsJsonFile(filePath);
        ArrayList<String> enrolls_single_line = new ArrayList<String >();

        enrolls_single_line.add(String.valueOf(enrolls.get(line).getC_temp().getId()));
        enrolls_single_line.add(String.valueOf(enrolls.get(line).getS_temp().getScheme_id()));
        enrolls_single_line.add(enrolls.get(line).getDate());
        enrolls_single_line.add(String.valueOf(enrolls.get(line).getAmount()));

        return enrolls_single_line;
    }

    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
        readEnrollsJsonFile(filePath);
        ArrayList<ArrayList<String>> enrolls_subset = new ArrayList<ArrayList<String>>();

        for (int i = firstLine; i <= lastLine; i++) {
            enrolls_subset.add(getLine(i));
        }
        return enrolls_subset;
    }

    public int getFirstLineToDisplay() {
        return firstLineIndex;
    }

    @Override
    public int getLineToHighlight() {
        return highlightedLine;
    }

    @Override
    public int getLastLineToDisplay() {
        setLastLineToDisplay(getFirstLineToDisplay()+getLinesBeingDisplayed()-1);
        return lastLineIndex;
    }

    @Override
    public int getLinesBeingDisplayed() {
        return linesBeingDisplayed;
    }

    @Override
    public void setFirstLineToDisplay(int firstLine) {
        this.firstLineIndex=firstLine;

    }

    @Override
    public void setLineToHighlight(int highlightedLine) {
        this.highlightedLine=highlightedLine;

    }

    @Override
    public void setLastLineToDisplay(int lastLine) {this.lastLineIndex=lastLine;

    }

    @Override
    public void setLinesBeingDisplayed(int numberOfLines) {this.linesBeingDisplayed=numberOfLines;

    }
    public ArrayList<Enrolls> getTable() {
        return enrolls;
    }

    public void deleteEnrolls(int delete_enrolls_idx) throws IOException {
        readEnrollsJsonFile(filePath);
        enrolls.remove(delete_enrolls_idx);
        try {
            writeEnrollsJsonFile(filePath, enrolls);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    public void addNewEnrolls(int c_temp, int s_temp, String date, int amt) throws IOException{
        readEnrollsJsonFile(filePath);
        customers = new manageCustomer().readCustomerJsonFile("Mini project/src/Model/People/Customer.json");
        scheme_types = new managescheme_type().readScheme_typeJsonFile("Mini project/src/Model/PostOfficeSchemes/Scheme_type.json");
        enrolls.add(new Enrolls(customers.get(c_temp-1),scheme_types.get(s_temp-1),date,amt));
        try{
            writeEnrollsJsonFile(filePath,enrolls);
        }
        catch(IOException e){
            throw new RuntimeException(e);}
    }
    public void editEnrolls(int index, int c_temp, int s_temp, String date, int amt) throws IOException {
        readEnrollsJsonFile(filePath);
        Scheme_type s_o = null;
        Customer c_o = null;
        for (int i = 0; i < scheme_types.size(); i++) {

            if (s_temp == scheme_types.get(i).getScheme_id()) {
                s_o = scheme_types.get(i);
            }
        }
        for (int i = 0; i < customers.size(); i++) {

            if (c_temp == customers.get(i).getId()) {
                c_o = customers.get(i);
            }
        }
        enrolls.get(index).setC_temp(c_o);
        enrolls.get(index).setS_temp(s_o);
        enrolls.get(index).setDate(date);
        enrolls.get(index).setAmount(amt);
        try {
            writeEnrollsJsonFile(filePath, enrolls);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


