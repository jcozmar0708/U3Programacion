package ejercicios.ejercicioPersona;

import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;
    private final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";


    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        if (comprobarSexo(sexo)) {
            this.sexo = sexo;
        } else {
            this.sexo = 'H';
        }
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        if (comprobarSexo(sexo)) {
            this.sexo = sexo;
        } else {
            this.sexo = 'H';
        }
    }

    public int calcularIMC () {
        double imc = this.getPeso() / Math.pow(this.getAltura(),2);
        if (imc < 20) {
            return -1;
        } else if (imc <= 20 && imc >= 25) {
            return 0;
        }
        return 1;
    }

    public boolean isMayorEdad () {
        if (this.getEdad() >= 18) {
            return true;
        }
        return false;
    }

    private boolean comprobarSexo (char sexo) {
        sexo = this.sexo;
        return sexo == 'H' || sexo == 'M';
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public void generaDNI() {
        if (this.getDNI() == null || this.getDNI().length() == 0) {
            Random random = new Random();
            int numero = random.nextInt(90000000) + 10000000;

            int indice = numero % 23;
            char letra = LETRAS.charAt(indice);

            this.DNI = String.valueOf(numero) + letra;
        }
    }


    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDNI() {
        return DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
