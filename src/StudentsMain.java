
import java.util.Scanner;

public class StudentsMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int o;
        StudentsCRUD studentsCRUD = new StudentsCRUD();

        do {
            System.out.println("==================== Menu ====================");
            System.out.println("Select 1 option: ");
            System.out.println("1. Insert students data");
            System.out.println("2. Show all students");
            System.out.println("3. Delete student by Id");
            System.out.println("4. Update student by Id");
            System.out.println("5.Exit");
            System.out.println("==============================================");

            o = scanner.nextInt();


            switch (o) {
                case 1:
                    studentsCRUD.addStudent();
                    break;
                case 2:
                    studentsCRUD.displayStudent();
                    break;
                case 3:
                    studentsCRUD.deleteStudentById();
                    break;
                case 4:
                    studentsCRUD.updateStudentById();
                    break;
                case 5:
                    System.out.println("GoodBye");
                    break;
                default:
                    System.out.println("Select again !");
                    break;
            }

        } while (o != 5);

        studentsCRUD.closeScanner();

    }

}
