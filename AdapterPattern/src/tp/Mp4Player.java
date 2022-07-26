package tp;
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playFile(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
