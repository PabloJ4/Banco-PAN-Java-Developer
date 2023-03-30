import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args)  {

        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Gol"));
        listaCarros.add(new Carro("Saveiro"));


        System.out.println(listaCarros.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(listaCarros);
        
    }
}
