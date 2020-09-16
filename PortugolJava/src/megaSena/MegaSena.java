package megaSena;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MegaSena {
	public static void main(String[] args) {
		System.out.println(" --- M E G A S E N A ---\n");
		
		final int LIMITE=06;
		int[] megaSena = new int[LIMITE];
		Random sorteio = new Random();
	
			for (int i=0;i<LIMITE;i++){// assigning the numbers drawn within the vector.
				megaSena[i] = sorteio.nextInt(60)+1;		
			}
			
			Arrays.sort(megaSena); // ordering the vector in ascending order.
			
			for (int i=0;i<LIMITE;i++){// printing the numbers in ascending order.
				System.out.print("  "+megaSena[i]);	
			}
		System.out.print("\n ========================");
		System.out.println("\n\n  LOTERIAS SORTE GRANDE ");
	}

}
