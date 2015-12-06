import javax.swing.JOptionPane;
public class RectangleCalculator
{
    public static void main (String args [])
    {
        String lSide = JOptionPane.showInputDialog("Enter the length of the long side of the rectangle please.");
        String sSide = JOptionPane.showInputDialog("Enter the length of the short side of the rectangle please.");
        
        int side1 = Integer.parseInt(lSide);
        int side2 = Integer.parseInt(sSide);
        
        int perimeter = (side1 * 2) + (side2 * 2);
        
        System.out.println("The area is: " + side1 * side2);
        System.out.println("The perimeter is: " + perimeter );
        
    }
}