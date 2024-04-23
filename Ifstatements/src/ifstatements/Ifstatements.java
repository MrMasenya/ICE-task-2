/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifstatements;
import javax.swing.JOptionPane;
        
public class Ifstatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int marks= Integer.parseInt(JOptionPane.showInputDialog("Enter your marks"));
       
        if(marks <50){
            JOptionPane.showMessageDialog(null,"Failed");
        }else{
            JOptionPane.showConfirmDialog(null, "Passed");
        }
    }
    
}
