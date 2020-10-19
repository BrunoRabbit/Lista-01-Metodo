//Bruno Coelho Alves
import java.util.Scanner;
public class EX02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double num;

        System.out.print("Insira o valor: ");
        num = leia.nextDouble();

        boolean retorno = isZero(num);

        if( retorno == true){
            System.out.println("Valor Zero");
        }else{
            System.out.println("Valor diferente de Zero");
        }
        leia.close();
    }
    
    static boolean isZero(double num){
        return num == 0;
        }
}
