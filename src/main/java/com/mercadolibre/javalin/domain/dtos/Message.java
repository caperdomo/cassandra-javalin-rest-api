package com.mercadolibre.javalin.domain.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Message {

  private String id;
  private String text;

}
