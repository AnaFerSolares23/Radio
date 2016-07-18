import java.awt.EventQueue;

/**
 * Autores: Anafer Solares - 13125
           Xavier Cifuentes - 13316
		   Pablo De Leon - 13227
*   Fecha: 17/07/16
 */
class Main{
	public static void main (String [] args){
		EventQueue.invokeLater(new Runnable(){
			/* (non-Javadoc)
			 * @see java.lang.Runnable#run()
			 * Permite correr el programa y mostrar la interfaz
			 */
			public void run(){
				try{
					GUI frame = new GUI();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
