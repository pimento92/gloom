import java.util.Random;
//para el método baraja


public class Mazo {
	private static CartaModificadora [] cartaMazo;
	private int numCartas;
	private static int cartaActual;
        private Random azar=new Random();
        
	
	public Mazo(CartaModificadora [] cartaMazo, int numCartas){
		this.cartaMazo=cartaMazo;
		this.numCartas=numCartas;
	}
	
	public int getNumCartas(){
		return numCartas;
	}
	public void baraja(){
 
            for ( int i = 0; i < cartaMazo.length; i++ ){ 
                int j = azar.nextInt(numCartas);
 
                CartaModificadora temp = cartaMazo[i];

                cartaMazo[i] = cartaMazo[j];
                cartaMazo[j] = temp;
 
            } 
        }   

	public static CartaModificadora sacarCarta(){
            cartaActual = 0;
            if (cartaActual < cartaMazo.length )
                return cartaMazo[cartaActual++];
            else return null;	
	}

}
