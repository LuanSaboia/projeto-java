package backend.com.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import backend.com.backend.model.Conta;
import backend.com.backend.model.Movimentacao;
import backend.com.backend.model.Pessoa;
import backend.com.backend.repository.ContaRepository;
import backend.com.backend.repository.MovimentacaoRepository;
import backend.com.backend.repository.PessoaRepository;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private ContaRepository contaRepository;

    @Autowired
    private MovimentacaoRepository movimentacaoRepository;

    // Cadastro de Pessoa
    @PostMapping("/pessoa")
    String cadastrarPessoa(@RequestBody Pessoa pessoa) {
        //Pessoa novaPessoa = pessoaRepository.save(pessoa);
        //return new ResponseEntity<>(novaPessoa, HttpStatus.CREATED);
        return "teste retorno /api/user/pessoa";
    }

    // Cadastro de Conta
    @PostMapping("/conta")
    ResponseEntity<Conta> cadastrarConta(@RequestBody Conta conta) {
        Conta novaConta = contaRepository.save(conta);
        return new ResponseEntity<>(novaConta, HttpStatus.CREATED);
    }

    // Cadastro de Movimentação
    @PostMapping("/movimentacao")
    ResponseEntity<Movimentacao> cadastrarMovimentacao(@RequestBody Movimentacao movimentacao) {
        Movimentacao novaMovimentacao = movimentacaoRepository.save(movimentacao);
        return new ResponseEntity<>(novaMovimentacao, HttpStatus.CREATED);
    }
}

