public class UNEBRegistration {
    public static void main(String[] args) {
        System.out.println("  UNEB SYSTEM");

        System.out.println("Student 1");
        StudentRegistration student1 = new StudentRegistration("Alice", "St.Mary's Mukono");
        student1.displayStudentInfo();

        System.out.println("Student 2");
        StudentRegistration Student2 = new StudentRegistration("Joshua", "St.John Kisubi");
        Student2.displayStudentInfo();
    }
}
