public class No {

    private int dado;
    public int getDado() {
        return dado;
    }


    public void setDado(int dado) {
        this.dado = dado;
    }


    private No reNo = null;
    
    
    public No getReNo() {
        return reNo;
    }


    public void setReNo(No reNo) {
        this.reNo = reNo;
    }


    public No(int dado) {
        this.dado = dado;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "No{" + 
            "dados=" + dado +
            "}";
    }
    
    
}
