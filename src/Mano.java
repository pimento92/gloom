
import java.util.Scanner;


public class Mano {
	
	private static CartaModificadora [] cartasMano;
	private static final int numCartas=5;
	
	public Mano (CartaModificadora [] cartasMano){
		this.cartasMano=new CartaModificadora[numCartas];
	}
        //introduce una carta en la mano del jugador
	public static void añadirCarta(){
		int i =0;
                
                while(cartasMano[i]!=null){
                    i++;
                }
                cartasMano[i]=Mazo.sacarCarta();
	}
        //muestra la mano y escoge una carta
	public static CartaModificadora escogerCarta(Mano m){
            Scanner scan=new Scanner(System.in);
            
            System.out.println("¿Qué carta desea sacar?");
            for (int i=0;i<cartasMano.length;i++){
                System.out.println(i+"."+cartasMano[i].toString()+"\n");
                }
            int op=Integer.parseInt(scan.nextLine());
            CartaModificadora c=cartasMano[op];
            cartasMano[op]=null;
            return c;
	}
        //coloca la carta escogida en sacarCArta() y se la coloca a un personaje
        public static void colocarCarta(CartaModificadora c){
            Scanner scan=new Scanner(System.in);
            
            System.out.println("¿A qué personaje deseas colocarle la carta?");
            for (int i=0;i<Juego.numJug;i++){
                System.out.println("Jugador "+(i+1)+":\t"+CartaPersonaje.getNombre()+"\n");
            }
            int op=(Integer.parseInt(scan.nextLine()))-1;
            
        }
	public int getNumCartas(){
		return numCartas;
	}
	public String toString(){
		return "holA";
	}

}
