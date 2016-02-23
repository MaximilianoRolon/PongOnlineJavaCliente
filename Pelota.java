import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Pelota extends Juego {
	private int x = 0;
	private int y = 0;
	private double dx = 2;
	private double dy = 3;
	private int radio = 30;
	private int diametro = radio * 2;
	Image ball =Imagenes.ball;

	public Pelota(int i, int j) {
		x = i;
		y = j;
	}

	public void update(Juego j) {
		if (x + radio + radio > j.getWidth() - 1) {
			x = j.getWidth() - 1 - radio - radio;
			dx = -dx;

		}
		if (x < 0) {
			x = 0;
			dx = -dx;

		}
		x += dx;
		// if (y + radio + radio > j.getHeight() - 1) {
		// y = j.getHeight() - 1 - radio - radio;
		// dy = -dy;

		// }
		//if (y < 0) {
		//	y = 0;
		//	dy--;
		//	dy = -dy;
		//	if (dx > 0) {
		//		dx++;
		//	}
		//	if (dx < 0) {
		//		dx--;
		//	}
	//	}
		y += dy;
	}

	public void paint(Graphics g) {
		
		g.drawImage(ball, x, y, Imagenes.j);
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

	public double getDx() {
		return dx;
	}

	public double getDy() {
		return dy;
	}

	public void setDx(double dx) {
		this.dx = dx;
	}

	public void setDy(double dy) {
		this.dy = dy;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
}
