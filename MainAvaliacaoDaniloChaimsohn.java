import java.util.InputMismatchException;
import java.util.Scanner;

public class MainAvaliacaoDaniloChaimsohn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Olá, digite quantas temperaturas você deseja converter: ");
        int tempQuant = input.nextInt();
        // celsius 0 | fah 1 | kelvin 2

        System.out.println("Digite qual a unidade de medida das temperaturas a serem convertidas?");
        System.out.print(" 0 para Celsius \t");
        System.out.print(" 1 para Fahrenheit \t");
        System.out.print(" 2 para Kelvin \n");
        Integer tempBase = input.nextInt();

        System.out.println("Digite qual a unidade de medida das temperaturas finais convertidas?");
        System.out.print(" 0 para Celsius \t");
        System.out.print(" 1 para Fahrenheit \t");
        System.out.print(" 2 para Kelvin \n");
        Integer tempFinal = input.nextInt();

        double temperature = 0.0;
        double conversion = 0.0;
        double finalMed = 0.0;
        double initMed = 0.0;
        double contador = 0;

        String t = "a";
        String x = "a";


        for (int i = 0; i < tempQuant; i++) {
            System.out.printf("Digite a temperatura %s: ", i + 1);
                try{
                    temperature = input.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("Temperatura informada inválida, por favor reinicie o programa!!");
                    break;
                }


            if (tempBase == 0 && tempFinal == 1){
                conversion = (temperature*(9.0/5.0)) + 32;
                System.out.printf(" %s Celsius = %s Fahrenheit \n",temperature, conversion);
            } else if (tempBase == 0 && tempFinal == 2) {
                conversion = (temperature + 273.15);
                System.out.printf(" %s Celsius = %s Kelvin \n",temperature, conversion);
            } else if (tempBase == 1 && tempFinal == 0 ) {
                conversion = (temperature - 32.0) * (5.0/9.0);
                System.out.printf(" %s Fahrenheit = %s Celsius \n",temperature, conversion);
            } else if (tempBase == 1 && tempFinal == 2) {
                conversion = ((temperature - 32.0)*(5.0/9.0)) + 273.15;
                System.out.printf(" %s Fahrenheit = %s Kelvin \n",temperature, conversion);
            } else if (tempBase == 2 && tempFinal == 0) {
                conversion = temperature - 273.15;
                System.out.printf(" %s Kelvin = %s Celsius \n",temperature, conversion);
            } else if (tempBase == 2 && tempFinal == 1) {
                conversion = ((temperature - 273.15) * (9.0/5.0)) + 32.0;
                System.out.printf(" %s Kelvin = %s Fahrenheit \n",temperature, conversion);
            } else {
                System.out.println("Unidade de medida informada inválida. Por favor reinicie o programa.");
                break;
            }
            initMed += temperature;
            finalMed += conversion;
            contador++;
        }
        System.out.println("A média das temperaturas iniciais foi de: " + initMed/contador);
        System.out.println("A média das temperaturas convertidas foi de: " + finalMed/contador);

    }


}

