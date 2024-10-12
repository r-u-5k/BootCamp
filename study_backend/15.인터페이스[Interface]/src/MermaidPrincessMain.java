
public class MermaidPrincessMain {

	public static void main(String[] args) {
		System.out.println("- MermaidPrincess -");
		MermaidPrincess mp = new MermaidPrincess();
		mp.speak();
		mp.think();
		mp.fastSwim();
		mp.liveSea();
		
		System.out.println("- Mermaid -");
		Mermaid mermaid = mp;
//		mermaid.speak();
//		mermaid.think();
		mermaid.fastSwim();
		mermaid.liveSea();
		
		System.out.println("- Princess -");
		Princess princess = mp;
		princess.speak();
		princess.think();
//		princess.fastSwim();
//		princess.liveSea();
		
		System.out.println("- Mermaid <--> Princess -");
		Mermaid mermaid2 = new MermaidPrincess();
		mermaid2.fastSwim();
		mermaid2.liveSea();
		Princess princess2 = (Princess) mermaid2;
		princess2.speak();
		princess2.think();
		
	}

}
