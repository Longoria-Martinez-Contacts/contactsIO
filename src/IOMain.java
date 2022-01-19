import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class IOMain {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("WELCOME TO CODEUP DIRECTORY");


        String directory = "data";
        String filename = "directory.txt";

        //Adding second datafile for contacts
        String filename2 = "contacts.txt";


        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        //Adding second datafile for contacts
        Path dataFile2 = Paths.get(directory, filename2);

//        System.out.println(dataDirectory);
//        System.out.println(dataFile);

        try {
            //Files class - contains static method to read, write, create, and delete files.
            //.exist(Path filepath) - checks whether or not the file exists.
            //.notExists(Path filepath)
            if(Files.notExists(dataDirectory)) {
                // create a new directory if the file does not exist
                //.createDirectory(Path filepath)
                //.createDirectories(Path filepath)
                Files.createDirectory(dataDirectory);
            }

            if(!Files.exists(dataFile)) {
                //.creatFile(Path filepath)
                Files.createFile(dataFile);
            }

            if(Files.exists(dataFile)) {
                //.write(Path filepath, List<String list, StandardOpenOption.APPEND[optional])
                Files.write(dataFile, Arrays.asList("View Contacts", "Add a new contact", "Search a contact by name", "Delete an existing contact", "Exit"));
//                Files.write(dataFile, Arrays.asList("Hades", "Oeimos", "Apollo"), StandardOpenOption.APPEND);
            }


            ////addition of second data file with contacts
            if(!Files.exists(dataFile2)) {
                //.creatFile(Path filepath)
                Files.createFile(dataFile2);
            }

            if(Files.exists(dataFile2)) {
                //.write(Path filepath, List<String list, StandardOpenOption.APPEND[optional])
                Files.write(dataFile2, Arrays.asList("Sam Jon | 4321987654", "Sammy Shawn | 2107654321", "Samuel Willy | 2109433421", "Samson Jacobs | 2109805432", "Sam I Am | 2109876789"));
//                Files.write(dataFile, Arrays.asList("Hades", "Oeimos", "Apollo"), StandardOpenOption.APPEND);
            }

            ///End of Addition

        } catch(IOException iox) {
            iox.printStackTrace();
        }

        try {
            //Reading Files
            //Create a List of strings that represents the file data.

            List<String> contacts = Files.readAllLines(dataFile2);

//            System.out.println(Files.readAllLines(dataFile2));

            for(String contact : contacts) {
//                System.out.println(contact);
            }
//            System.out.println(contacts);


            //Create bucket to execute User input
            List<String> bucket = new ArrayList<>();

//            for(String contact : contacts) {
//                if(contact.equals("1")) {
//                    //replace Hercules with Hera, then move to the next iteration
//                    bucket.add("Hera");
//                    continue;
//                }
//                //copy all god strings to new list
//                bucket.add(contact);
//            }

//            Files.write(dataFile, bucket);
//            gods.remove("Hercules");
//            gods.add(0, "Hera");

//            Files.write(dataFile, contacts);
            Path contactsPath = Paths.get("data", "directory.txt");
            List<String> directoryList = Files.readAllLines(contactsPath);

            for (int i = 0; i < directoryList.size(); i += 1) {
                System.out.println((i + 1) + ". " + directoryList.get(i));
            }

            //rewrite the file with correct god list
        } catch(IOException iox) {
            iox.printStackTrace();

        }

        System.out.println("Enter an Option (1, 2, 3, 4 or 5):");

//...

        Scanner scan = new Scanner(System.in);

        scan= scan.useDelimiter("\n");

        int userNumber = scan.nextInt();

//        BufferedReader br = new BufferedReader(new FileReader("contacts.txt"));
//        String line;
//        while ((line = br.readLine()) != null) {
//            System.out.println(line);
//        }
//        System.out.println(Files.readAllLines(dataFile2));
//        String s = scan.next();
//        int i = scan.nextInt();


//        Path Files.write(Path filepath, List<String> lines[, StandardOpenOption option])
//
//        List<String> Files.readAllLines(Path filepath)
//
//        List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");
//        Path filepath = Paths.get("data", "contacts.txt");
//        Files.write(filepath, groceryList);
//


//        util.Input input = new util.Input();
//        ContactsList Directory = new ContactsList();
//        boolean cont = true;
//
//        ContactsList lists = new ContactsList();
//
//        do {
////            input = input.();
//
//            switch (input) {
//
//                case OPTIONS:
//                    System.out.println("1. View Contacts\n");
//                    lists.printAllContacts();
//
//                case ADD:
//
//                    System.out.println("2. Add A New Contact\n");
//
//                case SEARCH:
//
//                    System.out.println("3. Search A Contact By Name\n");
//
//                case DELETE:
//
//                    System.out.println("4. Delete An Existing Contact\n");
//
//                case EXIT:
//
//                    System.out.println("5. EXIT...\n");
//                    cont = false;
//            }
//
//        } while (cont);
    }
}

