// Clase base: Personaje
class Personaje {
    protected String nombre;
    protected int vida;
    protected int ataque;

    public Personaje(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    public void atacar(Personaje objetivo) {
        System.out.println(this.nombre + " ataca a " + objetivo.nombre + " por " + this.ataque + " puntos de daño.");
        objetivo.recibirDano(this.ataque);
    }

    public void recibirDano(int dano) {
        this.vida -= dano;
        if (this.vida < 0) this.vida = 0;
        System.out.println(this.nombre + " tiene " + this.vida + " puntos de vida restantes.");
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }
}

// Clase Jugador (hereda implícitamente de Personaje)
class Jugador extends Personaje {
    public Jugador(String nombre) {
        super(nombre, 100, 20); // Vida inicial: 100, Ataque: 20
    }
}

// Clase Enemigo
class Enemigo extends Personaje {
    public Enemigo(String nombre) {
        super(nombre, 80, 15); // Vida inicial: 80, Ataque: 15
    }
}

// Clase principal del juego
public class JuegoPOO {
    public static void main(String[] args) {
        Jugador jugador = new Jugador("Héroe");
        Enemigo enemigo = new Enemigo("Goblin");

        System.out.println("¡Comienza el combate!\n");

        // Combate por turnos (simplificado)
        while (jugador.estaVivo() && enemigo.estaVivo()) {
            jugador.atacar(enemigo);
            if (!enemigo.estaVivo()) break;

            enemigo.atacar(jugador);
            System.out.println(); // Línea en blanco para separar turnos
        }

        // Resultado final
        if (jugador.estaVivo()) {
            System.out.println("🎉 ¡" + jugador.getNombre() + " ha vencido al " + enemigo.getNombre() + "!");
        } else {
            System.out.println("💀 " + jugador.getNombre() + " ha sido derrotado...");
        }
    }
}