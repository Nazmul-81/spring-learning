package com.csbd.learnspringboot.service;

import org.springframework.stereotype.Service;

@Service
public class FactorialService {
    public int factorial(int n) {
        if(n == 0)
            return 1;
        return n * factorial(n - 1);
    }
}
