package com.aditi.designpatterns;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OS obj = osf.getInstance("ss");
		obj.spec();
	}

}

class OperatingSystemFactory{
	public OS getInstance(String str){
		if(str.equals("Open")){
			return new Android();
		}else if(str.equals("Closed")){
			return new IOS();
		}else{
			return new Windows();
		}
	}
}

interface OS{
	void spec();
}

class Android implements OS{
	@Override
	public void spec(){
		System.out.println("Most powerful OS!");
	}
}

class IOS implements OS{
	@Override
	public void spec() {
		
		System.out.println("Most secured OS!");
	}
}

class Windows implements OS{
	@Override
	public void spec() {
		
		System.out.println("I am about to die!");
	}
}