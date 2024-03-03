import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.ResultSet;

public class StudentDB {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/studentdb";
            String username = "root";
            String password = "myPASSWORD";
            Connection connection = DriverManager.getConnection(url, username, password);
            if(connection != null){
                System.out.println("Connected to the database");
            } else {
                System.out.println("Failed to connect to the database");
            }
            Scanner scanner = new Scanner(System.in);
                int choice;
                do {
                    System.out.println("1. Insert");
                    System.out.println("2. Display");
                    System.out.println("3. Update");
                    System.out.println("4. Delete");
                    System.out.println("5. Exit");
                    System.out.print("Enter your choice: ");
                    choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            insertStudent(connection, scanner);
                            break;
                        case 2:
                            displayStudents(connection);
                            break;
                        case 3:
                            updateStudent(connection, scanner);
                            break;
                        case 4:
                            deleteStudent(connection, scanner);
                            break;
                        case 5:
                            System.out.println("Exiting program.");
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                } while (choice != 5);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    private static void insertStudent(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter Student Name: ");
        String studentName = scanner.next();
        System.out.print("Enter Student ID: ");
        String studentID = scanner.next();
        System.out.print("Enter Student Email: ");
        String studentEmail = scanner.next();
        System.out.print("Enter Student Password: ");
        String studentPassword = scanner.next();

        String sql = "INSERT INTO students (username, phone_number, email, password) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, studentName);
            statement.setString(2, studentID);
            statement.setString(3, studentEmail);
            statement.setString(4, studentPassword);
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Student inserted successfully.");
            } else {
                System.out.println("Failed to insert student.");
            }
        }
    }

    private static void displayStudents(Connection connection) throws SQLException {
        String sql = "SELECT * FROM students";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.println("Student Name: " + resultSet.getString("username"));
                System.out.println("Student ID: " + resultSet.getString("phone_number"));
                System.out.println("Student Email: " + resultSet.getString("email"));
                System.out.println("Student Password: " + resultSet.getString("password"));
                System.out.println();
            }
        }
    }

    private static void updateStudent(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter Student ID to update: ");
        String studentID = scanner.next();
        System.out.print("Enter new Student Name: ");
        String studentName = scanner.next();
        System.out.print("Enter new Student Email: ");
        String studentEmail = scanner.next();
        System.out.print("Enter new Student Password: ");
        String studentPassword = scanner.next();

        String sql = "UPDATE students SET username = ?, email = ?, password = ? WHERE phone_number = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, studentName);
            statement.setString(2, studentEmail);
            statement.setString(3, studentPassword);
            statement.setString(4, studentID);
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Student updated successfully.");
            } else {
                System.out.println("Failed to update student.");
            }
        }
    }

    private static void deleteStudent(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter Student ID to delete: ");
        String studentID = scanner.next();

        String sql = "DELETE FROM students WHERE phone_number = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, studentID);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Student deleted successfully.");
            } else {
                System.out.println("Failed to delete student.");
            }
        }
    }
}
