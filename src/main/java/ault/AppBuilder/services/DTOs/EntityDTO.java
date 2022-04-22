package ault.AppBuilder.services.DTOs;

import lombok.Data;

import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class EntityDTO {

  private String id;


  public EntityDTO(String id) {
    this.id=id;
  }


}