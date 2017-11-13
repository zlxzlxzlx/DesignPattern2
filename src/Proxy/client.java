package Proxy;

public class client {

	public static void main(String[] args) {
		OrdinaryUser ou=new OrdinaryUser();
		 AbstructUser au1=new AgentUser(ou,1);
		 AbstructUser au2=new AgentUser(ou,0);
		 au1.modifyUserInfo();
		 au1.pulishNote();
		 au1.viewNote();
		 au2.modifyUserInfo();
		 au2.pulishNote();
		 au2.viewNote();

	}

}
