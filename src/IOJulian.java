import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class IOJulian {
    //    String directory = "data";
//    String filename = "contacts.txt";
//
//    Path dataDirectory = Paths.get(directory);
//    Path dataFile = Paths.get(filename);

    //  creating method to create a directory
    static void createDirectory(Path directoryName){
        try{
            if(Files.notExists(directoryName)){
                Files.createDirectory(directoryName);
            }
        }catch(IOException iox){
            iox.printStackTrace();
        }
    }

    //  creating method to create a file
    static void createFile(Path directoryName, Path dataFile){
        try{
            if(Files.notExists(directoryName)){
                Files.createDirectory(directoryName);
            }
            if(!Files.exists(dataFile)){
                Files.createFile(dataFile);
            }
        }catch (IOException iox){
            iox.printStackTrace();
        }
    }

    //  method to write in file
    static void writeOnFile(Path dataFile){
        try{
            if(Files.exists(dataFile)){
                Files.write(dataFile, Arrays.asList("A.J. Brown | 649-555-5555"));
            }
        }catch(IOException iox){
            iox.printStackTrace();
        }
    }

    //  method to list contacts
    static void listContacts(){}
    static void listContacts(Path fileName){
    try{
        List<String> contacts = Files.readAllLines(fileName);
    }catch(IOException iox){
        iox.printStackTrace();
    }

    }

    public static void main(String[] args) {
        Input user1 = new Input();
        String directory = user1.getString("Name your Directory");
//        String directory = "data";
        String filename = "contacts.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

//        createDirectory(dataDirectory);
        createFile(dataDirectory, dataFile);
        writeOnFile(dataFile);

    }
}
