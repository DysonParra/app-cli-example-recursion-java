/*
 * @fileoverview {Fibonacci} se encarga de realizar tareas especificas.
 *
 * @version             1.0
 *
 * @author              Dyson Arley Parra Tilano <dysontilano@gmail.com>
 * Copyright (C) Dyson Parra
 *
 * @History v1.0 --- La implementacion de {Fibonacci} fue realizada el 31/07/2022.
 * @Dev - La primera version de {Fibonacci} fue escrita por Dyson A. Parra T.
 */
package com.project.dev.recursion;

/**
 * TODO: Definición de {@code Fibonacci}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public class Fibonacci {

    /**
     * Calcula el fibonacci de {@code n}
     *
     * @param n un número.
     * @return fibonacci de {@code n}
     */
    public static long getFibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return getFibonacci(n - 1) + getFibonacci(n - 2);
    }
}
