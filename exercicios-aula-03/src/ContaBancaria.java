

import com.sun.source.tree.SwitchTree;
import java.time.LocalTime;
import java.util.Scanner;
public class ContaBancaria {
    private String nome;
    private String cpf;
    private int identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;
    private LocalTime horarioAtual;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdentificadorConta() {
        return identificadorConta;
    }

    public void setIdentificadorConta(int identificadorConta) {
        this.identificadorConta = identificadorConta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalTime getHorarioAtual() {
        return horarioAtual;
    }

    public void setHorarioAtual(LocalTime horarioAtual) {
        this.horarioAtual = horarioAtual;
    }

    public ContaBancaria(String nome, String cpf, int identificadorConta, String banco, String endereco, double saldo, LocalTime hour) {
        this.nome = nome;
        this.cpf = cpf;
        this.identificadorConta = identificadorConta;
        this.banco = banco;
        this.endereco = endereco;
        this.saldo = saldo;
        this.horarioAtual = hour;

    }

    public ContaBancaria() {

    }

    ////criando metodos


    public void Deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void Saque(double valor) {
        this.saldo = this.saldo - valor;
    }

    public void Pix(double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente");
        }
        if (this.horarioAtual.getHour() >= 19 || this.horarioAtual.getHour() < 8) {
            System.out.println("Estamos fora do horário de funcionamneto!! Retorne entre 8hrs às 19hrs");
        }

    }

    public void Transferencia(ContaBancaria destino, double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente.");
        } else {
            double valorAtual = destino.getSaldo();
            valorAtual = valorAtual + valor;
            destino.setSaldo(valorAtual);
            this.saldo = this.saldo - valor;
        }
    }

    public void VerificaHorario() {
        System.out.println("O horarário atual é: " + this.horarioAtual.getHour() + "h");
    }

    public void VeferificarSaldo() {
        System.out.println("O seu saldo atual é de: " + saldo);
    }

    public void VerificaInfos() {
        System.out.println("O nome do titular é: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Conta: " + this.identificadorConta);
        System.out.println("Banco: " + this.banco);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Horário: " + this.horarioAtual);
    }


    public void Imprime() {
        System.out.println(this.saldo);
    }


}

