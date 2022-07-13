public class Calculator {
    private double num1, num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    double add() {
        return  this.num1 + this.num2;
    }

    double subtract() {
        if (this.num1 >= this.num2) {
            return this.num1 - this.num2;
        }
        return this.num2 - this.num1;
    }

    double multiply() {
        return this.num1 * this.num2;
    }

    double divide() {
        if (this.num1 >= this.num2) {
            return this.num1 / this.num2;
        }
        return this.num2 / this.num1;
    }
}

