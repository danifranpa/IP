import java.util.Scanner;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Tablero1 extends JPanel {
	// declaramos las variables
	private
	int filas, columnas, jugadas;
	char[][] matriz;

	/*Ponemos metodos set de la matriz
	 * 
	 * Numero de filas
	 */
	public void setfilas(int f) {
		if (f > 1)
			filas = f;
	}

	/** Numero de columnas */
	public void setcolumnas(int c) {
		if (c > 1)
			columnas = c;
	}

	/* Numero de jugadas */
	public void setjugadas(int n) {
		jugadas = n;
	}

	/*
	 * Metodos get de la matriz
	 * 
	 * 
	 */
	public char[][] getmatriz() {
		return matriz;
	}

	/* Numero de filas */
	public int getfilas() {
		return filas;
	}

	/* Numero de columnas */
	public int getcolumnas() {
		return columnas;
	}

	/* Numero de jugadas */
	public int getjugadas() {
		return jugadas;
	}

	/* Metodo para imprimir la matriz por pantalla */
	public void imprimeTablero() {
		for (int f = 0; f < this.getmatriz().length; f++) {
			System.out.printf("%d  ", f + 1);
			for (int c = 0; c < this.getmatriz()[1].length; c++) {
				System.out.printf("%s ", this.getmatriz()[f][c]);

			}
			System.out.println();

		}
		System.out.println();
		System.out.print("   ");
		for (int c = 0; c < this.getmatriz()[1].length; c++) {
			System.out.printf("%d ", c + 1);
		}

	}

	/**
	 * Creamos la matriz de base
	 *
	 */
	public void setmatriz(int filas, int colum) {
		int valor = 0;
		char[][] tablero = new char[filas][colum];
		for (int f = 0; f < tablero.length; f++) {
			for (int c = 0; c < tablero[f].length; c++) {
				valor = (int) (Math.random() * (2 - 0) + 0);
				if (valor == 0) {
					tablero[f][c] = 'R';
				} else {
					tablero[f][c] = 'B';
				}
			}
		}
		matriz = tablero;
	}

	public Tablero1(int f, int c) {
		this.setfilas(f);
		this.setcolumnas(c);
		this.setmatriz(f, c);

		addMouseListener(new MouseHandler());
	}

	Tablero1() {
		this(6, 8);
	}

	/*
	 * Implementamos el metodo estadostableros
	 */
	public void estadostableros(int filac1, int columnac1, int filac2, int columnac2) {
		for (int i = filac1 - 1; i <= filac2 - 1; i++) {
			for (int j = columnac1 - 1; j <= columnac2 - 1; j++) {
				this.getmatriz()[i][j] = '-';
			}
		}
		this.imprimeTablero();
		System.out.println();
		System.out.println();
		System.out.println();
		// Nueva matriz
		for (int i = filac1 - 1; i <= filac2 - 1; i++) {
			int valor = 0;
			for (int j = columnac1 - 1; j <= columnac2 - 1; j++) {
				valor = (int) (Math.random() * (2 - 0) + 0);
				if (valor == 0) {
					this.getmatriz()[i][j] = 'R';
				} else {
					this.getmatriz()[i][j] = 'B';
				}
			}
		}
		this.imprimeTablero();
	}
	/*
	 * Nos da los puntos de la jugada
	 * 
	 */

	public int darpuntos(int filac1, int columnac1, int filac2, int columnac2) {
		int puntos = 0;
		for (int i = filac1 - 1; i <= filac2 - 1; i++) {
			for (int j = columnac1 - 1; j <= columnac2 - 1; j++) {
				puntos = puntos + 10;
			}
		}
		return puntos;
	}

	/**
	 * Saber si acaba la partida
	 * 
	 */
	public void finpartida(int n, int puntos1, int puntos2) {
		if (n == this.getjugadas()) {
			System.out.printf("Se acabo la partida, puntos del jugador 1:%d\npuntos del jugador 2:%d\n", puntos1, puntos2);
			if (puntos1 > puntos2) {
				System.out.print("Gano jugador 1");
			} else if (puntos2 > puntos1) {
				System.out.print("Gano jugador 2");
			} else {
				System.out.print("Empate");
			}
		}
	}

	/**
	 * Metodo para poner la dificultad que uno quiera
	 */
	public double dificultad(int numerin) {
		double dificultad = 0;
		while (numerin <= 0 || numerin > 4) {
			System.out.print("otra vez");
		}
		if (numerin == 1) {
			dificultad = 0.2;
		} else if (numerin == 2) {
			dificultad = 0.4;
		} else if (numerin == 3) {
			dificultad = 0.6;
		} else if (numerin == 4) {
			dificultad = 1;
		}
		return dificultad;
	}

	/*
	 * Aqui podras elegir si jugar contra la maquina o el jugador2
	 * 
	 */
	public void jugada(Scanner t) {
		System.out.print("Jugar contra la maquina (SI=1/NO=0):");
		int respuesta = t.nextInt();
		while (respuesta != 0 && respuesta != 1) {
			System.out.print("Solo numeros 1 o 0\n");
			respuesta = t.nextInt();
		}
		int puntos1 = 0;
		int puntos2 = 0;
		if (respuesta == 0) {
			for (int n = 1; n <= this.getjugadas(); n++) {
				System.out.print("JUGADOR 1:\n");
				this.imprimeTablero();
				System.out.print("\nEsquina superior izquierda: \n");
				int filac1 = t.nextInt();
				int columnac1 = t.nextInt();
				System.out.print("Esquina inferior derecha: \n");
				int filac2 = t.nextInt();
				int columnac2 = t.nextInt();
				while (filac1 < 1 || filac2 < 1 || columnac1 < 1 || columnac2 < 1) {
					System.out.print("MAL\n");
					System.out.print("Esquina superior izquierda: \n");
					filac1 = t.nextInt();
					columnac1 = t.nextInt();
					System.out.print("Esquina inferior derecha: \n");
					filac2 = t.nextInt();
					columnac2 = t.nextInt();
				}
				while (!((this.getmatriz()[filac1 - 1][columnac1 - 1] == this.getmatriz()[filac2 - 1][columnac2 - 1])
						&& (this.getmatriz()[filac1 - 1][columnac1 - 1] == this.getmatriz()[filac1 - 1][columnac2 - 1])
						&& (this.getmatriz()[filac1 - 1][columnac1 - 1] == this.getmatriz()[filac2 - 1][columnac1 - 1])
						&& (filac1 != filac2) && (columnac1 != columnac2))) {
					System.out.print("MAL\n");
					System.out.print("Esquina superior izquierda: \n");
					filac1 = t.nextInt();
					columnac1 = t.nextInt();
					System.out.print("Esquina inferior derecha: \n");
					filac2 = t.nextInt();
					columnac2 = t.nextInt();
					// jugada del jugador 1
				}
				this.estadostableros(filac1, columnac1, filac2, columnac2);
				puntos1 = this.darpuntos(filac1, columnac1, filac2, columnac2) + puntos1;
				System.out.printf("\nPuntos jugador 1: %d\t", puntos1);
				System.out.printf("\nPuntos jugador 2: %d\n", puntos2);
				System.out.printf("Jugadas restantes:%d\n", this.getjugadas() - n);
				System.out.print("\nJUGADOR 2\n");
				this.imprimeTablero();
				System.out.print("\nEsquina superior izquierda: \n");
				filac1 = t.nextInt();
				columnac1 = t.nextInt();
				System.out.print("Esquina inferior derecha: \n");
				filac2 = t.nextInt();
				columnac2 = t.nextInt();
				while (filac1 < 1 || filac2 < 1 || columnac1 < 1 || columnac2 < 1) {
					System.out.print("MAL\n");
					System.out.print("Esquina superior izquierda: \n");
					filac1 = t.nextInt();
					columnac1 = t.nextInt();
					System.out.print("Esquina inferior derecha: \n");
					filac2 = t.nextInt();
					columnac2 = t.nextInt();
				}
				while (!((this.getmatriz()[filac1 - 1][columnac1 - 1] == this.getmatriz()[filac2 - 1][columnac2 - 1])
						&& (this.getmatriz()[filac1 - 1][columnac1 - 1] == this.getmatriz()[filac1 - 1][columnac2 - 1])
						&& (this.getmatriz()[filac1 - 1][columnac1 - 1] == this.getmatriz()[filac2 - 1][columnac1 - 1])
						&& (filac1 != filac2) && (columnac1 != columnac2))) {
					System.out.print("MAL\n");
					System.out.print("Esquina superior izquierda: \n");
					filac1 = t.nextInt();
					columnac1 = t.nextInt();
					System.out.print("Esquina inferior derecha: \n");
					filac2 = t.nextInt();
					columnac2 = t.nextInt();
					// imprimimos de nuevo el tablero para que el jugador 2 
				}
				this.estadostableros(filac1, columnac1, filac2, columnac2);
				puntos2 = this.darpuntos(filac1, columnac1, filac2, columnac2) + puntos2;
				System.out.printf("\nPuntos jugador 1: %d\t", puntos1);
				System.out.printf("\nPuntos jugador 2: %d\n", puntos2);
				System.out.printf("Jugadas restantes:%d\n", this.getjugadas() - n);
				this.finpartida(n, puntos1, puntos2);
				// final de partida
			}
		}

		// JUGADA CONTRA MAQUINA
		else {
			System.out.print("Elige dificultad:1-principiante,2-medio,3-experto,4-maestro:  ");
			double dificultadelegida = this.dificultad(t.nextInt());
			for (int n = 1; n <= this.getjugadas(); n++) {
				System.out.print("JUGADOR 1: \n");

			}
		}

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

	}

	private class MouseHandler extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {

			JOptionPane.showMessageDialog(null, String.format("Raton %d,%d \n", e.getX(), e.getY()));

			repaint();
		}
	}
}
