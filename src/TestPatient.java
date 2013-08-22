
public class TestPatient {

	public static void main(String[] args) {
		
		//Instantiate patients
		BloodType patient1 = new BloodType("B", '-');
		Patient p1 = new Patient(123456, 45, patient1); 
		Patient p2 = new Patient();
		Patient p3 = new Patient();
		
		//Using set methods
		p2.setPatientAge(25);
		p2.setPatientIdNumber(465879);
		BloodType p2BloodType = new BloodType("A", '+');
		p2.setBloodType(p2BloodType);
		
		System.out.println("Patient 1's ID number is:  " + p1.getPatientIdNumber() + " his age is: " + p1.getPatientAge() +
				" and his blood type is: " + p1.getBloodType());
		
		System.out.println("Patient 2's ID number is:  " + p2.getPatientIdNumber() + " his age is: " + p2.getPatientAge() +
				" and his blood type is: " + p2.getBloodType());
		
		//Using default by not specifying age, id number or blood type
		System.out.println("Patient 3's ID number is:  " + p3.getPatientIdNumber() + " his age is: " + p3.getPatientAge() +
				" and his blood type is: " + p3.getBloodType());
		
	}

}
