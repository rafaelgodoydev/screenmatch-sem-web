package br.com.rafael.screenmatch.principal;

import java.util.Arrays;
import java.util.List;

public class Principal2{

    public static void main(String[] args){

//        Exemplo de uso de funções Lambda.
//        Suponhamos que temos uma lista de números e queremos printar apenas os números pares dessa lista.
//        Sem o uso de funções lambda, poderíamos fazer algo assim:
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        for (Integer i : lista) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Porém, com o uso de funções lambda, podemos simplificar esse código:
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

        // No código acima, criamos um stream da nossa lista, filtramos esse stream para incluir apenas os números
        // (pares) (isso é feito pelo função lambda i > i % 2 == 0). e finalmente usamos o método forEach para printar
        // cada elemento do stream filtrado.
    }

}
