package payment.domain.entidades;

import payment.domain.valueobject.Documento;
import payment.domain.valueobject.Email;
import payment.domain.valueobject.Endereco;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PagamentoCartaoDeCredito extends Pagamento {
    private Documento nomeDoCartao;
    private String numeroDoCartao;
    private String numeroDaUltimaTransacao;

    public PagamentoCartaoDeCredito(LocalDate dataDoPagamento, LocalDate dataDeExpiracao, BigDecimal total, BigDecimal totalPago, String pagador, Documento documento, Endereco endereco, Email email, Documento nomeDoCartao, String numeroDoCartao, String numeroDaUltimaTransacao) {
        super(dataDoPagamento, dataDeExpiracao, total, totalPago, pagador, documento, endereco, email);
        this.nomeDoCartao = nomeDoCartao;
        this.numeroDoCartao = numeroDoCartao;
        this.numeroDaUltimaTransacao = numeroDaUltimaTransacao;
    }

    public Documento getNomeDoCartao() {
        return nomeDoCartao;
    }

    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public String getNumeroDaUltimaTransacao() {
        return numeroDaUltimaTransacao;
    }
}
