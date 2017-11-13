package Bridge;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VideoFile vf;  
        abstructVideoPlayer avp = new windows();  
        vf = new AVI();  
        avp.setVideoFile(vf);
        avp.play("AVI");
	}

}
