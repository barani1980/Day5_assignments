package Week3.Day1.org.system;

public class Desktop extends Computer{

	
	public void desktopSize() {
		System.out.println("Desktop Class --> desktopSize method");
	}
	public static void main(String[] args) {
		
		Desktop dt = new Desktop();
		dt.desktopSize();
		dt.computerModel();

	}

}
