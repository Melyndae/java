package projet1;

//Ceci importe la classe Scanner du package java.util
import java.util.Scanner; 
//Ceci importe toutes les classes du package java.util
import java.util.*;

public class Sdz1 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int age = 50;

		if(age <= 0) {
		   System.out.println("Error");
		} else if(age <= 16) {
		   System.out.println("Too Young");
		} else if(age < 100) {
		   System.out.println("Welcome!");
		} else {
		   System.out.println("Really?");
		}
		//Outputs "Welcome!"
	}
}
