package main.impl;

import main.QuadraticEquationSolution;

import java.util.List;

public class QuadraticEquationSolutionDefault implements QuadraticEquationSolution {
    private final List<Number> roots;

    public QuadraticEquationSolutionDefault(List<Number> roots) {
        this.roots = roots;
    }

    @Override
    public String get() {
        if (roots.isEmpty()) return "no roots";
        StringBuilder builder = new StringBuilder("x = ").append(roots.get(0));
        for (int i = 1; i < roots.size(); ++i) builder.append(", x = ").append(roots.get(i));
        return builder.toString();
    }
}
