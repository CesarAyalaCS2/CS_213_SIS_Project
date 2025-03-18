//chose sis because I thought it was a more prevalent application - I work for the district

package sis;

import java.util.Scanner;
import java.util.ArrayList;

public class StudentInformationSystem {
	
	public static ArrayList<String> StudentName = new ArrayList<>();
	public static ArrayList<Integer> StudentGrade = new ArrayList<>();
	public static ArrayList<Integer> StudentIDNumber = new ArrayList<>();

	public static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {
	    menuOptions(); // calls menuOptions
		System.out.println("Gracias for using this program!"); 

		scnr.close();
		


	}
	public static void menuOptions() {
        boolean menuIterate = true;
		do{
			System.out.println("\nHello. Please enter the corresponding number for the menu option you would like to proceed with.");
			System.out.println("1. Add a New Student");
			System.out.println("2. View All Student Records");
			System.out.println("3. View a specific student's records");
			System.out.println("4. Exit the program");
			System.out.print("Option: ");
	
			int menuSelection = scnr.nextInt();
			scnr.nextLine(); // deals with line left from using nextInt()
			


			switch (menuSelection) { // switch for calling different methods
		      case 1:
		        AddANewStudent(); // calls method to add new student
		        break;
		      case 2:
		        ViewAllStudents(); // calls method to display student records
		        break;
		      case 4:
		        ExitTheProgram(); // calls method to end program (not a lot there but here for consistency)
		        menuIterate = false;
		        break;
		      case 3:
		    	  ViewStudentDetails();
		    	  break;
		      default: // default is there for error handling and will loop the switch
		        System.out.println("Returning to menu selection");

		        break;
		    }
        } while(menuIterate);
	}
	
	public static void AddANewStudent() {
		System.out.println("Enter 'q' to return to the menu\nPlease enter the name of the student (ex: Cesar Ayala): ");
		String newStudentName = scnr.nextLine();
		if (newStudentName.equalsIgnoreCase("q")) {
			System.out.println("No longer adding a new student!");
		}
		else { 
		StudentName.add(newStudentName);

		
		System.out.println("Please enter the grade level of the student(ex: 9): ");
		int newStudentGrade = scnr.nextInt(); scnr.nextLine(); // deals with line left from using nextInt()
		StudentGrade.add(newStudentGrade);

		System.out.println("Please enter the ID number of the student (ex: 142): ");		
		int newStudentIDNumber = scnr.nextInt();  scnr.nextLine();
		StudentIDNumber.add(newStudentIDNumber);

		}
	}
	public static void ViewAllStudents() {
		System.out.println("\nPrinting Student Information");
		System.out.println("Name - Grade - ID Number");
		System.out.println("...");
		
        //loops through the arraylists student by student  (by index)
		for (int i = 0; i < StudentName.size(); i++) {
            System.out.print("\n" + StudentName.get(i) + " - " + StudentGrade.get(i) + " - " + StudentIDNumber.get(i));
            }
        System.out.println("\n");
        }		
	
	public static void ViewStudentDetails() {

	    boolean numberExists = false;
	    int indexOfIDNumber = -999; 

	    System.out.println("Enter '0' to return to the menu\nPlease enter the ID of the student: ");
	    int studentIDtoLookup = scnr.nextInt(); scnr.nextLine();
	    
	    //error handling and return to menu
	    if (studentIDtoLookup == 0) {
	        System.out.println("Returning to the menu...");
 
	    }
	    else {
	
		    // Checks if student ID exists
		    for (int i = 0; i < StudentIDNumber.size(); i++) {
		        if (StudentIDNumber.get(i).equals(studentIDtoLookup)) { 
		            indexOfIDNumber = i; 
		            numberExists = true;
		            break; 
		        }
		    }
		    
		    
		    if (!numberExists) {
		        System.out.println("No Student was found with that ID Number");
		    } 
		    else { //runs if everything else is correct
		        // Formatting
		        System.out.println("\nPrinting Student Information");
		        System.out.println("Name - Grade - ID Number");
		        System.out.println("...");
		        // Print student info
		        System.out.println(StudentName.get(indexOfIDNumber) + " - " +
		                           StudentGrade.get(indexOfIDNumber) + " - " +
		                           StudentIDNumber.get(indexOfIDNumber));
		    }
	    }
	}

	
	public static void ExitTheProgram(){
		System.out.println("\nNow Exiting the Program!");
		
	}
}

//Problems in doing: I wanted to save as much code as possible - Eclipse IDE - Git enabling
//Structs
//student scores arraylist of arraylists - Structs would be better
//gradebooks in a different file?? 
//GPA based on gradebook

//isequal() rather than ==

//Class wrappers for primitive variables (Integer vs int)
	//isequal vs binary operators
	//gradebooks in a different file

// q for quit and 0 for quit - nextInt() vs nextLine() -
//Output formatting
//regex applications
	
