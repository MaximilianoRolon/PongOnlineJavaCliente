import java.awt.Image;
import java.net.URL;


public class Imagenes {
	static Image plat1,plat2,ball;
	URL url;
	static Juego j;
	public Imagenes(Juego j) {
		url=j.getDocumentBase();
		plat1=j.getImage(url,"plat1.jpg");
		plat2=j.getImage(url,"plat2.gif");
		ball=j.getImage(url,"ball.png");
		this.j=j;
	}
}
