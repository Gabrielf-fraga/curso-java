package fraga.com;

public class Teste_condicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 17;
		int pessoas = 2;
		
		if(idade >= 18) {
			System.out.println("tem mais de 18 anos");
			System.out.println("seja bem vindo");
		}else {
			if(pessoas>= 2) {
				System.out.println("vc tem menos de 18 anos, pode entrar , pois esta acompanhado");
			}else {
				System.out.println("não pode entrar");
			}
		}
	}
}
