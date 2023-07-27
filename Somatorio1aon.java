package javabasico.aula35.recursividade.exercicios;

public class Somatorio1aon {

    public static int somatorio(int num){

        if(num == 0){
            return 0;
        }else if(num == 1){
            return 1;
        }

        return num + somatorio(num-1);
    }
}
// somatorio(6) = 6 + somatorio(5) = 21
// somatorio(5) = 5 + somatorio(4) = 15
// somatorio(4) = 4 + somatorio(3) = 10
// somatorio(3) = 3 + somatorio(2) = 6
// somatorio(2) = 2 + somatorio(1) = 3
// somatorio(1) = 1 + somatorio(0) = 1
// somatorio(0) = 0