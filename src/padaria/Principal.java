package padaria;

public class Principal {

    public static void main(String[] args) {
        Doces doce1 = new Doces();
        doce1.setNome("Bolo de Chocolate");
        doce1.setValor(2.50);
        doce1.setQuantidade(1);
        
        Frios frios1= new Frios();
        frios1.setNome("Mussarela");
        frios1.setValor(4.00);
        frios1.setQuantidade(1);
        
        Paozinho paozinho1 = new Paozinho();
        paozinho1.setNome("Pão Frances");
        paozinho1.setValor(3.50);
        paozinho1.setQuantidade(10);
        
        Pedido pedido = new Pedido();
        pedido.setProduto1(doce1);
        pedido.setProduto2(frios1);
        pedido.setProduto3(paozinho1);
        
        pedido.Pedidos();
    }
    
}
