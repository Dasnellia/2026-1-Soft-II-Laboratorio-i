package pe.edu.ulima.is2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola IS2");

        SerHumano serHumano1 = new SerHumano("Juan", 30, "Masculino", 1.75, 70);
        serHumano1.setColorOjos("Marrones");
        System.out.println("Nombre: " + serHumano1.getNombre());
        System.out.println("Edad: " + serHumano1.getEdad());
        System.out.println("Género: " + serHumano1.getGenero());
        System.out.println("Altura: " + serHumano1.getAltura());
        System.out.println("Peso: " + serHumano1.getPeso());
        System.out.println("Color de ojos: " + serHumano1.getColorOjos());

        SerHumano[] personas = new SerHumano[3];
        personas[0] = new SerHumano("Ana", 25, "Femenino", 1.65, 60, "Azules");
        personas[1] = new SerHumano("Carlos", 40, "Masculino", 1.80, 80, "Verdes");
        personas[2] = new SerHumano("María", 35, "Femenino", 1.70, 65, "Negros");
        for (SerHumano persona : personas) {
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
            System.out.println("Género: " + persona.getGenero());
            System.out.println("Altura: " + persona.getAltura());
            System.out.println("Peso: " + persona.getPeso());
            System.out.println("Color de ojos: " + persona.getColorOjos());
            System.out.println();
        }

        int numeros[] = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = null;
        personas[0] = null;// Esto es válido porque personas es un arreglo de objetos, mientras que numeros es un arreglo de tipos primitivos.

        for (SerHumano in personas) {
            if (i != null) {
                System.out.println("Nombre: " + i.getNombre());
            } else {
                System.out.println("Persona es null");
            }
        }
    }
}