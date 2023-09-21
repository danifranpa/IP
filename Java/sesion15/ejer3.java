package sesion15;
import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double[] v1=leeVector(scan);
		double[] v2=leeVector(scan);
		System.out.printf("%.2f grados",anguloVectores(v1,v2));
	}
	
	public static double[] leeVector(Scanner scan) {
		System.out.print("Introduce la longitud del vector: ");
		int longitud=scan.nextInt();
		double[] vector=new double[longitud];
		for(int i=0;i<vector.length;i++) {
			System.out.printf("Introduce el elemento %d: ",i+1);
			vector[i]=scan.nextDouble();
		}
		return vector;
	}
	
	public static double productoEscalar(double[] v1,double[] v2) {
		if(v1.length==v2.length) {
			int producto=0;
			for(int i=0;i<v1.length;i++) {
				producto+=v1[i]*v2[i];
			}
			return producto;
		}else {
			System.out.println("Los vectores no tienen las mismas dimensiones");
			return 0;
		}
	}
	
	public static double moduloVector(double[] v1) {
		return Math.sqrt(productoEscalar(v1,v1));
	}
	public static double anguloVectores(double[] v1,double[] v2) {
		return Math.toDegrees(Math.acos(productoEscalar(v1,v2)/(moduloVector(v1)*moduloVector(v2))));
	}
}