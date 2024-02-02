
package caso2;

import javax.swing.JOptionPane;

public class Caso2 {

    public static void main(String[] args) {
        
        int dia;
        dia = Integer.parseInt(JOptionPane.showInputDialog("Escribe dia de la semana :"));
        
        switch (dia)
        {
            case 1:
                JOptionPane.showMessageDialog(null,"El dia es Lunes");
            break;
            case 2:
                JOptionPane.showMessageDialog(null,"El dia es Martes");
            break;
            case 3:
                JOptionPane.showMessageDialog(null,"El dia es Miercoles");
            break;
            case 4:
                JOptionPane.showMessageDialog(null,"El dia es Jueves");
            break;
            case 5:
                JOptionPane.showMessageDialog(null,"El dia es Viernes");
            break;
            case 6:
                JOptionPane.showMessageDialog(null,"El dia es Sabado");
            break;
            case 7 :
                JOptionPane.showMessageDialog(null,"El dia es Domingo");
            break;
            
            default:
                JOptionPane.showMessageDialog(null,"Opcion no Valida");
                
            
        }  
        
        
    }
    
}
