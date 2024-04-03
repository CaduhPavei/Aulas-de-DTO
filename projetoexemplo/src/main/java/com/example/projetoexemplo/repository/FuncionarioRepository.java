package com.example.projetoexemplo.repository;
import com.example.projetoexemplo.enterprise.CustomQuerydslPredicateExecutor;
import com.example.projetoexemplo.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository  extends JpaRepository<Funcionario, Long>, CustomQuerydslPredicateExecutor<Funcionario> {
}
