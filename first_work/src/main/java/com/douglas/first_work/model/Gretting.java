package com.douglas.first_work.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gretting { 
  public int number1;
  public int number2;

  public int getGretting(){
   return number1 + number2;
  }
}

