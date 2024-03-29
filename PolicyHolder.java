public class PolicyHolder {

   // policy now has policyholder in its class
	private PolicyHolder pHolder;

   // Initializing Private Variables
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
	
	// Creating no arg constructor
	public PolicyHolder(){
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
	
   
   /* Constructor that takes in arguments
      @param pNumber is policy number
      @param pName is provider name, i.e State Farm, Nationwide, etc.
      @param phFName is policy holder first name
      @param phLName is policy holder last name
      @param phA is policy holder Age
      @param phSmokeStt is policy holder Smoking Status
      @param phHt is policy holder Height
      @param phWt is policy holder Weight
      
   */
	public PolicyHolder(int pNumber, String pName, String phFName, String phLName, int phA, String phSmokeStt, double phHt, double phWt) {
		policyNumber = pNumber;
		providerName = pName;
		phFirstName = phFName;
		phLastName = phLName;
		phAge = phA;
		
      
		// Creating bool value for easier smoking status 
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
	
   
   
   // Creating Method that calculates BMI
   // @return The calculated BMI using variables created with constructor
	public double BMI() {
		double bmi;
		String strBmi;
		bmi = (phWeight * 703)/(Math.pow(phHeight, 2));
		strBmi = String.format("%.2f", bmi);	// rounds
		bmi = Double.parseDouble(strBmi);
		return bmi;
	}
	
   
   // calculates the insurance price and returns it
   // @return the insurance price after adding all factors
	public double insurancePrice() {
      double fee = 0;
		double additionalFee = (BMI() - 35) *20;
		final double baseFee = 600;
		String strFee;
      
      
		if (phAge > 50) {
			fee += 75;
		}
      
      // Uses Smoking Status boolean to determine whether to add fee or not
		else if (phSSBool) {
			fee += 100;
		}
      
      // adds additional fee if bmi is more than 35
      else if (BMI() > 35) {
         fee += additionalFee;
      }
		fee += baseFee;
		strFee = String.format("%.2f", fee);
		fee = Double.parseDouble(strFee);
		return fee;
	}
	
   
   // Getter Methods
   
   // @return policy number private var
	public int getPolicyNumber() {
		return policyNumber;
	}
	
   // @return provider private var
	public String getProviderName() {
		return providerName;
	}
	
   // @return policy holders first name private var
	public String getPolicyHolderFirstName() {
		return phFirstName;
	}
	
   // @return policy holders last name private var
	public String getPolicyHolderLastName() {
		return phLastName;
	}
	
   // @return policy holders age private var
	public int getPolicyHolderAge() {
		return phAge;
	}
	
   // @return smoking status of policy holder private var
	public String getSmokingStatus() {
		return phSmokingStatus;
	}
	
   // @return policy holders height private var
	public double getPolicyHolderHeight() {
		return phHeight;
	}
	
   // @return policy holders weight private var
	public double getPolicyHolderWeight() {
		return phWeight;
	}
   
   // @return policy holders BMI private var by calling BMI() method
	public double getPolicyHolderBMI() {
		return BMI();
	}
   
   // toString
	Policy customer = new Policy();
	public String toString() {
		return "Policy Number: " + customer.getPolicyNumber() +'\n' +
		"Provider Name: " + customer.getProviderName() +'\n' +
		"Policyholder's First Name: " + customer.getPolicyHolderFirstName() +'\n' +
		"Policyholder's Last Name: " + customer.getPolicyHolderLastName() +'\n' +
		"Policyholder's Age: " + customer.getPolicyHolderAge() +'\n' +
		"Policyholder's Smoking Status: " + customer.getSmokingStatus() +'\n' +
		"Policyholder's Height: " + customer.getPolicyHolderHeight() + " inches" +'\n' +
		"Policyholder's Weight: " + customer.getPolicyHolderWeight() + " pounds" +'\n' +
		"Policyholder's BMI: " + customer.getPolicyHolderBMI() +'\n' +
		"Policy Price $" + customer.insurancePrice();	}
   
	public static final int POLICY_OBJECTS = 8;
}
