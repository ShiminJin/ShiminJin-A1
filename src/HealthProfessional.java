public class HealthProfessional {
    protected String name;
    protected String id;
    protected String phoneNum; //Variables related to health professionals

    // HealthProfessional's Default Constructor
    public HealthProfessional() {
        name = "Unknown";
        id = "000000";
        phoneNum = "000-0000-0000";
    }

    // A second constructor to initialise the instance variables including the phone number
    public HealthProfessional(String name, String id, String phoneNum) {
        this.name = name;
        this.id = id;
        this.phoneNum = phoneNum;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    //Methods for printing instance variables
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Phone Number: " + phoneNum);
    }
}