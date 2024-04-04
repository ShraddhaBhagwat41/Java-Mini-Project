package Model.PostOfficeSchemes;
import Model.displayable;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
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
 * Filename: managescheme_type.java
 * @author:Shraddha Bhagwat
 * Overview: This is the managescheme_type class. In this file we have achieved the following
 * - Created Attributes
 * ---  private int linesBeingDisplayed;
 * ---  private int firstLineIndex;
 * ---  int lastLineIndex;
 * ---  int highlightedLine;
 * - managescheme_type Class extends abstract class FileHandlingScheme_type and implements Interface displayable
 * - Created constructors and overloaded them based on no. of parameters
 * - Created body for abstract class methods
 * - Created method body for the Displayable Interface
 * - The class reads and writes into the Scheme_type.json file by reading and writing it
 * - Created Table for scheme_types
 */



public class managescheme_type extends FileHandlingScheme_type implements displayable {

    ArrayList<Scheme_type> scheme_types = new ArrayList();
    ObjectMapper objectMapper = new ObjectMapper();
    private int linesBeingDisplayed;
    private int firstLineIndex;
    int lastLineIndex;
    int highlightedLine;

    String file_path="Mini project/src/Model/PostOfficeSchemes/Scheme_type.json";

    public managescheme_type() {
        this.readScheme_typeJsonFile(file_path);
    }

    public ArrayList<Scheme_type> readScheme_typeJsonFile(String file_path) {
        scheme_types.removeAll(scheme_types);
        try {
            JsonNode rootNode = objectMapper.readTree(new File(file_path));

            // Iterate through JSON array
            if (rootNode.isArray()) {
                for (JsonNode node : rootNode) {
                    int scheme_id = node.get("scheme_id").asInt();
                    String scheme_name = node.get("name").asText();
                    String scheme_type = node.get("scheme_type").asText();
                    int int_rate = node.get("int_rate").asInt();
                    String eligibility_criteria = node.get("eligibility_criteria").asText();
                    int duration = node.get("duration").asInt();
                    Scheme_type scheme = new Scheme_type(scheme_id, scheme_name, scheme_type, duration, int_rate, eligibility_criteria);
                    scheme_types.add(scheme);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return this.scheme_types;
    }

    public void writeScheme_typeJsonFile(String file_path, ArrayList<Scheme_type> scheme_types) throws IOException {
        this.objectMapper.writeValue(Paths.get(file_path).toFile(),scheme_types);
    }

    public void setScheme_typesTable(ArrayList<Scheme_type> e) {
        this.scheme_types = scheme_types;
    }

    public ArrayList<String> getHeaders() {
        ArrayList<String> headers = new ArrayList();
        headers.add("Id");
        headers.add("Name");
        headers.add("Interest rate");
        headers.add("Duration");
        headers.add("Eligibility criteria");
        headers.add("Type");
        return headers;
    }

    public ArrayList<String> getLine(int line) {
        ArrayList<String> scheme_type_details = new ArrayList();
        scheme_type_details.add(String.valueOf(this.scheme_types.get(line).getScheme_id()));
        scheme_type_details.add(this.scheme_types.get(line).getName());
        scheme_type_details.add(String.valueOf(this.scheme_types.get(line).getInt_rate()));
        scheme_type_details.add(String.valueOf(this.scheme_types.get(line).getDuration()));
        scheme_type_details.add(this.scheme_types.get(line).getEligibility_criteria());
        scheme_type_details.add(this.scheme_types.get(line).getScheme_type());
        return scheme_type_details;
    }

    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
        ArrayList<ArrayList<String>> scheme_types_subset = new ArrayList();

        for(int i = firstLine; i <= lastLine; ++i) {
            scheme_types_subset.add(this.getLine(i));
        }

        return scheme_types_subset;
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

    public ArrayList<Scheme_type> getTable() {
        return this.scheme_types;
    }
    public void addNewScheme(int scheme_id, String scheme_type, String scheme_name, int duration, int int_rate, String eligibility_criteria)throws IOException{
        readScheme_typeJsonFile(file_path);
        Scheme_type temp_tas=new Scheme_type(scheme_id,  scheme_type,  scheme_name,  duration,  int_rate,  eligibility_criteria);
        scheme_types.add(temp_tas);
        writeScheme_typeJsonFile(file_path,scheme_types);

    }
    public void EditScheme(int edit_sch_idx, Integer scheme_id, String scheme_name, String scheme_type, String eligibility, int duration, int int_rate)throws IOException{
        readScheme_typeJsonFile(file_path);
        scheme_types.get(edit_sch_idx).setScheme_id(scheme_id);
        scheme_types.get(edit_sch_idx).setName(scheme_name);
        scheme_types.get(edit_sch_idx).setScheme_types(scheme_type);
        scheme_types.get(edit_sch_idx).setEligibility(eligibility);
        scheme_types.get(edit_sch_idx).setDuration(duration);
        scheme_types.get(edit_sch_idx).setIntrate(int_rate);
    }
    public int DeleteScheme(int del_sch_id)throws IOException{
        readScheme_typeJsonFile(file_path);
        int s_id=scheme_types.get(del_sch_id).getScheme_id();
        scheme_types.remove(del_sch_id);
        writeScheme_typeJsonFile(file_path,scheme_types);
        return s_id;

    }
}


