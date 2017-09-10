package pkgMain;

import pkgCore.QB;
import java.util.Scanner;

public class cMain {

	public static void main(String[] args) {

		QB CarsonWentz = new QB();

		Scanner input = new Scanner(System.in);
		System.out.print("Enter your quartback's number of touchdowns: ");
		CarsonWentz.setTD(input.nextInt());

		System.out.print("Enter your quartback's passing yards: ");
		CarsonWentz.setYDS(input.nextDouble());

		System.out.print("Enter your quartback's number of interceptions: ");
		CarsonWentz.setINTER(input.nextInt());

		System.out.print("Enter your quartback's number of completions: ");
		CarsonWentz.setComp(input.nextInt());

		System.out.print("Enter your quartback's number of attempts: ");
		CarsonWentz.setATT(input.nextInt());
		input.close();

		System.out.print("Your quarterback's Passer Rating is: " + CarsonWentz.QBrating() + ".");
	}
}
