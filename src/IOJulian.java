import person.Contact;
import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class IOJulian {
//    String directory = "data";
//    String filename = "contacts.txt";
//    Path dataDirectory = Paths.get(directory);
//    Path dataFile = Paths.get(filename);

    //  creating method to create a directory
    static void createDirectory(Path directoryName) {
        try {
            if (Files.notExists(directoryName)) {
                Files.createDirectory(directoryName);
            }
        } catch (IOException iox) {
            iox.printStackTrace();
        }
    }

    //  creating method to create a file
    static void createFile(Path directoryName, Path dataFile) {
        try {
            if (Files.notExists(directoryName)) {
                Files.createDirectory(directoryName);
            }
            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }
        } catch (IOException iox) {
            iox.printStackTrace();
        }
    }

    //  method to write in file
    static void writeOnFile(Path dataFile) {
        try {
            if (Files.exists(dataFile)) {
                Files.write(dataFile, Arrays.asList("A.J. Brown | 649-555-5555"));
            }
        } catch (IOException iox) {
            iox.printStackTrace();
        }
    }

    //  method to add to file
    static void addToFile(Path dataFile, List<String> listName) {
        try {
            if (Files.exists(dataFile)) {
                Files.write(dataFile, listName, StandardOpenOption.APPEND);
            }
        } catch (IOException iox) {
            iox.printStackTrace();
        }
    }

    //  method to list contacts
    static void listContacts() {
    }

    static void listContacts(Path fileName) {
        try {
            List<String> contacts = Files.readAllLines(fileName);
            for(String contact : contacts){
                System.out.println(contact);
            }
            System.out.println(contacts);
        } catch (IOException iox) {
            iox.printStackTrace();
        }

    }



    public static void main(String[] args) {
        Input user1 = new Input();
        do{
            String name = user1.getString("Contact Name: ");
            int phone = user1.getInt("Contact Phone: ");
            Contact contact1 = new Contact(name, phone);
        }while(user1.yesNo("Would you like to enter another contact?"));
//        String directory = user1.getString("Name your Directory");
//        String directory = "data";
        String directory = "TitansContacts";
        String filename = "contacts.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

//        createDirectory(dataDirectory);
//        createFile(dataDirectory, dataFile);
//        writeOnFile(dataFile);
//        addToFile(dataFile, Arrays.asList("Julio Jones | 2105555550", "Ryan Tannehill | 2105555551"));






//        listContacts(dataFile);
    }
}
