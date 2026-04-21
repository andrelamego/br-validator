package com.lamego.cpfvalidator.annotation;

public class PessoaDTO {
    @ValidCpf
    private String cpf;

    public PessoaDTO(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
