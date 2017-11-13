package Proxy;

public class OrdinaryUser implements AbstructUser{

	@Override
	public void modifyUserInfo() {
		System.out.println("modifyUserInfo");
		
	}

	@Override
	public void pulishNote() {
		System.out.println("pulishNote");
		
	}

	@Override
	public void viewNote() {
		System.out.println("viewNote");
		
	}



}
