package proxy.dahuashejims;

/**
 * 代理类
 * @author 陈超
 *
 */
public class Proxy implements GiveGift{

	Purnish pur;
	
	public Proxy(SchoolGirl mm){
		this.pur = new Purnish(mm);
	}
	
	@Override
	public void giveDolls() {
		pur.giveDolls();
	}

	@Override
	public void giveFlowers() {
		pur.giveFlowers();
	}

	@Override
	public void giveChocolate() {
		pur.giveChocolate();
	}

	
}