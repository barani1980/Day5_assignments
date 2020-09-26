package Week3.Day1;

public class Students {

	
	public void getStudentInfo(int id) {
		System.out.println("Student ID only = " + id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID and Name = " + id + " & " + name);
	}
	
	public void getStudentInfo(String email, Long phone) {
		System.out.println("Student email and phone = " + email + " & " + phone);
	}
	
	public static void main(String[] args) {
		
		Students ss = new Students();
		ss.getStudentInfo(100);
		ss.getStudentInfo(200,"Barani");
		ss.getStudentInfo("barani@test.com", 9999922222L);
		
	}

}
