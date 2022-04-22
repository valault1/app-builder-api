package ault.AppBuilder.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;

import ault.AppBuilder.models.Entity;

public interface EntityRepository extends MongoRepository<Entity, String>{
  
}
