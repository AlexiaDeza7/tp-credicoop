package utn.tp.credicoop.msventas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import utn.tp.credicoop.msventas.entities.Compra;

@RepositoryRestResource(path="compra")
public interface CompraJPA extends JpaRepository<Compra, Long> {
}
