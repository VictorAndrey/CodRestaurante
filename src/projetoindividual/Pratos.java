package projetoindividual;

class Prato extends ItemMenu {
    private String tipoDeCarne;

    public Prato(String nome, double preco, String tipoDeCarne) {
        super(nome, preco);  
        this.tipoDeCarne = tipoDeCarne;
    }


    @Override
    public void descricao() {
        System.out.println("Prato: " + nome + " | Tipo de carne: " + tipoDeCarne + " | Preço: R$ " + preco);
    }
}
