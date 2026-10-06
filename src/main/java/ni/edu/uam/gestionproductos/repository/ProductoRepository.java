package ni.edu.uam.gestionproductos.repository;

import ni.edu.uam.gestionproductos.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}