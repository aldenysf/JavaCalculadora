package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        //declarando variables
        int operacion = 0;
        double numero1, numero2, resultado = 0;
        Scanner lector = new Scanner(System.in);

         //pregunta por primer numero
        System.out.println("favor ingresar primer número");
        numero1 = lector.nextDouble();

        //pregunta por operacion
        do {
            System.out.println("favor ingresar la operacion a realizar: \n1. suma \n2. resta \n3. multiplicación  \n4. división");
            operacion = lector.nextInt();
        } while (operacion < 1 || operacion > 4);

        //pregunta por segundo numero
        System.out.println("favor ingresar segundo número");
        numero2 = lector.nextDouble();

        //creando objetos
        Suma objetoSuma = new Suma();
        Resta objetoResta = new Resta();
        Multi objetoMulti = new Multi();
        Division objetoDivision = new Division();

        //seleccion de operacion
        switch (operacion) {
            case 1:
                //llamar a el metodo suma
                resultado = objetoSuma.sumar(numero1, numero2);
                break;
            case 2:
                //llamar a el metodo resta
                resultado = objetoResta.restar(numero1, numero2);
                break;
            case 3:
                //llamar a el metodo multiplicacion
                resultado = objetoMulti.multiplicar(numero1, numero2);
                break;
            case 4:
                //validacion de numero 2  y llamar a el metodo division
                while (numero2 == 0) {

                    System.out.println("favor ingresar nuevamente el segundo numero ya que la division por 0 no existe");
                    numero2 = lector.nextDouble();
                }
                resultado = objetoDivision.dividir(numero1, numero2);
                break;
        }
        //mostrar resultado
        System.out.println("el resultado es: " + resultado);
    }

}
