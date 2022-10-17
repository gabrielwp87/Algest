package src.main.domain.model;

import src.main.domain.dto.ExpressionDto;
import src.main.domain.types.Stack;

public class ExpressionModel {
    private final Stack expression;
    private Integer result;

    public ExpressionModel(ExpressionDto expressionDto) {
        this.expression = expressionDto.getExpression();
    }

    public Stack getExpression() {
        return Stack.clone(expression);
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer value) throws Exception {
        if (result != null) throw new Exception("Can not reassign result value");
        result = value;
    }
}
