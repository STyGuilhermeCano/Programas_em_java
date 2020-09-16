package vetoresMatrizes;

import java.util.Random;
import java.util.Scanner;

public class Exercicio04 
{

	public static void main(String[] args)
	{
	   /*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
		(1) somar as duas matrizes 
		(2) subtrair a primeira matriz da segunda 
		(3) adicionar uma constante as duas matrizes
		(4) imprimir as matrizes 
		Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
		Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante
		deve ser armazenado na própria matriz. */
		 
		Scanner kb = new Scanner (System.in);
        Random sorteio = new Random();
        int a=2;
        final int LIMITE=a;
        int[][] matriz1 = new int[LIMITE][LIMITE];
        int[][] matriz2 = new int[LIMITE][LIMITE];
        int[][] matriz3 = new int[LIMITE][LIMITE];
        int[][] matriz4 = new int[LIMITE][LIMITE];
        int linha, coluna, numDigitado=0;

        System.out.println("Digite: 1 - para somar, 2 - para subitrair, 3 - para adicionar uma constante 4 - para imprimir as matrizes.");
        numDigitado = kb.nextInt();
        
        
        
       //System.out.println("Matriz 1 \n");
        for(linha=0; linha<LIMITE; linha++) //matriz 1
         {
             //System.out.printf(" | ");

             for (coluna=0; coluna<LIMITE; coluna++)
             {
                 matriz1[linha][coluna] = sorteio.nextInt(20)+1;

                  //   System.out.print(matriz1[linha][coluna]);
                  //   System.out.print(" | ");
            }
            // System.out.print("\n\n");
        }

         //System.out.println("\nMatriz 2 \n");

         for(linha=0; linha<LIMITE; linha++) //matriz 2
         {
            // System.out.printf(" | ");

             for (coluna=0; coluna<LIMITE; coluna++)
             {
                 matriz2[linha][coluna] = sorteio.nextInt(20)+1;

                   // System.out.print(matriz2[linha][coluna]);
                   //  System.out.print(" | ");
            }
            // System.out.print("\n\n");
        }

       //  System.out.println("Matriz 3\n");
         
         for(linha=0; linha<LIMITE; linha++) //matriz 03
         {
             //System.out.printf(" | ");

             for (coluna=0; coluna<LIMITE; coluna++)
             {
                 matriz3[linha][coluna] = (matriz1[linha][coluna] + matriz2[linha][coluna]);

                    // System.out.print(matriz3[linha][coluna]);
                    // System.out.print(" | ");
            }
             //System.out.print("\n\n");
        }

   // System.out.println("Matriz 4\n");
         
         for(linha=0; linha<LIMITE; linha++) //matriz 04
         {
            // System.out.printf(" | ");

             for (coluna=0; coluna<LIMITE; coluna++)
             {
                 matriz4[linha][coluna] = (matriz2[linha][coluna] - matriz1[linha][coluna]);

                     //System.out.print(matriz4[linha][coluna]);
                     //System.out.print(" | ");
            }
             //System.out.print("\n\n");
        }
         
         // if 
         
       if(numDigitado == 1)
       {
    	   for(linha=0; linha<LIMITE; linha++) // if 1
           {
               System.out.printf(" | ");

               for (coluna=0; coluna<LIMITE; coluna++)
               {
                  // matriz3[linha][coluna] = (matriz1[linha][coluna] + matriz2[linha][coluna]);

                       System.out.print(matriz3[linha][coluna]);
                       System.out.print(" | ");
              }
               System.out.print("\n\n");
          }
       }
       
       // if2
       
       else if(numDigitado == 2)
       {
    	   for(linha=0; linha<LIMITE; linha++) // if 2
           {
               System.out.printf(" | ");

               for (coluna=0; coluna<LIMITE; coluna++)
               {
                   matriz4[linha][coluna] = (matriz1[linha][coluna] - matriz2[linha][coluna]);

                       System.out.print(matriz4[linha][coluna]);
                       System.out.print(" | ");
              }
               System.out.print("\n\n");
          }
       }
       
       // if 4 imprimir matrizes 1 e 2 
       
       else if(numDigitado == 4)
       {
    	   System.out.println("Matrizes 1 e 2 ");
    	   for(linha=0; linha<LIMITE; linha++) //matriz 1
           {
              // System.out.printf("| ");

               for (coluna=0; coluna<LIMITE; coluna++)
               {
                  
                      System.out.print("\n"+matriz1[linha][coluna]);
                      System.out.print(" | "+matriz2[linha][coluna]);
                      
              }
               System.out.print("\n");
          }
    	  
       }  
       else if (numDigitado == 3)
       {
    	   System.out.println("escolha o valor da matriz");
    	   a=kb.nextInt();
       }
       
        kb.close();


	}

}
