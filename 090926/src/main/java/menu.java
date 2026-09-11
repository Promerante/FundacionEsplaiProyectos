import  java.util.Scanner;

public static boolean esPar(int num1){
    return num1%2==0;
}



public  static  void clasificacionEdad(int edad){
    String clasificacion= "";
        if (edad < 0) {
            throw new InputMismatchException("Introduzca una edad valida(numero entero mayor que 0)");
        }else if (edad < 13) {
            clasificacion = "Niño";
        } else if (edad <= 17) {
            clasificacion = "Adolescente";
        } else if (edad <= 65) {
            clasificacion = "Adulto";
        } else {
            clasificacion = "Adulto Mayor";
        }
        System.out.println("Clasificación: " + clasificacion);
}


public static void temperaturas (int temperatura){
    System.out.println("Temperatura en celsius: " + temperatura +
            "\nTemperatura en Fahrenheit: " + ((temperatura*9/5)+32));
}


void main() {
    boolean terminado=false;
    Scanner sc=new Scanner(System.in);
    String opcion="";
while (!terminado){

        System.out.println(
                "Ingrese una opcion:" +
                "\na.Es par" +
                "\nb.Sumar" +
                "\nc.Clasificacion edad" +
                "\nd.Temperatura en Cº y ºF" +
                "\ne.Salir");
        try{
            opcion=sc.next();
            if (opcion.equals("a")) {
                System.out.println("Ingrese ahora un numero: ");
                if(esPar(sc.nextInt())){
                    System.out.println("El numero introducido es par");
                }else {
                    System.out.println("El numero introducido no es par");
                }
            } else if (opcion.equals("b")) {
                System.out.println("Ingrese el numero 1");
                int num1=sc.nextInt();
                System.out.println("Ingrese el numero 2");
                int num2=sc.nextInt();
                System.out.println("La suma es: " + (num1+num2));
            } else if (opcion.equals("c")) {
                System.out.println("Ingrese su edad");
                clasificacionEdad(sc.nextInt());
            }else if (opcion.equals("d")) {
                System.out.println("Ingrese su temperatura");
                temperaturas(sc.nextInt());
            }else if (opcion.equals("e")){
                terminado=true;
            }else {
                throw new Exception("Debe ser una opcion valida(en minuscula)");
            }
        }catch (Exception e){
            System.out.println("Error! : "+ e.getMessage());
        }finally {

        }
    };
    sc.close();
}