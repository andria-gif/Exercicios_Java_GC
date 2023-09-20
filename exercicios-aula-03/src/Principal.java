import java.time.LocalDate;
import java.time.LocalTime;

public class Principal {
    public static void main(String[] args) {
        ///implementação inicial

        ContaBancaria novaConta = new ContaBancaria();
        novaConta.setNome("Kucas");
        novaConta.setCpf("3232323");
        novaConta.setHorarioAtual(LocalTime.of(15,0));
        novaConta.setIdentificadorConta(98);
        novaConta.setEndereco("Padre Reus 54");
        novaConta.setBanco("Agi");
        novaConta.setSaldo(800);
        novaConta.VerificaHorario();
        novaConta.VeferificarSaldo();
        novaConta.VerificaInfos();


//execução outra conta
        ContaBancaria outraConta = new ContaBancaria();
        outraConta.setNome("Relampago");
        outraConta.Deposita(800);
        outraConta.Imprime();
        outraConta.VeferificarSaldo();

    }
}