package kosinüs_teoremi;
import java.text.DecimalFormat;
import java.util.Scanner;
public class app {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Birinci kenar uzunluğu : ");
		int a = scanner.nextInt();
		
		System.out.print("İkinci kenar uzunluğu : ");
		int b = scanner.nextInt();
		
		System.out.print("Aralarındaki açı değeri : ");
		int derece = scanner.nextInt();
		
		
		double theta = Math.toRadians(derece);
		
		double c = Math.sqrt((a*a+b*b)-2*(a*b*Math.cos(theta)));
		
		
		System.out.println("üçüncü kenar uzunluğu = "+new DecimalFormat("##.##").format(c));
		
		
		
		
		/*
	    double a = 4.0; // İlk kenarın uzunluğu
		double b = 3.0; // İkinci kenarın uzunluğu
		double theta = Math.toRadians(30.0); // Açıyı dereceden radyana dönüştürün

		double c = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(theta));
*/

	}

}
