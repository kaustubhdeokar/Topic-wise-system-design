package musicplayer_state_pattern;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class EnumToAction {

    Map<ActionEnum, Consumer<State>> map = new HashMap<>();

    public EnumToAction() {

        Consumer<State> playState = (State s) -> s.play();
        Consumer<State> pauseState = (State s) -> s.pause();
        Consumer<State> nextState = (State s) -> s.next();
        Consumer<State> prevState = (State s) -> s.prev();
        map.put(ActionEnum.PLAY, playState);
    }

    public Consumer<State> giveAction(ActionEnum actionEnum){
        return map.get(actionEnum);
    }

}
