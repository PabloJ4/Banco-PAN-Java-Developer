public class Pilhas {
    
    private No refNoEntradaPilha;


    public Pilhas(){

         this.refNoEntradaPilha = null;
    }
    public void  push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setReNo(refAuxiliar);

    }
    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getReNo();
            return noPoped;
        }
        return null;
 
    }
    
    public No top(){
        return refNoEntradaPilha;


    }

    public boolean isEmpty(){
        return refNoEntradaPilha == null ? true : false;
    }
    @Override

    public String toString(){

        String stringretorno = "-------------------\n";
        stringretorno += "       Pilha\n";
        stringretorno += "---------------------\n";


        No noAuxiliar = refNoEntradaPilha;


        while(true){
          if(noAuxiliar != null){
            stringretorno += "[No{dado=" + noAuxiliar.getDado() +"}]\n";
            noAuxiliar = noAuxiliar.getReNo();

          }else{
            break;

          }

        }
    stringretorno += "===========\n";       
    return stringretorno;
        
    }


          
    }

