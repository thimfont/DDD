package payment.domain.entidades;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public abstract class Pagamento {
    public Pagamento(LocalDate dataDoPagamento, LocalDate dataDeExpiracao, BigDecimal total, BigDecimal totalPago, String pagador, String documento, String endereco, String email) {
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

    private String numero;
    private LocalDate dataDoPagamento;
    private LocalDate dataDeExpiracao;
    private BigDecimal total;
    private BigDecimal totalPago;
    private String pagador;
    private String documento;
    private String endereco;
    private String email;

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

    public String getDocumento() {
        return documento;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }
}
