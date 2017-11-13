package Composite;

public class client {

	private static final String AntiVirus = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AntiVirus text=new TextFile();
		text.KillVirus();
		AntiVirus video=new VideoFile();
		video.KillVirus();
		AntiVirus folder=new FolderFile();
		((FolderFile) folder).add(new TextFile());
		((FolderFile) folder).add(new VideoFile());
		folder.KillVirus();

		
	}

}
