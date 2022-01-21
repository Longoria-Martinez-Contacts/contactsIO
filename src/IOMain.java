import util.Input;

import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.io.File;


public class IOMain {
    public static void main(String[] args) throws IOException {
        Input input = new Input();

        System.out.println("\nWELCOME TO CODEUP DIRECTORY");


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
                Files.write(dataFile2, Arrays.asList("Sam Jon | 4321987654", "Tammy Shawn | 2107654321", "Manuel Willy | 2109433421", "Ramson Jacobs | 2109805432", "Dan I Am | 2109876789"));
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

        //Commented out old scanner return
//        Scanner scan = new Scanner(System.in);
//
//        scan= scan.useDelimiter("\n");
//
//        int userNumber = scan.nextInt();

//        System.out.println(Paths.get("data", "contacts.txt"));

        //old scanner return end

//        BufferedReader br = new BufferedReader(new FileReader("contacts.txt"));
//        String line;
//        while ((line = br.readLine()) != null) {
//            System.out.println(line);
//        }
//        Path2 contactsPath2 = Paths.get("data", "contacts.txt");
//        List<String> directoryList = Files.readAllLines(contactsPath2);
//        System.out.println(contactsList.get);
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


//        Input input = new util.Input();
//        ContactsList Directory = new ContactsList();
        boolean confirm = true;

//        ContactsList lists = new ContactsList();

        do {
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            switch (userInput) {

                case 1:
                    System.out.println("\nName | Phone number");
                    System.out.println("--------------------");
                    try {
                        List<String> contacts = Files.readAllLines(dataFile2);
                        for(String contact : contacts) {
                System.out.println(contact);
                        }
//            System.out.println(contacts);
//                        System.out.println(new File("data/contacts.txt"));
                        System.out.println("\n**Enter an Option (1=CONTACTS, 2=ADD, 3=SEARCH, 4=DELETE or 5=EXIT): ");
                        break;
                    } catch(IOException iox) {
                        iox.printStackTrace();

                    }

                case 2:

//                    System.out.println("To add a new contact input first & last name");
                    try {
                        Scanner sc = new Scanner(System.in);
                        System.out.println("(ADD) To add a new contact input first name: ");
                        String firstName = sc.next();
                        System.out.println("Now input last name: ");
                        String lastName = sc.next();
                        System.out.println("Last input phone number: ");
                        String phoneNumber = sc.next();
//                        System.out.println(firstName + " " + lastName);
                        String listName = firstName + " " + lastName + " | " + phoneNumber;

                        //try adding 83-85 String contact : contacts or iteration
                        //new bucket array not saving, used append instead of add
                        //resets the list everytime option 2 is used
                        if(Files.exists(dataFile2)) {
//                            .write(Path filepath, List<String list, StandardOpenOption.APPEND[optional])
                            Files.write(dataFile2, Arrays.asList("Sam Jon | 4321987654", "Tammy Shawn | 2107654321", "Manuel Willy | 2109433421", "Ramson Jacobs | 2109805432", "Dan I Am | 2109876789"));
                Files.write(dataFile2, Arrays.asList(listName), StandardOpenOption.APPEND);
                        }

                        System.out.println("Name | Phone number\n--------------------");

                        List<String> contacts = Files.readAllLines(dataFile2);
                        for(String contact : contacts) {
                            System.out.println(contact);
                        }
                        System.out.println("\n**Enter an Option (1=CONTACTS, 2=ADD, 3=SEARCH, 4=DELETE or 5=EXIT): ");
                    break;
                    } catch (IOException iox) {
                        iox.printStackTrace();
                    }

                case 3:
                    System.out.println("(SEARCH) Input a contact name or phone number: ");
                    Scanner scan3 =  new Scanner(System.in);
                    String userSearch = scan3.nextLine().trim().toLowerCase();

                    System.out.println("Name | Phone number\n--------------------");

                    Path contactPath = Paths.get("data", "contacts.txt");
                    List<String> contactList = Files.readAllLines(contactPath);

                    boolean nonExist = true;
                    for (String contact : contactList) {
                        if (contact.toLowerCase().contains(userSearch.toLowerCase())) {
                            System.out.println(contact);
                            nonExist = false;
                        }
                    }
                    if(nonExist){
                        System.out.println("This person does not exist in the contacts list");
                    }
                    System.out.println("\n**Enter an Option (1=CONTACTS, 2=ADD, 3=SEARCH, 4=DELETE or 5=EXIT): ");
                    break;


                case 4:
                    System.out.println("(DELETE) Input the contact you would like to delete: ");
                    Scanner scan4 = new Scanner(System.in);
                    String userDelete = scan4.nextLine().trim();

                    List<String> lists = Files.readAllLines(Paths.get("data", "contacts.txt"));
                    List<String> newArray = new ArrayList<>();

                    for (String list : lists) {
                        if (list.toLowerCase().contains(userDelete.toLowerCase())) {
                            continue;
                            //need an else sout incase userInput nonExist for delete
                        }
                        newArray.add(list);
                    }
                    Files.write(Paths.get("data", "contacts.txt"), newArray);

                    System.out.println("Name | Phone number\n--------------------");

                    List<String> contacts = Files.readAllLines(dataFile2);
                    for(String contact : contacts) {
                        System.out.println(contact);
                    }

                    System.out.println("\n**Enter an Option (1=CONTACTS, 2=ADD, 3=SEARCH, 4=DELETE or 5=EXIT): ");
                    break;

                case 5:

                    System.out.println("(EXIT)...Exiting Directory...");
                    confirm = false;
                    break;

                default:
                    System.out.println("**" + userInput + " is not an option** \n**Enter an Option (1, 2, 3, 4 or 5): ");
            }

        } while (confirm);

    }
}

