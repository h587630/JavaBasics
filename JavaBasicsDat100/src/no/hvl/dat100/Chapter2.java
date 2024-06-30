package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Chapter2 {
    public static void main(String[] args) {

        //Calculate area
        String tall1=showInputDialog("Give a number : ");
        int tall=parseInt(tall1);
        String tall2=showInputDialog("Give another number : ");
        int tall3=parseInt(tall2);
        int area= tall*tall3;
       showMessageDialog(null,"The area is : "+area);


       
    }
}
