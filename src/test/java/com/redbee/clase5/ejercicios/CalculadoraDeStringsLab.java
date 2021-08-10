package com.redbee.clase5.ejercicios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.List;

/**
 * Crea una calculadora que sea capaz de recibir una operación matemática como input en un string y devuelva el
 * resultado de la misma. Para simplificar la implementación de la solución asumamos que la cadena ya está validada
 *
 * Requerimiento 1
 * Cuando el string esté vacío, deberá devolver 0. Por ejemplo, cuando se llame a calcular("") deberá devolver 0
 *
 * Requerimiento 2
 * Deberá manejar null. Si es llamado calcular(null) deberá devolver 0
 *
 * Requerimiento 3
 * Deberá manejar la posibilidad que introduzcan 1 solo valor. Por ejemplo si se llama a calcular("3"), entonces deberá
 * devolver el mismo valor, en este caso 3
 *
 * Requerimiento 4
 * Cuando se llame una operación de suma, deberá interpretarla y realizar la operación necesaria. Por ejemplo si se
 * llama a calcular("1+3") entonces deberá devolver 4
 *
 * Requerimiento 5
 * Cuando se llame a una operación de resta, deberá interpretarla y realizar la operación necesaria. Por ejemplo si se
 * llama a calcular("5-6") deberá devolver 1
 *
 */
@DisplayName("Laboratorio para ejercicio de numeros romanos")
public class CalculadoraDeStringsLab {

    @Test
    void CalcularVacio() {
        final var input = "";
        final var resEsperado = 0;
        final var resActual = CalculadoraString.calcula(input);
        Assertions.assertEquals(resEsperado, resActual);
    }

    @Test
    void CalcularNull(){
        final var resEsperado = 0;
        final var resActual = CalculadoraString.calcula(null);
        Assertions.assertEquals(resEsperado,resActual);

    }

    @Test
    void CalcularUnParametro(){
        final var resEsperado = 3;
        final var resActual = CalculadoraString.calcula("3");
        Assertions.assertEquals(resEsperado,resActual);
    }

    @Test
    void CalcularSuma(){
        final var resEsperado = 4;
        final var resActual = CalculadoraString.calcula("1+3");
        Assertions.assertEquals(resEsperado,resActual);
    }

    @Test
    void CalcularResta(){
        final var resEsperado = 1;
        final var resActual = CalculadoraString.calcula("5-6");
        Assertions.assertEquals(resEsperado,resActual);
    }

    @Test
    void CalcularSumaValores(){
        final var resEsperado = 25;
        final var resActual = CalculadoraString.calcula("10+9+1+5");
        Assertions.assertEquals(resEsperado,resActual);
    }
    @Test
    void CalcularRestaValores(){
        final var resEsperado = 4;
        final var resActual = CalculadoraString.calcula("10-2-4");
        Assertions.assertEquals(resEsperado,resActual);
    }
}

