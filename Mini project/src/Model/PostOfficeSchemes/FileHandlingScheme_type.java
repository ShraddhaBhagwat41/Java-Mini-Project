package Model.PostOfficeSchemes;

import java.io.IOException;
import java.util.ArrayList;
/**
 * Identification comments:
 *   Name:Shraddha Bhagwat
 *   Experiment No: 07
 *   Experiment Title: Implementing JSON File Handling in Java to store relationship objects data.Reading a json file
 *     to objects and writing objects to a json data file
 *   Experiment Date: 20/02/24
 *   @version 1.0
 *
 *
 * Beginning comments:
 * Filename: FileHandlingScheme_type.java
 * @author: Shraddha Bhagwat
 * Overview: This is the FileHandlingScheme_type Abstract class. In this file we have achieved the following
 *
 * - Created protected Abstract Methods for Array List of Scheme_type by passing parameters
 * - Methods created for the abstract class read and write the Scheme_type.json file
 */

public abstract class FileHandlingScheme_type {
        public FileHandlingScheme_type(){}
        protected abstract ArrayList<Scheme_type> readScheme_typeJsonFile(String file_path);
        protected abstract void writeScheme_typeJsonFile(String file_path, ArrayList<Scheme_type> scheme_types) throws IOException;
    }

