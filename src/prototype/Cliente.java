package prototype;

public class Cliente {

    public static void main(String[] args) {
        DellPrototype DellProto = new DellPrototype();
        
        NotebookPrototype notebookNovo = DellProto.clonar();
        notebookNovo.setValorDaCompra(3800);
        NotebookPrototype notebookUsado = DellProto.clonar();
        notebookUsado.setValorDaCompra(2800);
        
        System.out.println("Novo: " + notebookNovo.exibirNotebook());
        System.out.println("Usado: " + notebookUsado.exibirNotebook());
        
        
        ApplePrototype iProto = new ApplePrototype();
        
        notebookNovo = iProto.clonar();
        notebookNovo.setValorDaCompra(4999);
        notebookUsado = iProto.clonar();
        notebookUsado.setValorDaCompra(3999);       
        
        System.out.println("Novo: " + notebookNovo.exibirNotebook());
        System.out.println("Usado: " + notebookUsado.exibirNotebook());
    }
    
}
