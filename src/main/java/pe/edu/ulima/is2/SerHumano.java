public class SerHumano {
    private String nombre;
    private int edad;
    private String genero;
    private double altura;
    private double peso;
    private String colorOjos;

    public SerHumano() {
    }

    public SerHumano(String nombre, int edad, String genero, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    }

    public SerHumano(String nombre, int edad, String genero, double altura, double peso, String colorOjos) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
        this.colorOjos = colorOjos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setColorOjos(String color) {
        this.colorOjos = color;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    @Override
    public String toString() {
        return "SerHumano{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}
