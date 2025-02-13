package musicplayer_state_pattern;

public class PausedState extends State implements IAction{

    private MusicPlayerManager musicPlayerManager;

    public PausedState(MusicPlayerManager musicPlayerManager) {
        this.musicPlayerManager = musicPlayerManager;
    }

    @Override
    public void play() {
        System.out.println("Changing state to play");
        musicPlayerManager.setState(new PlayingState(this.musicPlayerManager));
    }

    @Override
    public void pause() {
        System.out.println("Paused state - pause action");
    }

}
