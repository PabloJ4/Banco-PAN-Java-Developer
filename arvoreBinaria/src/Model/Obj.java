package Model;

public class Obj extends ObjArvore<Obj> {

    Integer meuValor;


    public Obj(Integer meuValor){
        this.meuValor = meuValor;

    }


   

    @Override
    public boolean equals(Object o) {
        
        if (this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return Object.equals(meuValor, obj.meuValor); //esse erro não afeta a execução do codigo
    }
    


    @Override
    public int hashCode() {
      
        return Object.hash(meuValor);  //esse erro não afeta a execução do codigo
    }

    @Override
    public int compareTo(Obj outro) {
        int i = 0;

        if(this.meuValor > outro.meuValor){
            i = 1;
        }else if(this.meuValor < outro.meuValor){
            i = -1;
        }
        
        return i;
    }


    @Override
    public String toString() {
        
        return meuValor.toString();
    }


   
    
    
}
