public class StudentRegistration {

    String studentName;
    String schoolName;
    String registrationStatus;
    String examCentre;

    static String examYear;
    static double registrationFee;
    static String gradingPolicy;

    static{
        System.out.println("  STATIC BLOCK");
        examYear = "2026";
        registrationFee = 150000;
        gradingPolicy = "Competency Based Curriculum";
        System.out.println("  General Examination Settings: Year = "+ examYear + " Fee = UGX "+ registrationFee +" Grading Policy: "+ gradingPolicy);
        System.out.println("------------------------------------------------------------");
    }

    {
        System.out.println("  Instance Initialisation Block for a new student");
        registrationStatus = "Pending Verification";
        examCentre = "Hoima";
    }

    public StudentRegistration(String studentName, String schoolName){
        System.out.println("  Constructor assigning data for "+ studentName);
        this.studentName = studentName;
        this.schoolName = schoolName;
        System.out.println("---------------------------");
    }

    public void displayStudentInfo(){
        System.out.println("  STUDENT DETAILS");
        System.out.println("Name: "+ studentName);
        System.out.println("School: "+ schoolName);
        System.out.println("Centre: "+examCentre);
        System.out.println("Status: "+registrationStatus);
        System.out.println("------------------------------");
    }

}
