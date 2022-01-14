package person;

public class Contact {
    //  FIELDS
    String name;
    int phone;

    //  CONSTRUCTOR(S)

    public Contact() {
    }

    public Contact(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    //  METHODS
        //  GETTERS/SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }


}
