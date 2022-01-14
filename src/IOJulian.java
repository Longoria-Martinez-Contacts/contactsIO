import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOJulian {
    //    String directory = "data";
//    String filename = "contacts.txt";
//
//    Path dataDirectory = Paths.get(directory);
//    Path dataFile = Paths.get(filename);

    //  creating method to create a directory
    public static void createDirectory(Path directoryName){
        try{
            if(Files.notExists(directoryName)){
                Files.createDirectory(directoryName);
            }
        }catch(IOException iox){
            iox.printStackTrace();
        }
    }

    //  creating method to create a file
    public void createFile(Path dataFile){
        try{
            if(Files.notExists(dataFile)){
                Files.createFile(dataFile);
            }
        }catch (IOException iox){
            iox.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Input user1 = new Input();
        String directory = user1.getString("Name your Directory");
//        String directory = "data";
//        String filename = "contacts.txt";

        Path dataDirectory = Paths.get(directory);
//        Path dataFile = Paths.get(filename);

        createDirectory(dataDirectory);
    }
}
