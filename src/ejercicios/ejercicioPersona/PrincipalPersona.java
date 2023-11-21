package ejercicios.ejercicioPersona;

import java.util.Scanner;

public class PrincipalPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el nombre:");
        String nombre = sc.nextLine();

        System.out.println("Escribe la edad:");
        int edad = sc.nextInt();

        System.out.println("Escribe el sexo(H/M):");
        char sexo = sc.next().toUpperCase().charAt(0);

        System.out.println("Escribe el peso(kg):");
        double peso = sc.nextDouble();

        System.out.println("Escribe la altura(m):");
        double altura = sc.nextDouble();

        Persona p1 = new Persona(nombre,edad,sexo,peso,altura);
        Persona p2 = new Persona("Luis García",17,'H');
        Persona p3 = new Persona();
        p3.setNombre("Antonio Molina");
        p3.setEdad(55);
        p3.setSexo('H');
        p3.setAltura(1.8);
        p3.setPeso(135);

        p1.generaDNI();
        p2.generaDNI();
        p3.generaDNI();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        comprobarIMC(p1);
        comprobarIMC(p2);
        comprobarIMC(p3);
    }
    private static void comprobarIMC(Persona persona) {
        if (persona.calcularIMC() == 0) {
            System.out.println(persona.getNombre() + " está es su peso ideal");
        } else if (persona.calcularIMC() == -1) {
            System.out.println(persona.getNombre() + " está por debajo de su peso ideal");
        } else if (persona.calcularIMC() == 1) {
            System.out.println(persona.getNombre() + " está por encima de su peso ideal");
        }
    }
}
