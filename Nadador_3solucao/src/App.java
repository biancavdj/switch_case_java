
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        int idade;

        System.out.print("Digite sua idade em anos: ");

        idade = ler.nextInt();

        switch (idade) {

                case 5:
                
                case 6:
             
                case 7:
                
                System.out.println("Competir pela categoria Infantil A");

                break;




                case 8:
                
                case 9:
            
                case 10:
                
                System.out.println("Competir pela categoria Infantil B");

                break;



                
                case 11:
                
                case 12:
            
                case 13:
                
                System.out.println("Competir pela categoria Juvenil A");

                break;



                
                case 14:
                
                case 15:
            
                case 16:
                
                System.out.println("Competir pela categoria Juvenil B");

                break;




            default:


            if(idade >= 18){

                System.out.println("Você competirá na categoria adulto");
            }

            else{
                 System.out.println("Você não pode competir");
            }
                break;


                
        }
    }
}
