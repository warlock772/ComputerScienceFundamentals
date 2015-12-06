
import javax.swing.JOptionPane; //library path. javax is non critical stuffs (i think), swing is new java utils for javax (i think), JOptionPane is the class

public class Titler
{

    public static void main (String args [])
    {
        int age;
        double weight;
        boolean surpriseYesNo = false;
        String surprise = null;
        
        String sAge = JOptionPane.showInputDialog("Your age in years please.");
        age = Integer.parseInt (sAge);
        
        String sName = JOptionPane.showInputDialog("First name?");
        String lastName = JOptionPane.showInputDialog("Last name?");
        String title = JOptionPane.showInputDialog("Title?");
        if (title == null)
        {
            title = "";
        }
        
         String fullName = title + " " + sName + " " + lastName;
       
        if ((age <= 18) && (title != null))
        {
            surprise = "You are quite young to be a " + title;
            surpriseYesNo = true;
        }
        if (surpriseYesNo == true)
        {
           JOptionPane.showMessageDialog (null, "Hello " + fullName + ". " + surprise);
        }
        else 
           {
               JOptionPane.showMessageDialog (null, "Hello " + fullName + ". Congratulations on acheiving your high status.");
           }
  
       
    }

}
