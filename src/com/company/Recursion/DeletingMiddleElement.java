package com.company;
import java.util.*;

public class DeletingMiddleElement {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        solver(stack, stack.size() / 2+1); // as stack is 1 based

        for (int i =0;i< stack.size();i++){
            System.out.print(stack.get(i) + " ");
        }
    }
    static void solver(Stack<Integer> stack, int k ){
        if (stack.size()==0) {
            return;
        }
        helper(stack ,k);
    }
    static void helper(Stack<Integer> stack, int k){
        if (k==1){
            stack.pop();
            return ;
        }

        int val = stack.pop();
        helper(stack,k-1);
        stack.push(val);
    }
}
