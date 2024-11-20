import java.util.ArrayList;

public class AssignmentOne {
    private static ArrayList<Appointment> appointments = new ArrayList<>();
    //Use static to make the list array a static member of the AssignmentOne class, able to be called at any time.
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        System.out.println("Part 3 – Using classes and objects");
        GeneralPractitioner GP1 = new GeneralPractitioner("Alice","GP001","133-2210-1231","General Practitioner, more specialised in treating surgical conditions.",6);
        GeneralPractitioner GP2 = new GeneralPractitioner("Tom","GP002","193-2610-3331","General Practitioner, more specialised in the treatment of internal medicine diseases.",7);
        GeneralPractitioner GP3 = new GeneralPractitioner("John","GP003","163-2450-1121","General Practitioner, experienced, senior medical specialist.",11);
        SurgicalProfessional SP1 = new SurgicalProfessional("Kelly","SP001","133-2210-1231","Orthopaedic specialist with a lot of experience in treating orthopaedic conditions.",5);
        InternalMedicineProfessional IMP1 = new InternalMedicineProfessional("Kevin","IMP001","173-2545-2379","He is a specialist in cardiovascular medicine and has a PhD in cardiovascular disease research.",7);
        GP1.printInfo();
        GP2.printInfo();
        GP3.printInfo();
        SP1.printInfo();
        IMP1.printInfo();
        System.out.println("------------------------------");
        // Part 5 – Collection of appointments
        System.out.println("Part 5 – Collection of appointments:");
        createAppointment("Bob","123-1234-1234","8:00",GP1);
        createAppointment("Jane","164-1234-1234","1:00",GP2); 
        createAppointment("Hellen","145-1234-1234","18:00",SP1);
        createAppointment("Jam","139-1234-1234","22:00",IMP1);
        printExistingAppointments();
        cancelBooking("123-1234-1234");
        System.out.println("After deleting an appointment:");
        printExistingAppointments();
        System.out.println("------------------------------");
    }
        //Use static to modify a method so that the method can be called without creating an instance.
    public static void createAppointment(String name, String phoneNum, String time, HealthProfessional doctor) {
        Appointment theappointment = new Appointment(name,phoneNum,time,doctor);
        appointments.add(theappointment);
    }
        //This method first instantiates the object with the input parameters and then adds the object to the array list using add..
    public static void printExistingAppointments() {
        //Use if and isempty to determine if the list is empty.
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } 
        else {
            System.out.println("Existing Appointments:");
        //Use for to traverse and call the method to output.
            for (Appointment appointment : appointments) {
                appointment.printInfo();
            }
        }
    }
    public static void cancelBooking(String phoneNum) {
        boolean found = false;
        //Define a false value
        for (int i = 0; i < appointments.size(); i++) {
        //Iterate through the list with an i.
            if (appointments.get(i).getPhoneNum() == phoneNum) {
                appointments.remove(i);
                found = true;
                break;
            }
        }
        //Detects whether the current object phone number is consistent, removes the consistent object, and changes false to true.
        if (found) {
            System.out.println("Appointment with phone number " + phoneNum + " has been canceled.");
        } else {
            System.out.println("No appointment found with phone number " + phoneNum);
        }
        //Outputs information based on the found value. 
    }
    
}