package fraga.com;

import java.util.Iterator;

public class MultiplosDeTresAteCem {

	public static void main(String[] args) {
//		for(int i = 3; i < 100; i +=3) {
//			System.out.println(i);
//		}
		
		int fatorial = 1;
        for (int i = 1; i < 11; i++) {
            fatorial *= i;
            System.out.println("Fatorial de " + i + " = " + fatorial);
        }
	}

}
