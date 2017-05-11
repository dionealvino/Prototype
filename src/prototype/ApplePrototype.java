package prototype;

public class ApplePrototype extends NotebookPrototype {
    
    protected ApplePrototype (ApplePrototype AppleProto){
        this.valorDaCompra = AppleProto.getValorDaCompra();    
    }
    
    public ApplePrototype() {
        valorDaCompra = 0.0;
    }
    @Override
    public String exibirNotebook(){
        return "Modelo: Macbook 2016 com touchbar - Valor: R$ " + getValorDaCompra();
    }
    
    @Override
    public  NotebookPrototype clonar(){
        return new ApplePrototype(this);
    }
}
