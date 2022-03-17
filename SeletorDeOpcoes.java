import java.util.Scanner;
import java.util.InputMismatchException;

public class SeletorDeOpcoes
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        byte userOpt;

        try
        {
            do
            {
                System.out.println("Qual sistema operacional você mais gosta?\n\n[1] Android\t[2] iOS\n[3] Windows\t[4] MacOS\n[5] Sair\n\n> ");
                userOpt = s.nextByte();

                switch(userOpt)
                {
                    case 1:
                        System.out.println("O sistema operacional Android é o mais utilizado no mundo. Por ser gratuito, diversas empresas como Samsung, Motorola e outras adotaram o sistema.");
                        break;
                    case 2:
                        System.out.println("Assim como MacOS, o iOS apresenta ao usuário uma interface magnífica, mesmo sendo ficando para trás no quesito hardware.");
                        break;
                    case 3:
                        System.out.println("Windows é o mais usado no mercado, por isso é mais visado por \"hackers do mal\".");
                        break;
                    case 4:
                        System.out.println("Apesar de seu preço, a usabilidade é incrível.");
                        break;
                    case 5:
                        System.out.println("Programa encerrado.");
                        break;
                    default:
                        System.out.println("Opção não aceita. Selecione uma das dispostas na tela.");
                        break;
                }

            }
            while(userOpt != 5);
        }
        catch(InputMismatchException i)
        {
            System.out.println("Apenas números são aceitos.");
        }
    }
}
