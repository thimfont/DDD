package payment.domain.entidades;

import payment.domain.valueobject.Documento;
import payment.domain.valueobject.Email;
import payment.domain.valueobject.Endereco;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PagamentoPayPal extends Pagamento {
    private String codigoDaTransacao;

    public PagamentoPayPal(LocalDate dataDoPagamento, LocalDate dataDeExpiracao, BigDecimal total, BigDecimal totalPago, String pagador, Documento documento, Endereco endereco, Email email, String codigoDaTransacao) {
        super(dataDoPagamento, dataDeExpiracao, total, totalPago, pagador, documento, endereco, email);
        this.codigoDaTransacao = codigoDaTransacao;
    }
}
