package payment.domain.valueobject;

import payment.shared.ValueObject;

public class Email extends ValueObject {
    private String endereco;

    public Email(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }
}
