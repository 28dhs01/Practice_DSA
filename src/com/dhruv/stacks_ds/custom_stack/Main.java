package com.dhruv.stacks_ds.custom_stack;

public class Main {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(3);
//        stack.push(4);
//        stack.push(9);
//        stack.push(1);
//        System.out.println("size of stack is - "+stack.size());
//        System.out.println("peek element of the stack is - "+stack.peek());
//        System.out.println("is empty - "+stack.isEmpty());
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        System.out.println("is empty - " +stack.isEmpty());

//        both the below statements will throw exceptions as the stack now is empty
//        stack.pop();
//        System.out.println(stack.peek());


//        Custom Stack
        CustomStack stack = new CustomStack();
        stack.push(3);
        stack.push(4);
        stack.push(9);
        stack.push(1);
        System.out.println(stack.peek());
        stack.push(10);
        System.out.println(stack.peek());
        stack.push(11);

        System.out.println("size of stack is -> "+stack.size());
        System.out.println("peek element of the stack is -> "+stack.peek());
        System.out.println("is empty -> "+stack.isEmpty());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("is empty -> " +stack.isEmpty());

        System.out.println(stack.peek());

    }
}
