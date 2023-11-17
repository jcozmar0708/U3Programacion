package ejercicios.ejercicioPersona;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;
    public final int DEBAJO_PESOIDEAL = -1;
    public final int PESOIDEAL = 0;
    public final int ENCIMA_PESOIDEAL = 1;
    private final int NO_IMC = 2;
    private boolean mayorEdad = false;
    private int numeroDNI;
    private char letraDNI;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo) {
        this(nombre,edad,sexo,0,0);
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
        if (this.peso != 0 && this.altura != 0) {
            double resultadoIMC = peso / Math.pow(altura, 2);
            if (resultadoIMC < 20) {
                return this.DEBAJO_PESOIDEAL;
            } else if (resultadoIMC >= 20 && resultadoIMC <= 25) {
                return this.PESOIDEAL;
            } else {
                return this.ENCIMA_PESOIDEAL;
            }
        } else {
            return this.NO_IMC;
        }
    }

    public boolean isMayorEdad () {
        if (edad >= 18) this.mayorEdad = true;
        return this.mayorEdad;
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

    public String generaDNI () {
        calcularNumeroDNI();
        calcularLetraDNI(this.numeroDNI);
        this.DNI = "" + this.numeroDNI + this.letraDNI;
        return this.DNI;
    }

    private int calcularNumeroDNI () {
        this.numeroDNI = (int) (Math.random()*90000000 + 10000000);
        return this.numeroDNI;
    }

    private char calcularLetraDNI (int numeroDNI) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        letraDNI = letras.charAt(numeroDNI%23);
        return letraDNI;
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
