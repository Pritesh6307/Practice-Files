package assignment04;

public interface A_Playable {
	abstract void play();
}

class football implements A_Playable{

	@Override
	public void play() {
		System.out.println("Football");
		
	}
	
}
class volleyball implements A_Playable{

	@Override
	public void play() {
		System.out.println("Volleyball");
		
	}
	
}
class basketball implements A_Playable{

	@Override
	public void play() {
		System.out.println("Basektball");
		
	}
	
}
