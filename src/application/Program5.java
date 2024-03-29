package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.print("Nome: ");
		student.name = sc.nextLine();
		System.out.print("Grade 1: ");
		student.grade1 = sc.nextDouble();
		System.out.print("Grade 2: ");
		student.grade2 = sc.nextDouble();
		System.out.print("Grade 3: ");
		student.grade3 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
		
		if (student.finalGrade() >= 60.0) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.missingPoints());
		}
		
		sc.close();

	}

}
