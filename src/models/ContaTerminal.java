package models;

public class ContaTerminal {
    public int Numero;
    public String Agencia;
    public String NomeCliente;
    public float Saldo;

    public ContaTerminal(int numero, String agencia, String nomeCliente, float saldo) {
        this.Numero = numero;
        this.Agencia = agencia;
        this.NomeCliente = nomeCliente;
        this.Saldo = saldo;

        PrintMensagemDeBoasVindas();
    }

    public void PrintMensagemDeBoasVindas() {
        System.out.println("Olá " + this.NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.Agencia + ", conta " + this.Numero + " e seu saldo de R$ " + String.format("%.2f", this.Saldo) + " já está disponível para saque.");
    }
}
