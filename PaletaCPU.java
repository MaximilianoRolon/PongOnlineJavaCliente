import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URI;
import java.net.URL;

public class PaletaCPU extends Juego {
	private int x = ancho / 4;
	private int y = 30;
	private int largo = 150;
	private int altura = 30;
	private int dx;
	boolean right2;
	boolean left2;
	int dificultad=2;
	Image plat2 =Imagenes.plat2;
	
	public void update(Juego j, Pelota b1) {
switch(dificultad){
case 0:
	dx=5;
		if (b1.getY() < j.getHeight()) {
			if (b1.getY() > 0) {
				if (x < b1.getX()) {
					x += dx;
				}
				if (x > b1.getX()) {
					x -= dx;
				}
				}
			}
		break;
case 1:
	dx=10;
		if (b1.getY() < j.getHeight()) {
			if (b1.getY() > 0) {
				if (x < b1.getX()) {
					x += dx;
				}
				if (x > b1.getX()) {
					x -= dx;
				}
				}
			}
		break;
case 2:
	dx=15;
		if (b1.getY() < j.getHeight()) {
			if (b1.getY() > 0) {
				if (x < b1.getX()) {
					x += dx;
				}
				if (x > b1.getX()) {
					x -= dx;
				}
				}
			}
		break;
case 3:
	dx=20;
		if (b1.getY() < j.getHeight()) {
			if (b1.getY() > 0) {
				if (x < b1.getX()) {
					x += dx;
				}
				if (x > b1.getX()) {
					x -= dx;
				}
				}
			}
		break;
case 4:
	dx=25;
		if (b1.getY() < j.getHeight()) {
			if (b1.getY() > 0) {
				if (x < b1.getX()) {
					x += dx;
				}
				if (x > b1.getX()) {
					x -= dx;
				}
				}
			}
		break;
case 5:
	if (b1.getY() < j.getHeight()) {
		if (b1.getY() > 0) {
	x=b1.getX()+b1.getRadio();
		}
		}
	break;
		}
		Colission(b1);
	}

	private void Colission(Pelota b1) {

		if (b1.getY() > y && b1.getY() < y + altura) {
			if (b1.getX() + b1.getDiametro() > x && b1.getX() < x + largo) {
				if (b1.getDx() > 0) {
					b1.setDx(b1.getDx() + 1);
				}
				if (b1.getDx() < 0) {
					b1.setDx(b1.getDx() - 0.5);
				}

				b1.setDy((Math.abs(b1.getDy())) + 1);
				b1.setDy(b1.getDy());

			}
		}

	}

	public void paint(Graphics g) {
		
		g.drawImage(plat2, x, y, Imagenes.j);
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setLeft2(boolean left) {
		this.left2 = left;
	}

	public void setRight2(boolean right) {
		this.right2 = right;
	}
}
