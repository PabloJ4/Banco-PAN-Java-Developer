public class No {


    private Object object;
    private No refNo;




    public No getRefNo() {
        return refNo;
    }


    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }


    public No(){
        
    }


    public No(Object object){

        this.refNo = null;
        this.object = object;
    }
    
}
