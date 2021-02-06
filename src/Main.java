/* Creamos una clase Animal
 *  */
class Animal{

    // Estado (Atributos y su valor)
    String nombre;
    int piernas;
    String sonido;
    String comida;

    // Comportamiento
    void emitirSonido(){
        System.out.println("El sonido de " + nombre + " es: " + sonido);
    }
}

public class Main {

    public static void main(String args []){

        /* Creamos un objeto/instancia
        de tipo Animal llamado oveja */
        Animal oveja = new Animal();

        // Le asignamos un Estado a las instancias
        // Esto quiere decir que le asignamos valor a las propiedades
        // del objeto oveja.
        oveja.nombre =  "Oveja";
        oveja.piernas = 4;
        oveja.sonido = "Balar";
        oveja.comida = "Pasto";

        // Y disparamos una acción.
        oveja.emitirSonido();

        // Ahora instanciamos un objeto llamado perro, cambiamos el Estado y
        // llamamos al método emitirSonido();
        Animal perro = new Animal();
        perro.nombre =  "Perro";
        perro.piernas = 4;
        perro.sonido = "Ladrar";
        perro.comida = "Carne";
        perro.emitirSonido();

        // Finalmente creamos un objeto de la clase Animal llamado pato.
        // Que manda a llamar a la función emitirSonido()
        // y que asigna valores a las variables (nombre, piernas, sonido y comida).
        Animal pato = new Animal();
        pato.nombre =  "Pato";
        pato.piernas = 2;
        pato.sonido = "Parpar";
        pato.comida = "Semillas";
        pato.emitirSonido();
    }
}