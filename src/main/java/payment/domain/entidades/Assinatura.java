package payment.domain.entidades;

import java.time.LocalDate;
import java.util.List;

public class Assinatura {
    private LocalDate dataDeCriacao;
    private LocalDate dataDeUltimaAtualizacao;
    private LocalDate dataDeExpiracao;
    private boolean estaAtiva;
    private List<Pagamento> pagamentos;


}
