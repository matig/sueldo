import java.util.Scanner;

public class promedio {
	public static void main (String[] ar) {
		Scanner teclado= new Scanner(System.in);
		int n1,n2,n3,n4,n5,n;
		float promedio;
		float total;
		n=0;
		System.out.println("ingrese el valor");
		n1=teclado.nextInt();
		n=n+1;
		System.out.println("ingrese el valor");
		n2=teclado.nextInt();
		n=n+1;
		System.out.println("ingrese el valor");
		n3=teclado.nextInt();
		n=n+1;
		System.out.println("ingrese el valor");
		n4=teclado.nextInt();
		n=n+1;
		System.out.println("ingrese el valor");
		n5=teclado.nextInt();
		n=n+1;
		total= n1+n2+n3+n4+n5;
		promedio= total/n;
		System.out.print("el promedio sera ");
		System.out.print(promedio);
	}
}
