package Model.Enrolls;

import Model.PostOfficeSchemes.Scheme_type;

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
 * Filename: FileHandlingEnrolls.java
 * @author: Shraddha Bhagwat
 * Overview: This is the FileHandlingEnrolls Abstract class. In this file we have achieved the following
 *
 * - Created protected Abstract Methods for Array List of Enrolls by passing parameters
 * - Methods created for the abstract class read and write the Enrolls.json file
 */

public abstract class FileHandlingEnrolls {
    protected abstract ArrayList<Enrolls> readEnrollsJsonFile(String file_path);
    protected abstract void writeEnrollsJsonFile(String file_path, ArrayList<Enrolls> enrolls) throws IOException;
}

