package br.com.gerenciador.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gerenciador.model.Pessoa;



public interface Pessoas extends JpaRepository<Pessoa, Long> {

}
