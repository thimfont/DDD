package payment.domain.valueobject;

import payment.shared.ValueObject;

public class Documento extends ValueObject {
    private String documento;
    private Tipo tipo;

    public Documento(String documento, Tipo tipo) {
        this.documento = documento;
        this.tipo = tipo;
    }

    public String getDocumento() {
        return documento;
    }

    public enum Tipo {
        CPF,
        CNPJ
    }
}
