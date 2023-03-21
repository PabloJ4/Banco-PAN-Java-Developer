public class No <T>{


    private T object;
    public Object getObject() {
        return object;
    }


    public void setObject(T object) {
        this.object = object;
    }


    private No<T> refNo;




    public No getRefNo() {
        return refNo;
    }


    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }


    public No(){
        
    }


    public No(T object){

        this.refNo = null;
        this.object = object;
    }

    @Override
    public String toString(){
        return "No{" +
               "object=" + object +
               '}';
    }
    
}
