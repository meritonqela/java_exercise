/** BounceController controls a moving ball within a box. */
public class BounceController
{
    private MovingBall ball;// model object
    private MovingBall ball2;
    private AnimationWriter writer; // output-view object
    /** Constructor BounceController initializes the controller
     * @param b - the model object
     * @param w - the output-view object */
    public BounceController(MovingBall b,MovingBall second, AnimationWriter w)
    { ball = b;
        ball2 = second;
        writer = w;
    }
    /** runAnimation runs the animation by means of an internal clock */
    public void runAnimation()
    { int time_unit = 1; // time unit for each step of the animation
        int painting_delay = 20; // how long to delay between repaintings
        while ( true )
        { delay(painting_delay);
            ball.move(time_unit);
            ball2.move(time_unit);

           // System.out.println(ball.xPosition() + ", " + ball.yPosition());
            writer.repaint(); // redisplay box and ball
           /* if (Math.abs(ball.xPosition() - ball2.xPosition()) < ball.radiusOf() + ball2.radiusOf() || Math.abs(ball.yPosition() - ball2.yPosition()) < ball.radiusOf() + ball2.radiusOf()) {
                ball.changeDirection();
                ball2.changeDirection();}*/

            if (ball.xPosition() == ball2.xPosition() || ball.yPosition() == ball2.yPosition()  ){
                ball.changeDirection();
                ball2.changeDirection();
            }
        }
    }


    /** delay pauses execution for how long milliseconds */
    private void delay(int how_long)
    { try { Thread.sleep(how_long); }
    catch (InterruptedException e) { }
    }


}

