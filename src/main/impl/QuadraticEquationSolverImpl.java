package main.impl;

import main.QuadraticEquation;
import main.QuadraticEquationSolution;
import main.QuadraticEquationSolver;

import java.util.List;

public class QuadraticEquationSolverImpl implements QuadraticEquationSolver {
    @Override
    public QuadraticEquationSolution solve(QuadraticEquation equation) {
        double
            a = equation.a().doubleValue(),
            b = equation.b().doubleValue(),
            c = equation.c().doubleValue();
        if (a == 0) {
            if (b == 0) return new QuadraticEquationSolutionAny();
            return new QuadraticEquationSolutionDefault(List.of(-c/b));
        } else {
            double D = Math.pow(b, 2) - 4*a*c;
            if (D < 0) return new QuadraticEquationSolutionNoRoots();
            if (D == 0) return new QuadraticEquationSolutionDefault(List.of(-b/(2*a)));
            return new QuadraticEquationSolutionDefault(List.of((-b + Math.sqrt(D))/(2*a), (-b - Math.sqrt(D))/(2*a)));
        }
    }
}
