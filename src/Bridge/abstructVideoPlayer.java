package Bridge;

public abstract class abstructVideoPlayer {
      protected VideoFile vf;
      public void setVideoFile( VideoFile vf)
      {
    	  this.vf=vf;
      }
      public  abstract void play(String fileName);
}
