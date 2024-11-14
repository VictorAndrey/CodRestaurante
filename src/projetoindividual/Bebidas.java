package projetoindividual;

class Bebida extends ItemMenu {  
    private boolean alcoolica;

    public Bebida(String nome, double preco, boolean alcoolica) {
        super(nome, preco);  
        this.alcoolica = alcoolica;
    }

    @Override
    public void descricao() {
        String tipo = alcoolica ? "Alcoólica" : "Não alcoólica";
        System.out.println("Bebida: " + nome + " | Tipo: " + tipo + " | Preço: R$ " + preco);
    }
}
