package com.shaheen;

import javax.jws.WebService;

@WebService
public class Calc {

    public float add(float num1, float num2) {
        return num1 + num2;
    }

    public float sub(float num1, float num2) {
        return num1 - num2;
    }

    public float mul(float num1, float num2) {
        return num1 * num2;
    }

    public float div(float num1, float num2) {
        return num1 / num2;
    }
}
