package projetoindividual;

public class Main {

	public static void main(String[] args) {
		ItemMenu prato1 = new Prato("Bife à Parmegiana", 35.50, "Carne de boi");
        ItemMenu bebida1 = new Bebida("Cerveja", 9.90, true);

        prato1.descricao();
        bebida1.descricao();

	}

}
