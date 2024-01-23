public class Policy {
	private int policyNumber;
	private String providerName;
	
	//	"ph" = "Policy Holder"
	private String phFirstName;
	private String phLastName;
	private int phAge;
	private String phSmokingStatus;
	private boolean phSSBool;
	private double phHeight;
	private double phWeight;
	
	// no arg-constructor
	public Policy(){
		policyNumber = 0000;
		providerName = "Empty";
		phFirstName = "Empty";
		phLastName = "Empty";
		phAge = 0;
		phSmokingStatus = "non-smoker";
		phSSBool = false;
		phHeight = 0;
		phWeight = 0;
		
	}
	
   // arg constructor
	public Policy(int pNumber, String pName, String phFName, String phLName, int phA, String phSmokeStt, double phHt, double phWt) {
		policyNumber = pNumber;
		providerName = pName;
		phFirstName = phFName;
		phLName = phLastName;
		phAge = phA;
		
		
      // if is smoker, sets smoking status into a boolean
		phSmokingStatus = phSmokeStt;
		if (phSmokingStatus.equalsIgnoreCase("smoker")) {
			phSSBool = true;
		}
		else {
			phSSBool = false;
		}
		
		
		phHeight = phHt;
		phWeight = phWt;
	}
	
   // method calculates bmi, used string format to round decimal in case, then send rounded string variable back through parse double
	public double BMI() {
		double bmi;
		String strBmi;
		bmi = (phWeight * 703)/(Math.pow(phHeight, 2));
		strBmi = String.format("%.2f", bmi);	// rounds
		bmi = Double.parseDouble(strBmi);
		return bmi;
	}
	
   // calculates insurance price
	public double insurancePrice() {
		double additionalFee = (BMI() - 35) *20;
		final double baseFee = 600;
		if (phAge > 50) {
			additionalFee += 75;
		}
		else if (phSSBool) {
			additionalFee += 100;
		}
		additionalFee += baseFee;
		return additionalFee;
	}
	
   
   // Acessor methods
	public int getPolicyNumber() {
		return policyNumber;
	}
	
	public String getProviderName() {
		return providerName;
	}
	
	public String getPolicyHolderFirstName() {
		return phFirstName;
	}
	
	public String getPolicyHolderLastName() {
		return phLastName;
	}
	
	public int getPolicyHolderAge() {
		return phAge;
	}
	
	public String getSmokingStatus() {
		return phSmokingStatus;
	}
	
	public double getPolicyHolderHeight() {
		return phHeight;
	}
	
	public double getPolicyHolderWeight() {
		return phWeight;
	}
   
   
}