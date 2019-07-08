package batalla;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

@SuppressWarnings("serial")
public class BatallaNaval extends JFrame{

	public Image imagen_portada;
	public URL portada;
	public Image imagen_tablero;
	public URL tablero;
	int estado=0;
	
	@SuppressWarnings("unused")
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BatallaNaval frame = new BatallaNaval();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public BatallaNaval() {
		
		this.setBounds(100, 100, 900, 600);
		this.setTitle("Batalla Naval");
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		portada=this.getClass().getResource("/batalla/Diseño sin título.jpg");
		imagen_portada=new ImageIcon(portada).getImage();
		tablero=this.getClass().getResource("/batalla/4_sea_battleship_combat_3d.jpg");
		imagen_tablero=new ImageIcon(tablero).getImage();
		
		Container contenedor=getContentPane();
		contenedor.add(panel);	
		addMouseListener(
				new MouseAdapter(){ 
					public void mouseClicked(MouseEvent e){
						if (estado==0){
							estado=1;
							repaint();
						}
					}
				}
				);
				
		
		
	}
	public JPanel panel=new JPanel(){
		public void paint(Graphics g){
		
			
			if(estado==1){
				g.drawImage(imagen_portada, 0,0, getWidth(), getHeight(), this);
				}else{
					g.drawImage(imagen_tablero, 0,0, getWidth(), getHeight(), this);
				}
		
		
		}
	};

	
}

