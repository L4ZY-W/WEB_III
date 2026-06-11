import java.util.Scanner;

public class Aula2{
	public static void main(String args[]){
		System.out.println("Seja BEM macho!");
		
		Scanner ler = new Scanner(System.in);
		
		try{

			System.out.println("Nome do aluno:");
			String nome = ler.nextLine();
		
			System.out.println("Digite a N1:");
			float n1 = ler.nextFloat();

			System.out.println("Digite a N2:");
			float n2 = ler.nextFloat();

			float media = (n1 + n2) / 2;
			
			if( media >= 120) {
			
			System.out.println("Passou com média: " + media);
			
			} else {
				System.out.println("Média: " + media);
				System.out.println("Ficou em recuperação!");
				System.out.println("\nDigite a nota da substituição:");
		
				float sub = ler.nextFloat();

				if( n1 < n2) {
					media = (sub + n2) /2;
				}else{
					media = (n1 + sub) /2;
				}
			
				if( media >= 120){
					System.out.println("Passou com substituição!");
				}else{
					System.out.println("Poha nem com substituição é capaz de passar...");
				}


			}


		} catch(Exception erro){
			System.out.print("### ENTRADA INVÁLIDA");
			System.out.println(" - use , ao invés de . ###");
		}
		


	}


}