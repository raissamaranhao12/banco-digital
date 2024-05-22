public class Main {

    public static void main(String[] args) {
        Banco bancoInicial = new Banco(); 

        bancoInicial.setNome("First Bank"); 

        Cliente pedro = new Cliente("Pedro", bancoInicial);  
        pedro.setNome("Pedro Silva Costa"); 

        Conta ccorrente = new ContaCorrente(pedro); 

        ccorrente.depositar(100); 

        Cliente alan = new Cliente("Alan", bancoInicial); 
        IConta cpoupanca = new ContaPoupanca(alan); 


        ccorrente.imprimirExtrato();  
        cpoupanca.imprimirExtrato();  

        ccorrente.transferir(48, cpoupanca);  

        ccorrente.imprimirExtrato(); 
        cpoupanca.imprimirExtrato();
        bancoInicial.mostrarClientes(); 

        Cliente rafael = new Cliente("Rafael", bancoInicial);  
        Conta ccorrente2 = new ContaCorrente(rafael);
        ccorrente2.imprimirExtrato();  
        bancoInicial.mostrarClientes(); 
    }

}