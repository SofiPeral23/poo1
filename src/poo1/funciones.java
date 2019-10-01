package poo1;

import javax.swing.JOptionPane;


public class funciones {
    float volumen, area;
    float num, num2;
    
    
    public funciones(){
        
        num = Float.parseFloat(JOptionPane.showInputDialog("digite el radio para el area: "));
        area =(float) (4*3.1416*(Math.pow(num, 2)));
        JOptionPane.showMessageDialog(null, "el area de la esfera es: "+area);
        
        
        
         num2 = Float.parseFloat(JOptionPane.showInputDialog("digite el radio para el volumen: "));
        volumen =(float) (1.33*3.1416*(Math.pow(num2 ,3)));
        JOptionPane.showMessageDialog(null, "el volumen de la esfera es: "+volumen);
        
        
        
        
 
}
}

