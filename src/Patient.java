
public class Patient {
	private int patientIdNumber; 
	private int patientAge; 
	private BloodType patientBloodData; 
	
	//Overloaded Constructors
	public Patient(int id, int age, BloodType bloodData) { 
		this.patientAge = age;
		this.patientIdNumber = id; 
		this.patientBloodData = bloodData; 
	}
	
	//Default 
	public Patient() {
		this(0, 0, new BloodType());
		
	}

	//Accessors
	public int getPatientIdNumber() {
		return patientIdNumber;
	}
	
	public int getPatientAge() {
		return patientAge;
	}
	
	public String getBloodType() {
		return patientBloodData.getBloodType() + patientBloodData.getRhFactor();  
	}
	
	//Mutator methods
	public void setPatientIdNumber(int newId) {
		patientIdNumber = newId; 
	}
	
	public void setPatientAge(int newAge) {
		patientAge = newAge;
	}
	
	public void setBloodType(BloodType newBloodType) {
		patientBloodData = newBloodType; 
	}
}
