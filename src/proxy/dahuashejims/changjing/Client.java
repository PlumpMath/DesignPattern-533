package proxy.dahuashejims.changjing;

public class Client {

	public static void main(String[] args) {
		SchoolGirl mm = new SchoolGirl();
		mm.setName("李娇娇");
		
		Proxy p = new Proxy(mm);
		
		p.giveDolls();
		p.giveFlowers();
		p.giveChocolate();
	}
}
