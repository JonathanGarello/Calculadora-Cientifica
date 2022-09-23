package com.github.sanchezih.calculadora.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aritmetica")
public class CalculadoraAritmeticaController {

	public CalculadoraAritmeticaController() {
	}

	@RequestMapping(value = "/sumar", method = RequestMethod.GET, params = { "operando1", "operando2" })
	public Integer sumar(@RequestParam("operando1") Integer operando1, @RequestParam("operando2") Integer operando2) {
		return operando1 + operando2;
	}

	@RequestMapping(value = "/multiplicar", method = RequestMethod.GET, params = { "operando1", "operando2" })
	public Integer multiplicar(@RequestParam("operando1") Integer operando1,
			@RequestParam("operando2") Integer operando2) {
		return operando1 * operando2;
	}
	
	@RequestMapping(value = "/factorial", method = RequestMethod.GET, params = { "operando1" })
	public Integer factorial(@RequestParam("operando1") Integer operando1) {
		Integer fact = 1;
		for(int i = 1; i <= operando1; i++) {
			fact*=i;
		}
		return fact;
	}
	
	@RequestMapping(value = "/raiz", method = RequestMethod.GET, params = { "operando1" })
	public Double raizCuadrada(@RequestParam("operando1") Integer operando1) {
		Double resultado = Math.sqrt(operando1);
		return resultado; 
	}
	
	@RequestMapping(value = "/primo", method = RequestMethod.GET, params = { "operando1" })
	public boolean primo(@RequestParam("operando1") Integer operando1) {
		 if (operando1 == 0 || operando1 == 1 || operando1 == 4) {
			    return false;
			  }
			  for (int x = 2; x < operando1 / 2; x++) {
			    // Si es divisible por cualquiera de estos números, no
			    // es primo
			    if (operando1 % x == 0)
			      return false;
			  }
			  // Si no se pudo dividir por ninguno de los de arriba, sí es primo
			  return true;
	}
	
	
	
	
}