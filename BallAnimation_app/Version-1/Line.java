/**
 * Created by OK on 5/1/2016.
 */
public class Line {

    public boolean contactLine(int x_position, int y_position )
    {
        boolean x = false; boolean y = false ;
        if (x_position == 100){x = true;}

        for (int i = 50 ; i <= 150 ; i++)
        { if (y_position == i ){y = true; }}
        return x & y ;
    }



}
