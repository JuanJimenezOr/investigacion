import javax.swing.JFrame;//teniamos que importar la libreria y extender la clase

public class BorderLayout extends JFrame{
	
	public static void main(String ar[]){
	 
	 //tamaño de la ventana
	 this.setBounds(10,40,350,280);
	 //creacion y establecimiento del gestor de organización
	 BorderLayout bd = new BorderLayout();
	 this.setLayout(bd); 
	
	}//main
}//class
