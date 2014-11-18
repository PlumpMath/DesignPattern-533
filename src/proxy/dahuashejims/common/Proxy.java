package proxy.dahuashejims.common;

public class Proxy implements Subject {

	RealSubject realSubject;
	
	@Override
	public void request() {
		System.out.println("proxy request...");
		if(null==realSubject){
			realSubject = new RealSubject();
		}
		realSubject.request();
	}

}
