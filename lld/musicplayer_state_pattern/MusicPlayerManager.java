package musicplayer_state_pattern;

import java.util.function.Consumer;

public class MusicPlayerManager {

    private State state;
    private EnumToAction getActionForEnum = new EnumToAction();
    public MusicPlayerManager() {
        this.state = new PausedState(this);
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

    public void perform(ActionEnum actionEnum){
        Consumer<State> stateConsumer =
                getActionForEnum.giveAction(actionEnum);
        stateConsumer.accept(this.state);
    }


}