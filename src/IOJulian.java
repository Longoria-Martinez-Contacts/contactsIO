import person.Contact;
import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Collections;
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
//            for(String contact : contacts){
//                System.out.println(contact);
//            }
            System.out.println(contacts);
        } catch (IOException iox) {
            iox.printStackTrace();
        }
    }

    static void singleContact(Path fileName, String searchName) {
        try {
            List<String> contacts = Files.readAllLines(fileName);
            for (String contact : contacts) {
                if (contact.contains(searchName)) {
                    System.out.println(contact);
                } else {
                    break;
                }
            }
        } catch (IOException iox) {
            iox.printStackTrace();
        }
    }

    static boolean listContact(Path fileName, String searchName) {
        try {
            List<String> contacts = Files.readAllLines(fileName);
            for (String contact : contacts) {
                if (contact.contains(searchName)) {
                    System.out.println(contact);
                    break;
                }
            }
        } catch (IOException iox) {
            iox.printStackTrace();
        }
        return true;
    }


    public static void main(String[] args) throws IOException {
        Input user1 = new Input();
        String directory = "TitansContacts";
//        String directory = user1.getString("Name your Directory");
//        String directory = "data";
        String filename = "contacts.txt";
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);
        List<String> contacts = Files.readAllLines(dataFile);

        //  do/while loop to add contacts to contacts.txt
        //  This will occur if user selects ->"2"<- 2. Add a new contact
//        do{
//            String name = user1.getString("Contact Name: ");
//            int phone = user1.getInt("Contact Phone: ");
//            Contact contact1 = new Contact(name, phone);
//            addToFile(dataFile, Arrays.asList(contact1.getName() + "|" + contact1.getPhone()));
//            user1.yesNo("Would you like to enter another contact?");
//        }while(user1.yesNo());

        //  This will occur if user selects ->"3"<- 3. Search a contact by name
        //  Will need a do/while loop to ask user if they would like to search a different name
        //  Will also need to create if/else for contact listed or no such contact please try again
        do {
            listContacts(dataFile);
            String searchContact = user1.getString("Who would you like to search for: ");
            boolean doesExist = listContact(dataFile, searchContact);
            if (doesExist) {
                singleContact(dataFile, searchContact);
            } else {
                user1.yesNo("Sorry no one by that name. \nWould you like to search again?");
                if (user1.yesNo()) {
                    String searchContact2 = user1.getString("Who would you like to search for: ");
                    singleContact(dataFile, searchContact2);
                }
            }
        } while (user1.yesNo());

//    listContact(dataFile, "Brown");
//        searchContacts(dataFile, "Ryan");


//        listContacts(dataFile);
    }
}
