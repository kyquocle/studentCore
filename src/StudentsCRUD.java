import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentsCRUD {
    ArrayList<Students> studentsList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addStudent() {

        while (true) {

            System.out.println("Input students id: ");
            String id = scanner.nextLine();

            System.out.println("Input students name: ");
            String name = scanner.nextLine();

            System.out.println("Input students dateOfBirth: ");
            String dateOfBirth = scanner.nextLine();

            System.out.println("Input students phone: ");
            String phone = scanner.nextLine();

            System.out.println("Input students email: ");
            String email = scanner.nextLine();

            System.out.println("Input students grade: ");
            double grade = scanner.nextDouble();
            scanner.nextLine();//Take damage from the enter button

            System.out.println("Input students title: ");
            String title = scanner.nextLine();

//            Students students = new Students(id, name, dateOfBirth, phone, email, grade, title);
//            studentsList.add(students);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("studentsData.txt", true))) {
                // Append student data to the file
                writer.write("id: " + id + " || name: " + name + " || date of birth: " + dateOfBirth +
                        " || phone: " + phone + " || email: " + email + " || grade: " + grade + " || title: " + title);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Student data have been inserted!");
            break;
        }

    }

    public void closeScanner() {
        scanner.close();
    }

    public void displayStudent() {
        System.out.println("All students information: ");

//        if (studentsList.isEmpty()) {
//            System.out.println("Nothing to display! ");
//        }
//        else for (Students students : studentsList) {
//            System.out.println(students.toString());
//
//        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("studentsData.txt"));
            String line = reader.readLine();

            if(line == null) {
                System.out.println("Nothing to display!");
            } else {
                while (line != null) {
                    System.out.println(line);
                    line = reader.readLine();
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void deleteStudentById() {
        System.out.println("Input student's id to delete: ");
        String id = scanner.nextLine();

        boolean studentFound = false;

        for (Students students : studentsList) {
            if(students.getId().equals(id)) {
                studentsList.remove(students);
                studentsList.add(students);

                System.out.println("Student " + id + " have been deleted!");
                studentFound = true;
                break;
            }
        }

        if (studentFound == false) {
            System.out.println("Can't found student with id " + id);
        }
    }

    public void updateStudentById() {
        System.out.println("Input student id to update: ");
        String id = scanner.nextLine();
        boolean studentExist = false;

        for (Students students: studentsList) {
             if (students.getId().equals(id)) {
                 studentExist = true;
                 System.out.println("Input student name: ");
                 String name = scanner.nextLine();
                 students.setName(name);

                 System.out.println("Input students dateOfBirth: ");
                 String dateOfBirth = scanner.nextLine();
                 students.setDateOfBirth(dateOfBirth);

                 System.out.println("Input students phone: ");
                 String phone = scanner.nextLine();
                 students.setPhone(phone);

                 System.out.println("Input students email: ");
                 String email = scanner.nextLine();
                 students.setEmail(email);

                 System.out.println("Input students grade: ");
                 double grade = scanner.nextDouble();
                 students.setGrade(grade);
                 scanner.nextLine();

                 System.out.println("Input students title: ");
                 String title = scanner.nextLine();
                 students.setTitle(title);

                 System.out.println("Student id" + id + " data has been updated!");
                 break;

             }

        }
        if (studentExist == false) {
            System.out.println("Student id: " + id + " does not exist!");
        }
    }

}
