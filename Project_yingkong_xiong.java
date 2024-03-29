import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class Project_yingkong_xiong {
	public static void main(String args[]) throws FileNotFoundException {
		
		ArrayList<Policy> al = new ArrayList<Policy>();
		File fileName = new File("D:\\Yingkong\\Documents\\GitHubRepositories\\CSC251Project\\PolicyInformation.txt");
		Scanner file = new Scanner(fileName);
		int policyNumber = 0;
		String providerName = "";
		String phFirstName = "";
		String phLastName = "";
		int phAge = 0;
		String phSmokingStatus = "";
		double phHeight = 0;
		double phWeight = 0;
		
		while (file.hasNext()) {
			policyNumber = file.nextInt();
			file.nextLine();
			providerName = file.nextLine();
			phFirstName = file.nextLine();
			phLastName = file.nextLine();
			phAge = file.nextInt();
			file.nextLine();
			phSmokingStatus = file.nextLine();
			phHeight = file.nextDouble();
			file.nextLine();
			phWeight = file.nextDouble();
			file.nextLine();
			Policy customer = new Policy(policyNumber, providerName, phFirstName, phLastName, phAge, phSmokingStatus, phHeight, phWeight);
			al.add(customer);
			System.out.println(customer);
		}
		
		int smokers = 0;
		int nonSmokers = 0;
		for (Policy object: al) {
			if (object.getSmokingStatus().equalsIgnoreCase("smoker")) {
				smokers += 1;
			}
			else {
				nonSmokers +=1;
			}
		}
		System.out.println("The number of policies with a smoker is: " + smokers);
		System.out.println("The number of policies with a non-smoker is: " + nonSmokers);
		file.close();
	}
}	