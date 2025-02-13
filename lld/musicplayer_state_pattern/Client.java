package musicplayer_state_pattern;

public class Client {


    public static void main(String[] args) {

        MusicPlayerManager musicPlayerManager = new MusicPlayerManager();
        musicPlayerManager.perform(ActionEnum.PLAY);

        musicPlayerManager.perform(ActionEnum.PAUSE);

    }

}
