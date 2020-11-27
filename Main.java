import java.util.Scanner;

class Main {

  public static void main(String[] args) {

		System.out.println("\033[H\033[J"); // clear screen
		
    Scanner entrada = new Scanner(System.in);
    int opcao = 0;
    int litros = 0;
	  Bomba at = new Bomba();
		 
		System.out.println("Nivel atual do tanque: "+at.atual);
    System.out.println("***Limite máximo do tanque:" +at.maximo);
    System.out.println("***Digite 1 para ligar a bomba**");
	  opcao = entrada.nextInt();
	  
  	  if( opcao == 1 ){
      at.sts = true;
      System.out.println(at.status);
    	System.out.println("***Quantos litros de gasolina deseja colocar?***");
      litros = entrada.nextInt();
        switch (litros){
          case 1:
            at.atual = 1;
            break;
          case 2:
            at.atual = 2;
            break;
          case 3:
            at.atual = 3;
            break;
          case 4:
            at.atual = 4;
            break;
          case 5:
            at.atual = 5;
            break;
          default:
            entrada.close();
          }
	  	} else if(opcao != 1) {
	    	System.out.println("***Digite 1 para ligar a bomba**\n***Digite 0 para sair do programa**");
	  	}
      System.out.println(at.status);
  }
}


