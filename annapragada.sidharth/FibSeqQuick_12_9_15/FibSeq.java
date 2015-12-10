import javax.swing.JOptionPane;

public class FibSeq
{
    public static void main (String args [])
    {
        int cnt = 0;
        int val1 = 1;
        int val2 = 1;
        int parVar2Store = 0;
        String sIn = JOptionPane.showInputDialog("Which number in the sequence would you like to find? (e.g 3rd, 20th, 605th)");
        String sInP = sIn.replaceAll("[^\\d]", "");
        int iIn = Integer.parseInt(sInP);
    
        while (cnt < iIn)
        {
            parVar2Store = val2;
            val2 = val2 + val1;
            val1 = parVar2Store;
            /*
            if (cnt == 1)
            {
                System.out.println("The " + cnt + "st number of the FibSequence is: " + val2);
            }
            if (cnt == 2)
            {
                System.out.println("The " + cnt + "nd number of the FibSequence is: " + val2);
            }
            if (cnt == 3)
            {
                System.out.println("The " + cnt + "rd number of the FibSequence is: " + val2);
            }
            */
            cnt++;
        }
        System.out.println("The " + cnt + "th number of the Fibbonacci Sequence is: " + val2);
    }
}