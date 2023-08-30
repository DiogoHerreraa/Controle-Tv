import java.util.Scanner;

import entitites.Controlador;

public class Controle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Controlador inf = new Controlador(50,false,false);
		int valor;
		
		
		do{
			
			System.out.println("---MENU---");
			System.out.println("1- ligar");
			System.out.println("2- abrir o menu");
			System.out.println("3- aumentar o volume");
			System.out.println("4- abaixar o volume");
			System.out.println("5- ligar o mudo");
			System.out.println("6- desligar o mudo");
			System.out.println("7- play");
			System.out.println("8- pause");
			System.out.println("9- desligar");
			System.out.println("INSIRA UMA OPÇÃO ABAIXO :");
			valor=sc.nextInt();
			
			System.out.println();
			if(valor==1) {
				inf.ligar();
				System.out.println();
			}
			
			else if (valor==2) {
				inf.abrirMenu();
				System.out.println();
			}
			else if(valor==3) {
				inf.maisVolume();
				inf.abrirMenu();
				System.out.println();
			}
			
			else if(valor==4) {
				inf.menosVolume();
				inf.abrirMenu();
				System.out.println();
			}
			else if(valor==5) {
				inf.ligarMudo();
				inf.abrirMenu();
				System.out.println();
			}
			else if(valor==6) {
				inf.desligarMudo();
				System.out.println();
			}
			else if(valor==7) {
				inf.play();
				inf.abrirMenu();
				System.out.println();
			}
			else if(valor==8) {
				inf.pause();
				inf.abrirMenu();
				System.out.println();
			}
			
		}while(valor!=9);
		
		inf.fecharMenu();
		inf.desligar();
	}

}
