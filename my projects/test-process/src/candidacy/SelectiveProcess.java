package candidacy;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SelectiveProcess {
	
	public static void main(String[] args) {
		printSelectedApplicants();
	}
	
	static void printSelectedApplicants() {
		String [] applicants = {"Felipe", "Marcia", "Lucia", "Julia", "Paulo"};
		System.out.println("Printing applicants saying them array index");
		
		for(String applicant: applicants) {
			doingContact(applicant);
		}
	}
	
	static void doingContact(String applicant) {
		int attemptsMade = 1;
		boolean tryAgain = true;
		boolean answered = false;
		
		do {
			answered = answer();
			tryAgain = !answered;
			if(tryAgain) {
				attemptsMade++;
			} else {
				System.out.println("Contacted sucessfuly.");
			}
			
		}while(tryAgain && attemptsMade < 3);
		
		if(answered) {
			System.out.println("We've made contact with " + applicant + " on the " + attemptsMade + " try.");
		} else {
			System.out.println("We've not done contact with " + applicant + ", max attempts done " + "(" + attemptsMade + ")" + ".");
		}
		
	}
	
	static boolean answer() {
		return new Random().nextInt(3)==1;
	}
	
	static void applicantSelection() {
		String [] applicants = {"Felipe", "Marcia", "Lucia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Daniela", "Mirela", "Jorge"};
		int selectedApplicants = 0;
		int actualApplicant = 0;
		while(selectedApplicants < 5 && actualApplicant < applicants.length) {
			double baseWage = 2000.0;
			String applicant = applicants[actualApplicant];
			double expectedWage = expectedWage();
			
			System.out.println("The applicant " + applicant + " expect this wage: " + expectedWage);
			if (baseWage >= expectedWage) {
				System.out.println("The applicant " + applicant + " has been selected.");
				selectedApplicants++;
			} else {
				System.out.println("The applicant " + applicant + " has not been selected.");
			}
			actualApplicant++;
		}
	}
	
	static double expectedWage() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void checkApplicant(double expectedWage) {
		double baseWage = 2000.0;
		if ( baseWage > expectedWage ) {
			System.out.println("Call applicant.");
		} else if(baseWage == expectedWage) {
			System.out.println("Call applicant with counter-proposal.");
		} else {
			System.out.println("Wait another applicants results.");
		}
	}
	
}
