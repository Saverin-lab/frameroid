package ir.saverin.frameroid.api.media;

/**
 * Base interface to manage a screen.
 *
 * @author S.Hosein Ayat
 */
public interface Screen {

    public void update(float deltaTime);

    public void present();

    public void pause();

    public void resume();

    /**
     * Images recycle
     */
    public void dispose();

    public void handleBackButton();

    public Game getGame();

}
