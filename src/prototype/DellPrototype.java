package prototype;

public class DellPrototype extends NotebookPrototype {
    
    protected DellPrototype (DellPrototype SonyPrototype){
        this.valorDaCompra = SonyPrototype.getValorDaCompra();    
    }
    
    public DellPrototype() {
        valorDaCompra = 0.0;
    }
    
    @Override
    public String exibirNotebook(){
        return "Modelo: Dell Inspiron 14z - Valor: R$ " + getValorDaCompra();
    }
    
    @Override
    public NotebookPrototype clonar(){
        return new DellPrototype(this);
    }
}
