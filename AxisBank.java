package Week3.Day1;

public class AxisBank extends BankInfo {

	
	public void deposit() {
		System.out.println("AxisBank Class --> deposit method - 20%");
	}
	
	
	public static void main(String[] args) {
		
		BankInfo bi = new BankInfo();
		bi.deposit();
		System.out.println("deposit method of BankInfo class, BI object in AB Class");
		
		AxisBank ab = new AxisBank();
		ab.deposit();
		System.out.println("deposit method of AxisBank class, ab object in AB Class ");
		
		BankInfo eg = new AxisBank();
		eg.deposit();
		System.out.println("deposit method of AxisBank class, eg object in AB Class, with scope restriction ");
	}
	

}
