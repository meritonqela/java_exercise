/** BounceController controls a moving ball within a box. */
public class BounceController
{  // model object
    private MovingBall first_ball;
    private AnimationWriter writer; // output-view object
    /** Constructor BounceController initializes the controller
     * @param b - the model object
     * @param w - the output-view object */
    public BounceController(MovingBall b, AnimationWriter w)
    {
        first_ball = b;
        writer = w;
    }
    /** runAnimation runs the animation by means of an internal clock */
    public void runAnimation()
    { int time_unit = 1; // time unit for each step of the animation
        int painting_delay = 20; // how long to delay between repaintings
        while ( true )
        { delay(painting_delay);
            first_ball.move(time_unit);
            System.out.println(first_ball.xPosition() + ",  " + first_ball.yPosition());
            writer.repaint(); // redisplay box and ball
        }
    }
    /** delay pauses execution for how long milliseconds */
    private void delay(int how_long)
    { try { Thread.sleep(how_long); }
    catch (InterruptedException e) { }
    }
}