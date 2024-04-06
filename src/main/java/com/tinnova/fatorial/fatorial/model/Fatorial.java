package com.tinnova.fatorial.fatorial.model;

public class Fatorial {
  /**
   * Calcula o fatoria de um número inteiro qualquer.
   * 
   * @param num O número que irá ser usado para o fatorial.
   */
  public int calculate(int num) {
    if (num < 0) {
      System.out.println("O número deve ser positivo");
    }
    if (num == 0 || num == 1) {
      return 1;
    }
    return num * calculate(num - 1);
  }
}
