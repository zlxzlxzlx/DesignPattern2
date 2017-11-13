package Proxy;

public class AgentUser implements AbstructUser{

	private OrdinaryUser ordinaryUser;
	private int level;
	public AgentUser(OrdinaryUser ordinaryUser,int level){
		 this.ordinaryUser=ordinaryUser;
	        this.level=level;
	}
		
	
	@Override
	public void modifyUserInfo() {
		if (0 == level) {
            System.out.println("对不起，你没有权限");
        }
        else if (1 == level) {
        	ordinaryUser.modifyUserInfo();
        }       
		
	}

	@Override
	public void pulishNote() {
		 if (0 == level) {
	            System.out.println("对不起，你没有权限");
	        }
	        else if (1 == level) {
	        	ordinaryUser.pulishNote();
	        }
		
	}

	@Override
	public void viewNote() {
		 System.out.println("viewNote");
	}


}
