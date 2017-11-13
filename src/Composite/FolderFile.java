package Composite;

import java.util.ArrayList;

public class FolderFile extends AntiVirus{

	private ArrayList list=new ArrayList<>();
	
	public void add(AntiVirus av) 
    {  
		list.add(av);   
    }  
      
    public void remove(AntiVirus av) 
    {  
    	list.remove(av);  
    }  
	@Override
	public void KillVirus() {
		// TODO Auto-generated method stub
		 for(Object obj : list) 
	        {  
	            ((AntiVirus)obj).KillVirus();  
	        }  
	}

}
