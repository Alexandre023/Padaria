package padaria;

public class Pedido {
    private Produto produto1;
    private Produto produto2;
    private Produto produto3;
    
    public void Pedidos(){
        System.out.println("Pedido 1 - "+produto1.getNome());
        System.out.println("Quantidade - "+produto1.getQuantidade());
        System.out.println("Valor - "+produto1.getValor());
        
        System.out.println("Pedido 2 - "+produto2.getNome());
        System.out.println("Quantidade - "+produto2.getQuantidade());
        System.out.println("Valor - "+produto2.getValor());
        
        System.out.println("Pedido 3 - "+produto3.getNome());
        System.out.println("Quantidade - "+produto3.getQuantidade());
        System.out.println("Valor - "+produto3.getValor());
    }
    
    public Produto getProduto1() {
        return produto1;
    }

    public void setProduto1(Produto produto1) {
        this.produto1 = produto1;
    }

    public Produto getProduto2() {
        return produto2;
    }

    public void setProduto2(Produto produto2) {
        this.produto2 = produto2;
    }

    public Produto getProduto3() {
        return produto3;
    }

    public void setProduto3(Produto produto3) {
        this.produto3 = produto3;
    }
    
    
}
