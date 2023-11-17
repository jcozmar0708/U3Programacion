package ejercicios.ejercicioPersona;

import java.util.Scanner;

public class PrincipalPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el nombre, edad, sexo, peso y altura");
        String nombre = sc.nextLine();
        int edad = sc.nextInt();
        char sexo = sc.next().toUpperCase().charAt(0);
        double peso = sc.nextDouble();
        double altura = sc.nextDouble();

        Persona persona1 = new Persona(nombre,edad,sexo,peso,altura);
        Persona persona2 = new Persona("Nerea Moreno Ferrer",18,'M');
        Persona persona3 = new Persona();

        persona3.setNombre("Inmaculada Cózar Martínez");
        persona3.setEdad(16);
        persona3.setSexo('M');
        persona3.setPeso(50);
        persona3.setAltura(1.67);

        System.out.println(persona1.getNombre() + (persona1.calcularIMC() == persona1.DEBAJO_PESOIDEAL ? " está por debajo de su peso ideal" :
                    persona1.calcularIMC() == persona1.PESOIDEAL ? " está en su peso ideal" :
                            persona1.calcularIMC() == persona1.ENCIMA_PESOIDEAL ? " está por encima de su peso ideal" : " no se puede calcular el IMC"));
        System.out.println(persona2.getNombre() + (persona2.calcularIMC() == persona2.DEBAJO_PESOIDEAL ? " está por debajo de su peso ideal" :
                persona2.calcularIMC() == persona2.PESOIDEAL ? " está en su peso ideal" :
                        persona2.calcularIMC() == persona2.ENCIMA_PESOIDEAL ? " está por encima de su peso ideal" : " no se puede calcular el IMC"));
        System.out.println(persona3.getNombre() + (persona3.calcularIMC() == persona3.DEBAJO_PESOIDEAL ? " está por debajo de su peso ideal" :
                persona3.calcularIMC() == persona3.PESOIDEAL ? " está en su peso ideal" :
                        persona3.calcularIMC() == persona3.ENCIMA_PESOIDEAL ? " está por encima de su peso ideal" : " no se puede calcular el IMC"));

        System.out.println(persona1.getNombre() + (persona1.isMayorEdad() ? " es mayor de edad" : " es menor de edad"));
        System.out.println(persona2.getNombre() + (persona2.isMayorEdad() ? " es mayor de edad" : " es menor de edad"));
        System.out.println(persona3.getNombre() + (persona3.isMayorEdad() ? " es mayor de edad" : " es menor de edad"));

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);

        persona1.generaDNI();
        persona2.generaDNI();
        persona3.generaDNI();

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
    }
}
