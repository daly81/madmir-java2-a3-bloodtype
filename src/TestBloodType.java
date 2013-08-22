
public class TestBloodType {

	public static void main(String[] args) {
		//Instantiate bloodType p = patient
		
		BloodType p1BloodType = new BloodType();//  Default
		BloodType p2BloodType = new BloodType("A");// Changing String
		BloodType p3BloodType = new BloodType("B",'-');// Changing both String and char
		BloodType p4BloodType = new BloodType('-');//  Changing char
		
		System.out.println("patient 1 blood type is: " + p1BloodType.getBloodType() + p1BloodType.getRhFactor());
		System.out.println("patient 2 blood type is: " + p2BloodType.getBloodType() + p2BloodType.getRhFactor());
		System.out.println("patient 3 blood type is: " + p3BloodType.getBloodType() + p3BloodType.getRhFactor());
		
		//Using Mutators on patient 4 
		p4BloodType.setBloodType("AB");
		p4BloodType.setRhFactor('+');
		System.out.println("patient 4 blood type is: " + p4BloodType.getBloodType() + p4BloodType.getRhFactor());
		

	}

}
