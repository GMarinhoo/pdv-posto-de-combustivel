package com.br.pdvpostocombustivel;

import com.br.pdvpostocombustivel.api.domain.entity.Pessoa;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PdvpostocombustivelApplication {

	public static void main(String[] args) {
        //SpringApplication.run(PdvpostocombustivelApplication.class, args);

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNomeCompleto("Pedro");
        pessoa1.setCpfCnpf("24598645877");
        pessoa1.setNumeroCtps(1722L);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNomeCompleto("Jon");
        pessoa2.setCpfCnpf("45698612578");
        pessoa2.setNumeroCtps(2545L);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNomeCompleto("Marcos");
        pessoa3.setCpfCnpf("32674198266");
        pessoa2.setNumeroCtps(4687L);

        System.out.println("Nome Completo:" + pessoa1.getNomeCompleto());
        System.out.println("CPF/CNPJ:" + pessoa1.getCpfCnpf());
        System.out.println("Nuemro CTPs:" + pessoa1.getNumeroCtps());

        System.out.println("----------------------------------");

        System.out.println("Nome Completo:" + pessoa2.getNomeCompleto());
        System.out.println("CPF/CNPJ:" + pessoa2.getCpfCnpf());
        System.out.println("Nuemro CTPs:" + pessoa2.getNumeroCtps());

        System.out.println("----------------------------------");

        System.out.println("Nome Completo:" + pessoa3.getNomeCompleto());
        System.out.println("CPF/CNPJ:" + pessoa3.getCpfCnpf());
        System.out.println("Nuemro CTPs:" + pessoa3.getNumeroCtps());
    }

}
