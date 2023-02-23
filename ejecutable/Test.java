package ejecutable;

import javax.swing.JOptionPane;

public class Test
{ 
    public static void main(String[] args) 
    {
        int x;
        int y;
        int z;

        x= Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de x : "));
        y= Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de y : "));
        z= Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de z : "));

        if (x>y);
           if(x>z)
           
        JOptionPane.showMessageDialog(null, "El numero mayor es :" + x );

        if(y>x );
            if(y>z)
        JOptionPane.showMessageDialog(null, "El numero mayor es :" + y);

        if(z>x );
            if(z>y)
        JOptionPane.showMessageDialog(null, "El numero mayor es :" + z);

        //fin
        

    }

}
