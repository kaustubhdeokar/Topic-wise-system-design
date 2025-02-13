package musicplayer_state_pattern;

public abstract class State implements IAction {

    @Override
    public void next() {
        System.out.println("Common state - next action.");
    }

    @Override
    public void prev() {
        System.out.println("Common state - prev action.");
    }
}
