
public class WhaleMain {

	public static void main(String[] args) {
		System.out.println("---------Whale--------");
		Whale whale=new Whale();
		whale.breath();
		whale.breastFeed();
		whale.live();
		
		System.out.println("---------Mammalia--------");
		Mammalia mammalia=whale;
		mammalia.breath();
		mammalia.breastFeed();
		
		System.out.println("---------Animal--------");
		Animal animal=whale;
		animal.breath();
		//animal.breastfeed();
	}

}
