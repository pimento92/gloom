public class Familia {
	
	private CartaPersonaje [] cartasFamilia;
	private String nombre;
	
	public Familia(CartaPersonaje [] cartasFamilia, String nombre){

		this.cartasFamilia=cartasFamilia;
		this.nombre=nombre;
		
	}
	
        public String getNombre(){
            return nombre;
        }
	public int getAutoestima(){
            int autoestima=0;
            for (int i=0;i<cartasFamilia.length;i++){
                autoestima+=cartasFamilia[i].getAutoestima();
            }
		return autoestima;
	}
        
	public void estaMuerta(){
            int i=0;
            int muertos=0;
            int vivos=0;
            while(i<cartasFamilia.length){
                if (CartaPersonaje.isEstaMuerto()==true){
                    muertos++;
                }else{
                    vivos++;
                }
                
                if (muertos==cartasFamilia.length){
                    System.out.println("Todos los personajes de la Familia "+getNombre()+" están muertos");
                }else{
                    System.out.println("La Familia "+getNombre()+" tiene "+muertos+" personajes muertos y "+vivos+" personajes vivos.");
                }
            }
	}

}
