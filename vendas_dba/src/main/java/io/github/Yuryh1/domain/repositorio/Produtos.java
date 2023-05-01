package io.github.Yuryh1.domain.repositorio;

import io.github.Yuryh1.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto,Integer> {
}
