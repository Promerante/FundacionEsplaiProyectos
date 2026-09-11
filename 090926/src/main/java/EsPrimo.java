import java.util.Scanner;
import static java.lang.Math.sqrt;

void main() {
    int inp=0;
    boolean esPrimo=true;
    Scanner sc= new Scanner(System.in);
    System.out.println("Ingrese un numero: ");
    try {
        inp=sc.nextInt();
        if(inp<=0){
            throw new InputMismatchException();
        }
        if(inp==1){
            System.out.println(inp+ " no es un número primo.");
        }else {
            for(int i=2;i<=(int)sqrt(inp);i++){
                if(inp%i==0){
                    esPrimo=false;
                    break;
                }
            }
            if(esPrimo){
                System.out.println(inp+ " es un número primo.");
            }else{
                System.out.println(inp+ " no es un número primo.");
            }
        }
    }catch (InputMismatchException e){
        System.out.println("Introduzca un edad valida(numero natural)");
    }
}