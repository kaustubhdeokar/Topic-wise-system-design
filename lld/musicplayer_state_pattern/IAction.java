package musicplayer_state_pattern;

public interface IAction {
    abstract void play();
    abstract void pause();
    abstract void next();
    abstract void prev();
}
