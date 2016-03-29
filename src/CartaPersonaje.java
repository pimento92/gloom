
/*clase CartaPersonaje --> contiene la carta de un personaje del juego
private String nombre --> nombre del personaje.
private int puntoAlto --> puntos en zona alta.
private int puntoMedio --> puntos en zona media.
private int puntoBajo --> puntos en zona baja.
private int numCartas --> cantidad de cartas situadas encima del personaje.
private boolean estaMuerto=false --> booleano que almacena si el jugador está muerto.
public CartaModificadora [] cartasAutoestima --> array ue contiene las cartas situadas encima
*/

public class CartaPersonaje {
	
	private static String nombre;
	private int puntoAlto;
	private int puntoMedio;
	private int puntoBajo;
	private int numCartas;
	private static boolean estaMuerto=false;
	
	public CartaModificadora [] cartasAutoestima;
	
	//Builder.
	
	public CartaPersonaje(String nombre, int puntoAlto, int puntoMedio, int puntoBajo, int numCartas, boolean estaMuerto, CartaModificadora [] cartasAutoestima){
		this.nombre=nombre;
		this.puntoAlto=puntoAlto;
		this.puntoMedio=puntoMedio;
		this.puntoBajo=puntoBajo;
		this.numCartas=numCartas;
		this.estaMuerto=estaMuerto;
                this.cartasAutoestima=new CartaModificadora[numCartas];
	}
        //getters

        public static String getNombre() {
            return nombre;
        }

        public int getPuntoAlto() {
            return puntoAlto;
        }

        public int getPuntoMedio() {
            return puntoMedio;
        }

        public int getPuntoBajo() {
            return puntoBajo;
        }

        public int getNumCartas() {
            return numCartas;
        }
        
	public int getAutoestima(){
		return puntoAlto+puntoMedio+puntoBajo;
	}
	public static boolean isEstaMuerto(){
		return estaMuerto;
		}
        //setters
	public void setEstaMuerto(boolean estaMuerto) {
            this.estaMuerto = estaMuerto;
        }
        
        public String toString(){
            StringBuilder toRet= new StringBuilder();
            toRet.append("Nombre:\t");
            toRet.append(getNombre());
            toRet.append("\n");
            toRet.append("Número de cartas:\t");
            toRet.append(getNumCartas());
            toRet.append("\n");
            toRet.append("Puntos parte alta:\t");
            toRet.append(getPuntoAlto());
            toRet.append("\n");
            toRet.append("Puntos parte media:\t");
            toRet.append(getPuntoMedio());
            toRet.append("\n");
            toRet.append("Puntos parte baja:\t");
            toRet.append(getPuntoBajo());
            toRet.append("\n");
            toRet.append("Está muerto?\t");
            toRet.append(isEstaMuerto());
            toRet.append("\n");
            toRet.append("Autoestima:\t");
            toRet.append(getAutoestima());
            toRet.append("\n");
            
            return toRet.toString();
            }
	public void añadirCartaModificadora( CartaModificadora c){
            numCartas++;
            
            if (c.isEsMuerte()==true){
                estaMuerto=true;
            }else{
                int i=0;
                while (cartasAutoestima[i]!=null){
                    i++;
                }
                if (c.getPuntoAlto()!=1){
                    puntoAlto=c.getPuntoAlto();
                }
                if (c.getPuntoMedio()!=1){
                    puntoMedio=c.getPuntoMedio();
                }
                if (c.getPuntoAlto()!=1){
                    puntoBajo=c.getPuntoBajo();
                }
                cartasAutoestima[i]=c;
            }
        }
	
}