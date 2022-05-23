package week4day1;

public class Samsung implements AndroidDesign,SamsungDesign {

	@Override
	public void StarPhone() {
		// TODO Auto-generated method stub
		System.out.println("Start a call");
	}

	@Override
	public void makeCall() {
		// TODO Auto-generated method stub
		System.out.println("make a call");
	}

	@Override
	public void faceAuthentication() {
		// TODO Auto-generated method stub
		System.out.println("Face authentication");
		
	}

	@Override
	public void samsungGalaxy() {
		// TODO Auto-generated method stub
		System.out.println("Samsung model");
		
	}
	public static void main(String[]args) {
		
	Samsung obj=new Samsung();
	obj.samsungGalaxy();
	obj.faceAuthentication();
	obj.makeCall();
	
	
	
	
	
	
	
	}
	
	

	
		

	}


