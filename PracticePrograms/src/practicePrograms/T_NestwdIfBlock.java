package practicePrograms;

public class T_NestwdIfBlock {

	public static void main(String[] args) {
		int a = 40;
		int b = 50;
		
		if (a>90) {
			
			if (b>100) {
				System.out.println("B is Greater");
			}
			else {
				System.out.println("B is Lesser");
				
			}
		}
		else {
			System.out.println("A is Lesser");
		}
	}

}
