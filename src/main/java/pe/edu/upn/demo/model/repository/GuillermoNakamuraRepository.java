package pe.edu.upn.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upn.demo.model.entity.GuillermoNakamura;

@Repository
public interface GuillermoNakamuraRepository extends JpaRepository<GuillermoNakamura, String>{

}
