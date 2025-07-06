
package sistemaestacionamento;

public class Funcionario extends Usuario {
    private String codigo;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, String cpf, String telefone, String email, String senha, String codigo) {
        super(nome, cpf, telefone, email, senha);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // Você pode sobrescrever métodos herdados aqui se desejar implementar algo específico
    @Override
    public void cadastrar() {
        // Implementação específica, se necessário
        System.out.println("Funcionário cadastrado com sucesso.");
    }

    @Override
    public Funcionario listar() {
        return this;
    }

    @Override
    public void excluir() {
        System.out.println("Funcionário excluído.");
    }

    @Override
    public Funcionario pesquisar() {
        return this;
    }

    @Override
    public void alterar() {
        System.out.println("Dados do funcionário alterados.");
    }
}
