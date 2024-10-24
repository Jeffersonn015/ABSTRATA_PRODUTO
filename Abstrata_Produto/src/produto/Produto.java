package produto;

// SuperClasse Produto
public class Produto {
    private String nome;
    private double precoCusto;
    private double precoVenda;

    // Construtor
    public Produto(String nome, double precoCusto, double precoVenda) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    // Método para calcular lucro
    public double calcularLucro() {
        return precoVenda - precoCusto;
    }

    // Método para salvar o produto no "banco de dados"
    public void salvar() {
        String sql = "INSERT INTO produtos (nome, precoCusto, precoVenda) VALUES ('" 
                      + nome + "', " + precoCusto + ", " + precoVenda + ");";
        System.out.println("Comando SQL para salvar: " + sql);
    }

    // Método para atualizar o produto no "banco de dados"
    public void atualizar(int id) {
        String sql = "UPDATE produtos SET nome = '" + nome + "', precoCusto = " 
                      + precoCusto + ", precoVenda = " + precoVenda + " WHERE id = " + id + ";";
        System.out.println("Comando SQL para atualizar: " + sql);
    }

    // Método para deletar o produto no "banco de dados"
    public void deletar(int id) {
        String sql = "DELETE FROM produtos WHERE id = " + id + ";";
        System.out.println("Comando SQL para deletar: " + sql);
    }

    // Método para mostrar informações do produto
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço de Custo: R$" + precoCusto);
        System.out.println("Preço de Venda: R$" + precoVenda);
        System.out.println("Lucro: R$" + calcularLucro());
    }

    // Getter para o nome (para uso em classes derivadas)
    public String getNome() {
        return nome;
    }
}

// SubClasse ProdutoAlimenticio que herda de Produto
class ProdutoAlimenticio extends Produto {
    private String dataValidade;
    private String informacoesNutricionais;

    // Construtor
    public ProdutoAlimenticio(String nome, double precoCusto, double precoVenda, String dataValidade, String informacoesNutricionais) {
        super(nome, precoCusto, precoVenda);
        this.dataValidade = dataValidade;
        this.informacoesNutricionais = informacoesNutricionais;
    }

    // Método para salvar o produto alimentício no "banco de dados"
    @Override
    public void salvar() {
        super.salvar(); // Salva os dados da classe pai
        String sql = "INSERT INTO produtos_alimenticios (nome, dataValidade, informacoesNutricionais) VALUES ('" 
                      + getNome() + "', '" + dataValidade + "', '" + informacoesNutricionais + "');";
        System.out.println("Comando SQL para salvar produto alimentício: " + sql);
    }

    // Método para mostrar informações do produto alimentício
    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes(); // Mostra as informações do produto pai
        System.out.println("Data de Validade: " + dataValidade);
        System.out.println("Informações Nutricionais: " + informacoesNutricionais);
    }
}

// Classe ProdutoVestuario que herda de Produto
class ProdutoVestuario extends Produto {
    private String tamanho;
    private String cor;
    private String material;

    // Construtor
    public ProdutoVestuario(String nome, double precoCusto, double precoVenda, String tamanho, String cor, String material) {
        super(nome, precoCusto, precoVenda);
        this.tamanho = tamanho;
        this.cor = cor;
        this.material = material;
    }

    // Método para salvar o produto de vestuário no "banco de dados"
    @Override
    public void salvar() {
        super.salvar(); // Salva os dados da classe pai
        String sql = "INSERT INTO produtos_vestuarios (nome, tamanho, cor, material) VALUES ('" 
                      + getNome() + "', '" + tamanho + "', '" + cor + "', '" + material + "');";
        System.out.println("Comando SQL para salvar produto de vestuário: " + sql);
    }

    // Método para mostrar informações do produto de vestuário
    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes(); // Mostra as informações do produto pai
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Cor: " + cor);
        System.out.println("Material: " + material);
    }
}
