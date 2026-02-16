import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 class StudentInformationSystem {

    private static final List<Student> students = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean running = true;

        while (running) {

            printMenu();
            int choice = readInt("Enter choice: ");

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewAllStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    running = false;
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }

    /* ================= MENU ================= */
    private static void printMenu() {
        System.out.println("\n===== Student Information System =====");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Search Student");
        System.out.println("4. Update Student");
        System.out.println("5. Delete Student");
        System.out.println("6. Exit");
    }

    /* ================= ADD ================= */
    private static void addStudent() {

        try {
            String id = readLine("Student ID: ");

            if (findById(id) != null) {
                System.out.println("ID already exists.");
                return;
            }

            String name = readLine("Name: ");
            int age = readInt("Age: ");
            double grade = readDouble("Grade: ");
            String contact = readLine("Contact: ");

            students.add(new Student(id, name, age, grade, contact));

            System.out.println("Student added successfully.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /* ================= VIEW ================= */
    private static void viewAllStudents() {

        if (students.isEmpty()) {
            System.out.println("No records found.");
            return;
        }

        System.out.printf("%-12s %-20s %-6s %-8s %-15s%n",
                "ID", "Name", "Age", "Grade", "Contact");

        for (Student s : students) {
            System.out.printf("%-12s %-20s %-6d %-8.2f %-15s%n",
                    s.getStudentId(),
                    s.getName(),
                    s.getAge(),
                    s.getGrade(),
                    s.getContact());
        }
    }

    /* ================= SEARCH ================= */
    private static void searchStudent() {

        String id = readLine("Enter ID: ");
        Student s = findById(id);

        if (s == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Grade: " + s.getGrade());
        System.out.println("Contact: " + s.getContact());
    }

    /* ================= UPDATE ================= */
    private static void updateStudent() {

        Student s = findById(readLine("Enter ID: "));

        if (s == null) {
            System.out.println("Student not found.");
            return;
        }

        try {
            s.setName(readLine("New Name: "));
            s.setAge(readInt("New Age: "));
            s.setGrade(readDouble("New Grade: "));
            s.setContact(readLine("New Contact: "));
            System.out.println("Updated successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /* ================= DELETE ================= */
    private static void deleteStudent() {

        Student s = findById(readLine("Enter ID: "));

        if (s == null) {
            System.out.println("Student not found.");
            return;
        }

        students.remove(s);
        System.out.println("Deleted successfully.");
    }

    /* ================= HELPERS ================= */
    private static Student findById(String id) {
        for (Student s : students)
            if (s.getStudentId().equalsIgnoreCase(id))
                return s;
        return null;
    }

    private static String readLine(String msg) {
        System.out.print(msg);
        return scanner.nextLine();
    }

    private static int readInt(String msg) {
        while (true) {
            try {
                return Integer.parseInt(readLine(msg));
            } catch (Exception e) {
                System.out.println("Enter valid number.");
            }
        }
    }

    private static double readDouble(String msg) {
        while (true) {
            try {
                return Double.parseDouble(readLine(msg));
            } catch (Exception e) {
                System.out.println("Enter valid number.");
            }
        }
    }
}