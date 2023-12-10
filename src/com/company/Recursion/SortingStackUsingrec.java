package com.company;
import java.util.*;

public class SortingStackUsingrec {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(9);
        stack.push(3);
        stack.push(5);
        stack.push(10);
        sort(stack);
        System.out.println(stack);
    }
    static void sort(Stack<Integer> stack){
        if (stack.size()==1){
            return;
        }

        Integer lastElement =  stack.pop();
        sort(stack);
        insert(stack, lastElement);

    }
    static void insert(Stack<Integer> stack , Integer temp ){
        if (stack.size()==0 || stack.peek()<=temp){
            stack.push(temp);
            return;
        }

        int val = stack.pop();
        insert(stack,temp);
        stack.push(val);
    }
}
