package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int respuesta;
        boolean dw = true;

        do{
            System.out.println("Bienvenido a Poker!");
            System.out.println("Selecciona una opcion:");
            System.out.println("1 Mezclar deck \n2 Sacar una carta \n3 Carta al azar \n4 Generar una mando de 5 cartas \n0 Salir");
            respuesta = sc.nextInt();

            switch (respuesta){
                case 1:
                    System.out.println("Se mezclo el deck \n");
                    dw = false;
                    break;
                case 2:
                    System.out.println("{Palo},{Color},{Valor}\n" +
                            "Quedan {número de cartas en deck}\n");
                    dw = false;
                    break;
                case 3:
                    System.out.println("{Palo},{Color},{Valor}\n" +
                            "Quedan {número de cartas en deck}\n");
                    dw = false;
                    break;
                case 4:
                    System.out.println("{Palo},{Color},{Valor}\n" +
                            "{Palo},{Color},{Valor}\n" +
                            "{Palo},{Color},{Valor}\n" +
                            "{Palo},{Color},{Valor}\n" +
                            "{Palo},{Color},{Valor}\n" +
                            "Quedan {número de cartas en deck\n");
                    dw = false;
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida, intentelo de nuevo\n");
                    dw = false;
                    break;
            }
        }while (dw = true);
    }
}
