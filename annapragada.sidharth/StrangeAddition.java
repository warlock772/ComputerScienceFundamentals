import javax.swing.JOptionPane;
public class StrangeAddition
{
    public static void main (String args [])
    {
        String sN = JOptionPane.showInputDialog("Number to find additive factorial of: ");
        int iN = Integer.parseInt(sN);
        int r = 0;
        
        while (iN > 0)
        {
            r = r + iN;
            iN--;
        }
        
        System.out.println(r);
          
    }
}