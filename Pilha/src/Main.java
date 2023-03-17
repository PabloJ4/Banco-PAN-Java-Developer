public class Main {
    public static void main(String[] args) {
        

        Pilhas minhaPinha = new Pilhas();




        minhaPinha.push(new No(1));
        minhaPinha.push(new No(2));
        minhaPinha.push(new No(3));
        minhaPinha.push(new No(5));
        minhaPinha.push(new No(6));

        

        System.out.println(minhaPinha);

        System.out.println(minhaPinha.pop());


        System.out.println(minhaPinha);



    }
    
}
