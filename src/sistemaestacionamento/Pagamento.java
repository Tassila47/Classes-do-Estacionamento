package Pagamento;

public class Pagamento {
    
    private String metodo;
    private String id;
    private Double valor;

    public Pagamento(String metodo, String id, Double valor) {
        this.metodo = metodo;
        this.id = id;
        this.valor = valor;
    }
    
    public void registrar(){
        System.out.println("Pagamento registrado");
    }
    
    public String listar(){
    return "ID:" +id + " \nMétodo:" +metodo + " \nValor:R$" +valor;
    }
    
    public void alterar(String novoMetodo, double novoValor){
        this.metodo = novoMetodo;
        this.valor = novoValor;
        System.out.println("Pagamento alterado");
    }
    
    public void excluir(){
        System.out.println("Pagamento excluído");
    }

    public String pesquisar(String idPesquisa){
        if (this.id.equals(idPesquisa)) {
            return listar();
        } else {
            return "Pagamento não encontrado.";
        }
    }
    
    public void emitirRelatorio(){
       System.out.println("Emitindo relatorio...");
       System.out.println(listar());
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
    
}
