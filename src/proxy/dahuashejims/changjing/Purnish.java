package proxy.dahuashejims.changjing;

/**
 * 真正的追求者类
 * @author 陈超(Brainmaven)
 *
 */
public class Purnish implements GiveGift{

	SchoolGirl mm;
	public Purnish(SchoolGirl mm){
		this.mm = mm;
	}
	public void giveDolls(){
		System.out.println(mm.getName()+" 送你洋娃娃");
	}

	public void giveFlowers(){
		System.out.println(mm.getName()+" 送你鲜花");
	}
	public void giveChocolate(){
		System.out.println(mm.getName()+" 送你巧克力");
	}
}
