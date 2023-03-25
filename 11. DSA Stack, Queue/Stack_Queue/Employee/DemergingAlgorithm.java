package Stack_Queue.Employee;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DemergingAlgorithm {
    public static void main(String[] args) throws IOException {
        Queue<Employee> nuQueue = new LinkedList<>();
        Queue<Employee> namQueue = new LinkedList<>();

        Scanner scanner = new Scanner(new File("input.txt"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] fields = line.split(",");
            String name = fields[0];
            String gender = fields[1];
            String dob = fields[2];
            Employee employee = new Employee(name, gender, dob);
            if (gender.equals("NU")) {
                nuQueue.add(employee);
            } else {
                namQueue.add(employee);
            }
        }
        scanner.close();

        PrintWriter writer = new PrintWriter(new File("output.txt"));
        while (!nuQueue.isEmpty()) {
            Employee employee = nuQueue.remove();
            writer.println(employee);
        }
        while (!namQueue.isEmpty()) {
            Employee employee = namQueue.remove();
        }
        writer.close();
    }
}
