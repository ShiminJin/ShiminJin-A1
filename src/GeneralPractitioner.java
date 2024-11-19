public class GeneralPractitioner extends HealthProfessional {
    private String type; //New variables: Type of health personnel
    public GeneralPractitioner() {
        super();
// Call the default constructor of the parent class
        this.type = "General Practitioner";
    }


// Call the second constructor of the parent class to initialise the instance variables
    public GeneralPractitioner(String name, String id, String phoneNum, String type) {
        super(name, id, phoneNum); 
        this.type = type;
    }



    //Getters and Setters for type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //Override parent class HealthProfessional's method printinfo using @Override
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Type: " + this.type);
    }
}