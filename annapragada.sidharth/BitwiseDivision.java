//Divides numbers by powers of two based on a right shift, the amount of which is calculated using the squareroot of the denominator

import javax.swing.JOptionPane;

public class BitwiseDivision
{   

    public static void main (String args [])
    {
        
        String sInN = JOptionPane.showInputDialog("Numerator: ");
        String sInD = JOptionPane.showInputDialog("Denominator (power of 2 please): ");
        
        int iInN = Integer.parseInt(sInN);
        int iInD = Integer.parseInt(sInD);
        
        int n = iInD;
        int result = iInN >> n;
        
        System.out.println(result);
        
    }
    
}