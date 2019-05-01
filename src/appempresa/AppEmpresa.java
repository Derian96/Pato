/*
    Universidad Nacional de Costa Rica
    Sede Regional Chorotega, Campus Nicoya  
    Ingeniería en Sistemas de Información
    Programación II - EIF204
    Académica: Gloriana Peña Ramírez 

    PROYECTO PROGRAMADO - Facturación JAVA

    Desarrolladores: 
    - Eddie Alfaro 
    - Derian Abarca
    - Diego Aguilar
*/ 

package appempresa;

import gui.frmLogin;
import javax.swing.JFrame;
import org.jvnet.substance.SubstanceLookAndFeel;

public class AppEmpresa {

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true); //que nos permite dejar a Substance la decoración 
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.MagmaSkin"); // Sentencia que aplica el skin Magma de Substance
        //new frmPrincipal().setVisible(true);
        new frmLogin().setVisible(true);
    }
    
}
