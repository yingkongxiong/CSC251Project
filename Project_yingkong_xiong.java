import java.util.Scanner;
public class Project_yingkong_xiong {
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		int policyNumber = 0;
		String providerName = "";
		String phFirstName = "";
		String phLastName = "";
		int phAge = 0;
		String phSmokingStatus = "";
		double phHeight = 0;
		double phWeight = 0;
		
		
		int counterVar = 1;
		
		while (counterVar < 9) {
			inputs(counterVar);
			switch (counterVar) {
			case 1:
				policyNumber = s.nextInt();
				s.nextLine();
				break;
			case 2:
				providerName = s.nextLine();
				break;
			case 3:
				phFirstName = s.nextLine();
				break;
			case 4:
				phLastName = s.nextLine();
				break;
			case 5:
				phAge = s.nextInt();
				s.nextLine();
				break;
			case 6:
				phSmokingStatus = s.nextLine();
				break;
			case 7:
				phHeight = s.nextDouble();
				s.nextLine();
				break;
			case 8:
				phWeight = s.nextDouble();
				s.nextLine();
				break;
			default:
				break;
			}
			counterVar += 1;
		}
		
		Policy customer = new Policy(policyNumber, providerName, phFirstName, phLastName, phAge, phSmokingStatus,phHeight,phWeight);
		
		System.out.println("Policy Number: " + customer.getPolicyNumber());
		System.out.println("Provider Name: " + customer.getProviderName());
		System.out.println("Policyholder's First Name: " + customer.getPolicyHolderFirstName());
		System.out.println("Policyholder's Last Name: " + customer.getPolicyHolderLastName());
		System.out.println("Policyholder's Age: " + customer.getPolicyHolderAge());
		System.out.println("Policyholder's Smoking Status: " + customer.getSmokingStatus());
		System.out.println("Policyholder's Height: " + customer.getPolicyHolderHeight() + " inches");
		System.out.println("Policyholder's Weight: " + customer.getPolicyHolderWeight() + " pounds");
		System.out.println("Policyholder's BMI: " + customer.getPolicyHolderBMI());
		System.out.println("Policy Price $" + customer.insurancePrice());
		
	}
	
	
	// trying to make the program look cleaner idk
	public static void inputs(int x) {
		switch (x) {
		case 1:
			System.out.println("Please enter the Policy Number: ");
			break;
		case 2:
			System.out.println("Please enter the Provider Name: ");
			break;
		case 3:
			System.out.println("Please enter the Policyholder's First Name: ");
			break;
		case 4:
			System.out.println("Please enter the Policyholder's Last Name: ");
			break;
		case 5:
			System.out.println("Please enter the Policyholder's Age: ");
			break;
		case 6:
			System.out.println("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
			break;
		case 7:
			System.out.println("Please enter the Policyholder's Height (in inches): ");
			break;
		case 8:
			System.out.println("Please enter the Policyholder's Weight (in pounds): ");
			break;
		default:
			break;
		}
	}
}