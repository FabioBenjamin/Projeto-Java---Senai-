import java.util.Scanner;

public class Senha_Secreta {
	public static void main(String[] args) {
        Scanner senha = new Scanner(System.in);

        String senhaUsuario = "";
        String senhaGuard = "1234";
        int tentativas = 1;
        
        System.out.println("Digite sua senha: ");
        senhaUsuario = senha.next();
        
        while(!senhaGuard.equals(senhaUsuario)) {
        		System.out.println("Senha incorreta. Acesso negado");
        		senhaUsuario = senha.next();
                        tentativas++; // Armazena as tentativas de senha 

                        if (tentativas > 3){
                                System.out.println("Excesso de tentivas, finalização do programa.");
                                break;
                }
        		
        		if(senhaGuard.equals(senhaUsuario)) {
        			System.out.println("Senha correta. Acesso permitido");
        			break;
        		}
        		
        }

        senha.close();
        
        }
	
}
