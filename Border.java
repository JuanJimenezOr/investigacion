import javax.swing.JFrame;
import java.awt.BorderLayout;//libreria necesaria para el Layout
import javax.swing.JButton;//Libreria botones
public class Border extends JFrame{


	private void ventana(){

		//tamaño de la ventana
        	 this.setBounds(10,40,350,280);
         	
         	//establecemos el layout
         
         	this.setLayout(new BorderLayout(10,10));
	
		//Creacion de los controles
		JButton btnNor = new JButton("Norte");	
		JButton btnSur = new JButton("Sur");
		JButton btnCen = new JButton("Centro");
		JButton btnEast = new JButton("Este");
		JButton btnWest= new JButton("Oeste");
		
		//Asignacion de controles a las areas correspondientes
		this.add(btnNor, BorderLayout.NORTH);
		this.add(btnSur, BorderLayout.SOUTH);
		this.add(btnEast, BorderLayout.EAST);
		this.add(btnWest, BorderLayout.WEST);
		this.add(btnCen, BorderLayout.CENTER);
		this.setVisible(true);	
	}//ventana	
	
	public static void main(String ar[]) //Corrección del MAIN
	{
		Border m = new  Border();
		m.ventana();
	
	}//main
}//class
