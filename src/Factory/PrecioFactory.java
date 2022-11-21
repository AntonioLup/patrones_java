package Factory;

public class PrecioFactory {
     Precio precio;

    private PrecioFactory() {};
    public PrecioFactory(String pais){
       // pais == España ->

        if(pais.equalsIgnoreCase("España")){
            System.out.println("precio en españa");
            precio = new PrecioEURO();
        }else{
            System.out.println("otro pais");
            precio = new PrecioUSD();

        }
    }
    public double getPrecio(){
        return precio.getPrecio();
    }
}
