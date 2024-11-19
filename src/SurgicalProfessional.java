public class SurgicalProfessional extends HealthProfessional {
    private String expertise; //New variables: expertise of health personnel
    private int serviceYear; //service year of health personnel
    public SurgicalProfessional() {
        super();
// Call the default constructor of the base class
        this.expertise = "Surgical Professional";
        this.serviceYear = 0;
    }


// Call the second constructor of the parent class to initialise the instance variables
    public SurgicalProfessional(String name, String id, String phoneNum, String expertise, int serviceYear) {
        super(name, id, phoneNum); 
        this.expertise = expertise;
        this.serviceYear = serviceYear;
    }



    //Getters and Setters for expertise
    public String getexpertise() {
        return expertise;
    }

    public void setexpertise(String expertise) {
        this.expertise = expertise;
    }

    //Getters and Setters for serviceYear
    public int getserviceYear() {
        return serviceYear;
    }

    public void  setserviceYear(int serviceYear) {
        this.serviceYear = serviceYear;
    }

    //Override parent class HealthProfessional's method printinfo using @Override
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("The health professional details are:");
        System.out.println("expertise: " + this.expertise);
        System.err.println("serviceYear " + this.serviceYear);
    }
}