package calculohipotenusa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Hipotenusa hipotenusa = new Hipotenusa();
		
		System.out.println("Informe o primeiro cateto : ");
		hipotenusa.setC1((int) input.nextDouble());
		System.out.println("Informe o segundo cateto : ");
		hipotenusa.setC2((int) input.nextDouble());
		
		hipotenusa.setH(hipotenusa.calculaArea() );
		System.out.println("A area é = " + (hipotenusa.getH()));
		
		hipotenusa.setH(hipotenusa.calculaHp() );
		System.out.println("A hipotenusa é = " + (hipotenusa.getH()));
	

}
}
