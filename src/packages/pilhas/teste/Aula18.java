package packages.pilhas.teste;

import java.util.Stack;

import packages.pilhas.Pilha;

public class Aula18 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.isEmpty());

        stack.push(0);
        stack.push(1);
        stack.push(2);

        System.out.println(stack);

        System.out.println(stack.size());

        System.out.println(stack.peek());

        System.out.println(
            stack.pop()
        );

        System.out.println(stack);
    }
}
