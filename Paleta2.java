import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

public class Paleta2 extends Juego {
	private int x = ancho / 4;
	private int y = 30;
	private int largo = 150;
	private int altura = 30;
	private int dx = 20;
	boolean right2;
	boolean left2;
	Image plat2 =Imagenes.plat2;

	public void update(Juego j, Pelota b1) {
		Colission(b1);
	}

	private void Colission(Pelota b1) {
			
			
		if (b1.getY()  > y
				&& b1.getY()  < y + altura) {
			if (b1.getX() + b1.getDiametro() > x && b1.getX() < x + largo) {
				if (b1.getDx() > 0) {
					b1.setDx(b1.getDx()+1);
				}
				if (b1.getDx() < 0) {
					b1.setDx(b1.getDx()-1);
				}
				
				b1.setDy((Math.abs(b1.getDy()))+1);
				b1.setDy(b1.getDy());
				
			}
		}

	}

	public void MoveRight(Juego j) {

		if (x + largo < j.getWidth() - 1) {

			if (right2) {
				x = x + dx;
			}
			x = x + dx;
		}
	}

	public void MoveLeft(Juego j) {
		

		if (x > 0) {
			if (left2) {
				x = x - dx;
			}
			x = x - dx;
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
