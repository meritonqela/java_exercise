import java.awt.*;
/** BounceTheBall constructs and starts the objects in the animation. */
public class BounceTheBall
{ public static void main(String[] args)
{ // construct the model objects:
    int box_size = 200;
    int balls_radius = 6;
    Box box = new Box(box_size);
    Line l = new Line();
// place the ball not quite in the box’s center; about 3/5 position:
    MovingBall ball = new MovingBall((int)(box_size/5.0),(int)(box_size/3.0), balls_radius, box, l);
    BallWriter ballWriter = new BallWriter(ball, Color.BLUE);
    BoxWriter box_writer = new BoxWriter(box);
    LineWriter line = new LineWriter(box);
    AnimationWriter writer
            = new AnimationWriter(line, box_writer,ballWriter, box_size);
// construct the controller and start it:
    new BounceController(ball, writer).runAnimation();
}
}