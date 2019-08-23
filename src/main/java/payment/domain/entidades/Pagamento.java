package payment.domain.entidades;

import payment.domain.valueobject.Documento;
import payment.domain.valueobject.Email;
import payment.domain.valueobject.Endereco;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public abstract class Pagamento {
    private String numero;
    private LocalDate dataDoPagamento;
    private LocalDate dataDeExpiracao;
    private BigDecimal total;
    private BigDecimal totalPago;
    private String pagador;
    private Documento documento;
    private Endereco endereco;
    private Email email;

    public Pagamento(LocalDate dataDoPagamento, LocalDate dataDeExpiracao, BigDecimal total, BigDecimal totalPago, String pagador, Documento documento, Endereco endereco, Email email) {
        this.numero = UUID.randomUUID().toString().replace("-", "").substring(0, 10).toUpperCase();
        this.dataDoPagamento = dataDoPagamento;
        this.dataDeExpiracao = dataDeExpiracao;
        this.total = total;
        this.totalPago = totalPago;
        this.pagador = pagador;
        this.documento = documento;
        this.endereco = endereco;
        this.email = email;
    }

    public String getNumero() {
        return numero;
    }

    public LocalDate getDataDoPagamento() {
        return dataDoPagamento;
    }

    public LocalDate getDataDeExpiracao() {
        return dataDeExpiracao;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public BigDecimal getTotalPago() {
        return totalPago;
    }

    public String getPagador() {
        return pagador;
    }

    public Documento getDocumento() {
        return documento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Email getEmail() {
        return email;
    }
}
