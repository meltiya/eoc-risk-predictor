import java.util.Scanner;

public class Main {

public static void main(String[] args) {
Scanner scnr = new Scanner(System.in);

System.out.print("Enter Name: ");
String name = scnr.next();

System.out.print("Enter Baseline Score: ");
int baseline = scnr.nextInt();

System.out.print("Enter Current Average: ");
double currentAvg = scnr.nextDouble();

EOCRisk studentRisk = new EOCRisk(name, baseline, currentAvg);

studentRisk.printRisk();

	}

}
