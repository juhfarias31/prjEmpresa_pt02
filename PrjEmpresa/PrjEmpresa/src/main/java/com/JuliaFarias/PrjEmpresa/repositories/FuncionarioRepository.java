package com.JuliaFarias.PrjEmpresa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.JuliaFarias.PrjEmpresa.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

	@Query("SELECT f FROM Funcionario f WHERE LOWER(f.funname) LIKE LOWER(CONCAT('%', :funname, '%'))")
	List<Funcionario> findByNomeContaining(@Param("funname") String funnome);
}