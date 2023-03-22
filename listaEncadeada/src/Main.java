public class Main {
    public static void main(String[] args)  {
        

        ListaEncadeada<String> minhListaEncadeada = new ListaEncadeada<>();

        minhListaEncadeada.add("Teste1");
        minhListaEncadeada.add("Teste2");
        minhListaEncadeada.add("Teste3");
        minhListaEncadeada.add("Teste4");



        System.out.println(minhListaEncadeada.get(0));
        System.out.println(minhListaEncadeada.get(1));

        System.out.println(minhListaEncadeada.remove(2));

        System.out.println(minhListaEncadeada);

    }
}
