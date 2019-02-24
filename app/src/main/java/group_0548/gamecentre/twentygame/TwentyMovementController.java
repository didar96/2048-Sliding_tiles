package group_0548.gamecentre.twentygame;


import android.content.Context;
import android.widget.Toast;

public class TwentyMovementController {
    /**
     * The board manager
     */
    private TwentyManager twentyManager = null;

    /**
     * The movement controller
     */
    TwentyMovementController() {
    }

    /**
     * Setting the board manager
     *
     * @param slidingManager the board manager
     */
    void setTwentyManager(TwentyManager slidingManager) {
        this.twentyManager = slidingManager;
    }

    /**
     * Process a swipe up
     */
    void processUpMovement() {
        twentyManager.swipeUp();
    }

    /**
     * Process a swipe down
     */
    void processDownMovement() {
        twentyManager.swipeDown();
    }

    /**
     * Process a swipe left
     */
    void processLeftMovement() {
        twentyManager.swipeLeft();
    }

    /**
     * Process a swipe right
     */
    void processRightMovement() {
        twentyManager.swipeRight();
    }

    /**
     * Process a tap for the undo button
     *
     * @param context the context
     */
    void processUndo(Context context) {
        if (this.twentyManager.ableToUndo()) {
            this.twentyManager.undoToPastState();
        } else {
            Toast.makeText(context, "No more undo", Toast.LENGTH_SHORT).show();
        }

    }

    /**
     * Process a tap for the redo button
     *
     * @param context the context
     */
    void processRedo(Context context) {
        if (this.twentyManager.ableToRedo()) {
            this.twentyManager.redoToFutureState();
        } else {
            Toast.makeText(context, "No more redo", Toast.LENGTH_SHORT).show();
        }
    }
}
