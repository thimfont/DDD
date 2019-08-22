package payment.domain.entidades;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Pagamento {
    private String numero;
    private LocalDate dataDoPagamento;
    private LocalDate dataDeExpiracao;
    private BigDecimal total;
    private BigDecimal totalPago;
    private String pagador;
    private String documento;
    private String endereco;
    private String email;


}
