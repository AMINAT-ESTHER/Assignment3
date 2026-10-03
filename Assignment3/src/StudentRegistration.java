public class StudentRegistration {

    String studentName;
    String schoolName;
    String registrationStatus;
    String examCentre;

    static String examYear;
    static double registrationFee;
    static String gradingPolicy;

    static{
        System.out.println("  static block");
        examYear = "2026";
        registrationFee = 150000;
        gradingPolicy = "Competency Based Curriculum";
    }

    {
        System.out.println("  Instance Initialisation Block");
        registrationStatus = "Pending Verification";
        examCentre = "Hoima";
    }

    public StudentRegistration(String studentName, String schoolName){
        System.out.println("  Constructor");
        this.studentName = studentName;
        this.schoolName = schoolName;
    }

}
