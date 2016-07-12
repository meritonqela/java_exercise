import java.awt.*;

/**
 * Created by OK on 5/1/2016.
 */
public class LineWriter {
    private Box box;

    public LineWriter(Box b)
    { box = b; }

    public void paint(Graphics g) {

        int size = box.sizeOf();
        g.setColor(Color.BLACK);
        g.fillRect(size / 2, size / 4, 2, 100);

    }



}
