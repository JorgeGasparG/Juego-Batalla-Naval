package batalla;

import java.awt.Image;
import java.awt.Toolkit;

public class Graficos {
	public Image cargar(String sRuta){
		return Toolkit.getDefaultToolkit().createImage((getClass().getResource(sRuta)));
		
	}


}
