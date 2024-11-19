public class AssignmentOne {
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
    }
}