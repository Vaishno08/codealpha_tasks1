package grades;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentsGrades {
	public static void main(String[] args) {
		
		 ArrayList<Integer> grades = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);
	        String input;
	        
	        // Collect grades from the teacher
	        while (true) {
	            System.out.print("Enter a student's grade (or type 'done' to finish): ");
	            input = scanner.nextLine();
	            if (input.equalsIgnoreCase("done")) {
	                break;
	            }
	            try {
	                int grade = Integer.parseInt(input);
	                grades.add(grade);
	            } catch (NumberFormatException e) {
	                System.out.println("Please enter a valid grade.");
	            }
	        }
	        
	        // Check if any grades were entered
	        if (grades.size() == 0) {
	            System.out.println("No grades were entered.");
	            return;
	        }
	        
	        // Calculate average, highest, and lowest scores
	        int total = 0;
	        int highest = grades.get(0);
	        int lowest = grades.get(0);
	        
	        for (int grade : grades) {
	            total += grade;
	            if (grade > highest) {
	                highest = grade;
	            }
	            if (grade < lowest) {
	                lowest = grade;
	            }
	        }
	        
	        double average = (double) total / grades.size();
	        
	        // Display the results
	        System.out.println("\nNumber of students: " + grades.size());
	        System.out.println("Average grade: " + average);
	        System.out.println("Highest grade: " + highest);
	        System.out.println("Lowest grade: " + lowest);
	        
	        scanner.close();  
	}

}
