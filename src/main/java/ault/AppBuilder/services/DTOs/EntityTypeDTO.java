package ault.AppBuilder.services.DTOs;

import lombok.Data;

import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class EntityTypeDTO {

  private String id;
  

  public EntityTypeDTO(String id) {
    this.id=id;
  }


}