import javax.swing.JOptionPane;

public class SlopeCalculator
{
    public static void main (String args [])
    {
        JOptionPane.showMessageDialog(null, "Forenote: The current version of this program, v.1.1, does not support fractions. There is no new version available at this time. I apologize for the inconvenience.");
        String x1 = JOptionPane.showInputDialog("x1: ");
        int iX1 = Integer.parseInt(x1);
        String x2 = JOptionPane.showInputDialog("x2: ");
        int iX2 = Integer.parseInt(x2);
        String y1 = JOptionPane.showInputDialog("y1: ");
        int iY1 = Integer.parseInt(y1);
        String y2 = JOptionPane.showInputDialog("y2: ");
        int iY2 = Integer.parseInt(y2);
        
        double slope  = (iY2 - iY1)/(iX2 - iX1);
        if ((iY2 - iY1) < (iX2 - iX1))
        {
            JOptionPane.showMessageDialog(null, "Unfourtunately the numbers you entered generated a fractional slope, which this program cannot process. Sorry for the inconvinience.");
        }
        else
        {
           JOptionPane.showMessageDialog(null, "Slope is:  " + slope + " . Thanks for using this calculator!");
        }
            
        
    }
}