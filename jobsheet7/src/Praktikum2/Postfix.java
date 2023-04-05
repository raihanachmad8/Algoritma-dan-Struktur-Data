package Praktikum2;

import Praktikum1.Stack;

public class Postfix {
    int n, top;
    char[] stack;

    public Postfix (int total) {
        this.n = total;
        this.top = -1;
        this.stack = new char[this.n];
        push('(');
    }

    public void push(char c) {
        top++;
        stack[top] = c;
    }

    public char pop() {
        char item = stack[top];
        top--;
        return item;
    }

    public boolean IsOperand(char c) {
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') ||
                (c >= '0' && c <= '9') || c == ' ' || c == '.') {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsOperator (char c) {
        if (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+') {
            return true;
        } else {
            return false;
        }
    }

    public int derajat(char c) {
        switch (c) {
            case '^' -> {
                return 3;
            }
            case '%', '/', '*' -> {
                return 2;
            }
            case '-', '+' -> {
                return 1;
            }
            default -> {
                return 0;
            }
        }
    }

    public String konversi(String Q) {
        String P = "";
        char C;
        for (int i = 0; i < this.n; i++) {
            C = Q.charAt(i);
            if (IsOperand(C)) {
                P = P + C;
            }
            if (C == '(') {
                push(C);
            }
            if (C == ')') {
                while (stack[top] != '(') {
                    P = P + pop();
                }
                pop();
            }

            if (IsOperator(C)) {
                while (derajat(stack[top]) >= derajat(C)) {
                    P = P + pop();
                }
                push(C);
            }
        }
        return P;
    }

}
