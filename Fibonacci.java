package javabasico.aula35.recursividade.exercicios;

public class Fibonacci {

    public static int calcFibonacci(int num){

        if(num == 1){
            return 0;
        }else if(num == 2){
            return 1;
        }

        return calcFibonacci(num -1) + calcFibonacci(num-2);
    }
}

// fibon(7) = fibon(6) + fibon(5) = 5 + 3
// fibon(6) = fibon(5) + fibon(4) = 3 + 2
// fibon(5) = fibon(4) + fibon(3) = 2 + 1
// fibon(4) = fibon(3) + fibon(2) = 1 + 1
// fibon(3) = fibon(2) + fibon(1) = 1 + 0
// fibon(2) = 1
// fibon(1) = 0;