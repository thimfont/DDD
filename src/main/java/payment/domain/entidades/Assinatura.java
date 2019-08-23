package payment.domain.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assinatura {
    private LocalDate dataDeCriacao;
    private LocalDate dataDeUltimaAtualizacao;
    private LocalDate dataDeExpiracao;
    private boolean estaAtiva;
    private List<Pagamento> pagamentos;

    public Assinatura(LocalDate dataDeExpiracao) {
        this.dataDeCriacao = LocalDate.now();
        this.dataDeUltimaAtualizacao = LocalDate.now();
        this.dataDeExpiracao = dataDeExpiracao;
        this.estaAtiva = true;
        this.pagamentos = new ArrayList<>();
    }

    public LocalDate getDataDeCriacao() {
        return dataDeCriacao;
    }

    public LocalDate getDataDeUltimaAtualizacao() {
        return dataDeUltimaAtualizacao;
    }

    public LocalDate getDataDeExpiracao() {
        return dataDeExpiracao;
    }

    public boolean isEstaAtiva() {
        return estaAtiva;
    }

    public List<Pagamento> getPagamentos() {
        return Collections.unmodifiableList(pagamentos);
    }

    public void adicionaPagamento(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
        this.dataDeUltimaAtualizacao = LocalDate.now();
    }

    public void tornarAtiva(boolean definir) {
        this.estaAtiva = definir;
        this.dataDeUltimaAtualizacao = LocalDate.now();
    }
}
