import javax.swing.JOptionPane;

public class AverageMax
    {
        public static void main (String args [])
            {
                String value = JOptionPane.showInputDialog ("Maximu Value of Range to Average?");
                int iValue = Integer.parseInt (value);
                
                int counter = 0;  double total=0.0;
                
                
                while (counter <= iValue) //when does the pre-test counter stop???????
                    {
                        
                        total = total + counter; //accumulate integers
                        counter = counter + 1; //simulate each integer
                        
                    }// end of accumulating range
                    
                    double average = total/(counter - 1); //arithmetic mean of 1-iValue
                    JOptionPane.showMessageDialog (null, "The average of the values 1-" + value +
                                                    " is: " + average); /* shows concatenation of
                                                    Strings with values.  ALL dates becomes String
                                                    data type */
             }//end main method
    }//emd class AverageMax