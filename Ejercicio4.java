package org.generation;
//importe el java.util.scanner para utilizar scanner
import java.util.Scanner;

public class Codigo4 {
	// Añadi el puclic static void main
	public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
  //Scanner s2 = new Scanner(System.in);

	  System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	  String j1 = s.nextLine();

	  System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	  String j2 = s.nextLine();
	
	
	  //Para comparar añadi el .equals()
	  if(j1.equals(j2))
	  {
	  	System.out.println("Empate");
	  }else
	  {
		  int g = 2;
		
		  switch(j1) {
		    case "piedra":
			    //Para comparar añadi el .equals()
			    if (j2.equals("tijeras")) {
				    g = 1;
          }
			    //añadie le break 
			  break;
        case "papel":
        	//Para comparar añadi el .equals()
        	if (j2.equals("piedra")) {
        		g = 1;
        	}
        	//añadi el break
        break;
        case "tijera":
        	if (j2.equals("papel")) {
        		g = 1;
        	}
        	//añadi el break
        break;
        default:
        	//Añadi un system.out
        	System.out.println("Jugar de nuevo");
        	//añadi el break
        break;
		  }
      System.out.println("Gana el jugador " + g);
    }
  
	}
	
}