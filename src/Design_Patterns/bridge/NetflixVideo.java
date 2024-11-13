package Design_Patterns.bridge;

public class NetflixVideo extends Video{
    public NetflixVideo(VideoProcessor processor) {
        super(processor);
    }

    @Override
    public void play(String videoFile) {
        processor.process(videoFile);
    }
}