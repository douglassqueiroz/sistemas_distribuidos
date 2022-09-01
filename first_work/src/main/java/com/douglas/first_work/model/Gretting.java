package com.douglas.first_work.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gretting {
   private String greeting;
   
  public Double number1;
  public Double number2;

  public Double getGretting(){
   return number1+number2;
  }
}
