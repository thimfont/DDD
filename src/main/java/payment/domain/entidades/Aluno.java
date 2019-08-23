package payment.domain.entidades;

import payment.domain.valueobject.Documento;
import payment.domain.valueobject.Email;
import payment.domain.valueobject.Endereco;
import payment.domain.valueobject.Nome;
import payment.shared.Entidade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aluno extends Entidade {
    private Nome nome;
    private Documento documento;
    private Email email;
    private Endereco endereco;
    private List<Assinatura> assinaturas;

    public Aluno(Nome nome, Documento documento, Email email) {
        this.nome = nome;
        this.documento = documento;
        this.email = email;
        this.assinaturas = new ArrayList<>();
    }

    public Nome getNome() {
        return nome;
    }

    public Documento getDocumento() {
        return documento;
    }

    public Email getEmail() {
        return email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public List<Assinatura> getAssinaturas() {
        return Collections.unmodifiableList(assinaturas);
    }

    public void setAssinaturas(List<Assinatura> assinaturas) {
        this.assinaturas = assinaturas;
    }

    public void adicionaAssinatura(Assinatura assinatura) {
        //cancela todas as assinaturas e ativa esta como principal
        for (Assinatura assinaturaAntiga : assinaturas)
            assinaturaAntiga.tornarAtiva(false);

        this.assinaturas.add(assinatura);
    }
}
