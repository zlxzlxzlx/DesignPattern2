package Bridge;

public class windows extends abstructVideoPlayer{

	 public void play(String fileName) {  
	        String type = "Windows����";  
	        this.vf.decode(type,fileName);  
	    }  
}
