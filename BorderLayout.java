import javax.swing.JFrame;
import java.awt.BorderLayout;//libreria necesaria para el Layout

public class BorderLayout extends JFrame{


	private void ventana()//Lo del main va en esta función, la llamaré ventana
	{
		//tamaño de la ventana
        	 this.setBounds(10,40,350,280);
         	//creacion y establecimiento del gestor de organización
         	BorderLayout bd = new BorderLayout();
         	this.setLayout(bd);
		
	}
	
	public static void main(String ar[])
	{
		BorderLayout = m BorderLayout();
		m.BorderLayout();
	
	}//main
}//class
