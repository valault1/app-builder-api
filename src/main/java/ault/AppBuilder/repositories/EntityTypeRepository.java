package ault.AppBuilder.repositories;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import ault.AppBuilder.models.EntityType;

public interface EntityTypeRepository extends MongoRepository<EntityType, String>{
  List<EntityType> findByEntityTypeName(@Param("name") String name);
}
