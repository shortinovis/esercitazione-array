import java.util.Scanner;
import java.util.Random;

public class Main{
	public static void main(String[] args) {
	    Scanner t = new Scanner(System.in);
	    int valori = 0;
	    int[] numeri = new int[100];
	    int n;
	    Random gen = new Random ();
	    int randomNum = gen.nextInt ();
	    boolean continua= false;
	    int sostituto;
	    int posizione;
	    int ricerca = 0;
	    int ricercato;
	    
	    do{
	    System.out.println("quale tipologia vuoi scegliere?");
	    System.out.println("1-inserimento da tastiera");
	    System.out.println("2-inserimento a random");
	    System.out.println("3-visualizzazione");
	    System.out.println("4-inserimento specifico");
	    System.out.println("5-cancellazione elemento");
	    System.out.println("6-FINE");
	    n = t.nextInt();
	    switch (n) {
	        case 1:
	    System.out.println("quanti valori vuoi inserire?");
	    valori = t.nextInt();
	    if(valori>100 || valori<0){
	        System.out.println("valori tra 0 e 100");
	    }else{
	        continua= true;
	        System.out.println("inserisci i valori:");
		for(int i=0; i<valori; i++){
		    numeri[i] = t.nextInt();
		}
	    }
	    break;
		    case 2:
        System.out.println("quanti valori vuoi inserire?");
	    valori = t.nextInt();
	    if(valori>100 || valori<0){
	        System.out.println("valori tra 0 e 100");
	    }else{
	        continua = true;
		for(int i=0; i<valori; i++){
		    numeri[i] = randomNum;
		}
	    }
	    break;
	        case 3:
	            for(int i=0; i<valori; i++){
		    System.out.println("il " + (i + 1) +"°numero è" + numeri[i]);
	                }
	        break;
	        case 4:
	            System.out.println("che numero vuoi inserire?");
	            sostituto = t.nextInt();
	            System.out.println("in che posizione lo vuoi inserire?");
	            posizione = t.nextInt();
	            if(posizione>100 || posizione<0){
	                System.out.println("valori tra 0 e" + valori);
	            }else
	            for(int i= valori; i<= posizione; i--){
	               numeri[i] = numeri[i-1];
	            }
	            numeri[posizione] = sostituto;
	            
	            break;
	        case 5:
	            System.out.println("che numero vuoi cercare?");
	            ricercato = t.nextInt();
	            for(int i = 0; i<valori; i++){
	                if(numeri[i] == ricercato){
	                    ricerca = i;
	                }
	            }
	            for(int i = ricerca; i <= valori; i++){
	                numeri[i] = numeri[i + 1];
	            }
	            valori--;
	            break;
	        case 6:
	            System.out.println("sciao belo!!!");
	            continua = false;
	            break;
		}
	    }while(continua == true);
	}
}
