
public class Jugador {
	
	public static String nombre;
	public static Mano CartaModificadora;
	Familia CartaPersonaje;
	
	public Jugador (String nombre, Mano CartaModificadora, Familia CartaPersonaje){
		this.nombre=nombre;
		this.CartaModificadora=CartaModificadora;
		this.CartaPersonaje=CartaPersonaje;
	}

    public static String getNombre() {
        return nombre;
    }

    public Mano getCartaModificadora() {
        return CartaModificadora;
    }

    public Familia getCartaPersonaje() {
        return CartaPersonaje;
    }
	
        
	public static void juegaCarta(Mano CartaModificadora){
            Mano.escogerCarta(CartaModificadora);
	}
	
	public void colocarCarta(Mano CartaModificadora){
            Mano.colocarCarta(Mano.escogerCarta(CartaModificadora));
	}
	
	public static void cogerCarta(){
            Mano.añadirCarta();
	}

}
