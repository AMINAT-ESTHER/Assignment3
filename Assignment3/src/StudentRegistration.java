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

    public void displayStudentInfo(){
        System.out.println("  STUDENT DETAILS");
        System.out.println("Name: "+ studentName);
        System.out.println("School: "+ schoolName);
        System.out.println("Exam Year: "+ examYear);
        System.out.println("Fee: "+ registrationFee);
        System.out.println("Grading: "+gradingPolicy);
        System.out.println("Status: "+registrationStatus);
        System.out.println("Centre: "+examCentre);
    }

}
