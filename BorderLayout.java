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
	
		//Creacion de los controles
		JButton button1 = new JButton("norte");	
		JButton button2 = new JButton("sur");
		JButton button3 = new JButton("oeste");
		JButton button4 = new JButton("este");
		JButton button5= new JButton("centro");
	
	}	
	
	public static void main(String ar[]) //Corrección del MAIN
	{
		BorderLayout m = new  BorderLayout();
		m.BorderLayout();
		m.ventana();
	
	}//main
}//class
