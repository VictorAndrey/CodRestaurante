package projetoindividual;

abstract class ItemMenu {
    protected String nome;
    protected double preco;

    public ItemMenu(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    
    public abstract void descricao();

    
    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}

