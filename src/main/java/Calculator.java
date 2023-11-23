public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("Деление на 0 запрещено!");
            throw new ArithmeticException("Нельзя с нулём");
        return a / b;
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver(int a, int b, char operator) {
        switch (operator) {
            case '+':
                return add(a, b);
            case '-':
                return dif(a, b);
            case '*':
                return times(a, b);
            case '/':
                return div(a, b);
            default:
                throw new IllegalArgumentException("Такого оператора нет :( : " + operator);
        }
    }
}

        if (operator == '+') {
            return add(a, b);
        } else if (operator == '-') {
            return dif(a, b);
        } else if (operator == '*') {
            return times(a, b);
        } else if (operator == '/') {
            return div(a, b);
        } else {
            throw new IllegalArgumentException("Несуществующий оператор: " + operator);
        }
    }
}
