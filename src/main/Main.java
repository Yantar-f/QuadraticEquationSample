package main;

import main.impl.QuadraticEquationImpl;
import main.impl.QuadraticEquationSolverImpl;

public class Main {
    public static void main(String[] args) {
        QuadraticEquationSolver equationSolver = new QuadraticEquationSolverImpl();

        QuadraticEquation equation = new QuadraticEquationImpl(1, -2, 0);
        QuadraticEquationSolution equationSolution = equationSolver.solve(equation);
        System.out.println("D > 0 test: " + equationSolution.get());

        equation = new QuadraticEquationImpl(1, -2, 1);
        equationSolution = equationSolver.solve(equation);
        System.out.println("D = 0 test: " + equationSolution.get());

        equation = new QuadraticEquationImpl(1, 2, 2);
        equationSolution = equationSolver.solve(equation);
        System.out.println("D < 0 test: " + equationSolution.get());

        equation = new QuadraticEquationImpl(0, -2, 1);
        equationSolution = equationSolver.solve(equation);
        System.out.println("a = 0 test: " + equationSolution.get());

        equation = new QuadraticEquationImpl(0, 0, 0);
        equationSolution = equationSolver.solve(equation);
        System.out.println("zero x coefficient test: " + equationSolution.get());
    }
}