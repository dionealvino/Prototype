package prototype;

public abstract class NotebookPrototype {
    protected double valorDaCompra;
    
    public abstract String exibirNotebook();
    
    public abstract NotebookPrototype clonar();
    
    public double getValorDaCompra() {
        return valorDaCompra;
    }
    
    public void setValorDaCompra(double valorDaCompra){
        this.valorDaCompra = valorDaCompra;
    }
    
}
