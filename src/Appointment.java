public class Appointment {
    protected String name;
    protected String phoneNum;
    protected String time;
    protected HealthProfessional doctor;


    public Appointment() {
        this.name = "Unknown";
        this.phoneNum = "000-0000-0000";
        this.time = "Unknown";
        this.doctor = null;
    }

    public Appointment(String name, String phoneNum, String time, HealthProfessional doctor) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.time = time;
        this.doctor = doctor;
    }
    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public HealthProfessional getDoctor() {
        return doctor;
    }

    public void setDoctor(HealthProfessional doctor) {
        this.doctor = doctor;
    }

    public void printInfo() {
        System.out.println("Below is the information for this this appointment:");
        System.out.println("Patient Name: " + this.name);
        System.out.println("Patient Phone Number:  " + this.phoneNum);
        System.out.println("Appointment time:  " + this.time);
        System.out.println("Appointment Doctor:  " + doctor.name);
    }

}
