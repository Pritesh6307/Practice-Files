package practicePrograms;

public class V_LoopingFor01 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		for(int i=1; i<=20;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		for(int i=1;i<=30;i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
		for(int i =1;i<=50;i++) {
			if(i%5==0) {
				System.out.println(i);
			}
		}

	}

}
