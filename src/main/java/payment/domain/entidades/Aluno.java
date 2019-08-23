package payment.domain.entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aluno {
    private String nome;
    private String sobrenome;
    private String documento;
    private String email;
    private String endereco;
    private List<Assinatura> assinaturas;

    public Aluno(String nome, String sobrenome, String documento, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.documento = documento;
        this.email = email;
        this.assinaturas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getDocumento() {
        return documento;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
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
