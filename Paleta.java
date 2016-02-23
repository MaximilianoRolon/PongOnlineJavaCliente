import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Paleta extends Juego {
	private int x = ancho / 2;
	private int y = alto - 30;
	private int largo = 150;
	private int altura = 30;
	private int dx = 20;
	boolean right;
	boolean left;
	Image plat1 =Imagenes.plat1;

	public void update(Juego j, Pelota b1) {
		Colission(b1);
	}

	private void Colission(Pelota b1) {
		if (b1.getY() + b1.getDiametro() > y
				&& b1.getY() + b1.getDiametro() < y + altura) {
			if (b1.getX() + b1.getDiametro() > x && b1.getX() < x + largo) {
				b1.setDy(-b1.getDy());
				if (b1.getDx() > 0) {
					b1.setDx(b1.getDx()+1);
				}
				if (b1.getDx() < 0) {
					b1.setDx(b1.getDx()-0.5);
				}
				
				b1.setDy((Math.abs(b1.getDy()))+1);
				b1.setDy(-b1.getDy());
			}
		}

	}

	public void MoveRight(Juego j) {

		if (x + largo < j.getWidth() - 1) {

			if (right) {
				x = x + dx;
			}
			x = x + dx;
		}
	}

	public void MoveLeft(Juego j) {

		if (x > 0) {
			if (left) {
				x = x - dx;
			}
			x = x - dx;
		}
	}

	public void paint(Graphics g) {
		
		
		g.drawImage(plat1, x, y, Imagenes.j);
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

	public void setLeft(boolean left) {
		this.left = left;
	}

	public void setRight(boolean right) {
		this.right = right;
	}
}
