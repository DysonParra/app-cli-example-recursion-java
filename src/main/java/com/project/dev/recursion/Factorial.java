/*
 * @fileoverview {Factorial} se encarga de realizar tareas especificas.
 *
 * @version             1.0
 *
 * @author              Dyson Arley Parra Tilano <dysontilano@gmail.com>
 * Copyright (C) Dyson Parra
 *
 * @History v1.0 --- La implementacion de {Factorial} fue realizada el 31/07/2022.
 * @Dev - La primera version de {Factorial} fue escrita por Dyson A. Parra T.
 */
package com.project.dev.recursion;

/**
 * TODO: Definición de {@code Factorial}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public class Factorial {

    /**
     * Calcula el factorial de {@code n}
     *
     * @param n un número.
     * @return factorial de {@code n}
     */
    public static long getFactorial(int n) {
        if (n <= 1)
            return n;
        else
            return n * getFactorial(n - 1);
    }
}
