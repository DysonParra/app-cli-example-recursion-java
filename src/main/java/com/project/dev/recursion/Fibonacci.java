/*
 * @fileoverview    {Fibonacci}
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementation done.
 * @version 2.0     Documentation added.
 */
package com.project.dev.recursion;

/**
 * TODO: Definición de {@code Fibonacci}.
 *
 * @author Dyson Parra
 * @since 11
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
