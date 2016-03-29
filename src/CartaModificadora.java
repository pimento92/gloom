
public class CartaModificadora {
	
	private int puntoAlto;
	private int puntoMedio;
	private int puntoBajo;
	private boolean esMuerte;
	
	
	public CartaModificadora(int puntoAlto, int puntoMedio, int puntoBajo){
		this.puntoAlto=puntoAlto;
		this.puntoMedio=puntoMedio;
		this.puntoBajo=puntoBajo;		
	}
            
        //los getters verifican el caso en el que la carta no posee puntos y no solapa la anterior, el valor de esta carta es uno
    public int getPuntoAlto() {      
        return puntoAlto;
    }

    public int getPuntoMedio() {
        return puntoMedio;
    }

    public int getPuntoBajo() {
        return puntoBajo;
    }

    public boolean isEsMuerte() {
        return esMuerte;
    }
	
    public String toString(){
        StringBuilder toRet= new StringBuilder();

        if(esMuerte=true){
            toRet.append("Cartade muerte prematura\n");
        }
        toRet.append("-Puntos alto=\t");
        toRet.append(getPuntoAlto());
        toRet.append("\n");
        toRet.append("-Puntos medio=\t");
        toRet.append(getPuntoMedio());
        toRet.append("\n");
        toRet.append("-Puntos bajo=\t");
        toRet.append(getPuntoBajo());
        toRet.append("\n");
  
        return toRet.toString();
    }
    

}
