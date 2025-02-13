package musicplayer_state_pattern;

public class PlayingState extends State implements IAction {

    private MusicPlayerManager musicPlayerMgr;

    PlayingState(MusicPlayerManager musicPlayerMgr) {
        this.musicPlayerMgr = musicPlayerMgr;
    }

    @Override
    public void play() {
        System.out.println("Playing state - playing...");
    }

    @Override
    public void pause() {
        this.musicPlayerMgr.setState(new PlayingState(this.musicPlayerMgr));
    }


}
