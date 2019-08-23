package payment.domain.entidades;

import payment.domain.valueobject.Documento;
import payment.domain.valueobject.Email;
import payment.domain.valueobject.Endereco;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PagamentoBoleto extends Pagamento {
    private String codigoDeBarra;
    private String numeroDoBoleto;

    public PagamentoBoleto(LocalDate dataDoPagamento, LocalDate dataDeExpiracao, BigDecimal total, BigDecimal totalPago, String pagador, Documento documento, Endereco endereco, Email email, String codigoDeBarra, String numeroDoBoleto) {
        super(dataDoPagamento, dataDeExpiracao, total, totalPago, pagador, documento, endereco, email);
        this.codigoDeBarra = codigoDeBarra;
        this.numeroDoBoleto = numeroDoBoleto;
    }

    public String getCodigoDeBarra() {
        return codigoDeBarra;
    }

    public String getNumeroDoBoleto() {
        return numeroDoBoleto;
    }
}

