package cn.lightfish.sqlEngine.ast.expr.arithmeticExpr.doubleOperator;

import cn.lightfish.sqlEngine.context.RootSessionContext;
import cn.lightfish.sqlEngine.ast.expr.numberExpr.DoubleExpr;
import cn.lightfish.sqlEngine.ast.expr.ValueExpr;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DoubleMultipyExpr implements DoubleExpr {

  private final RootSessionContext context;
  private final ValueExpr left;
  private final ValueExpr right;

  @Override
  public Double getValue() {
    Double leftValue = (Double) left.getValue();
    if (leftValue == null) {
      return null;
    }
    Double rightValue = (Double) right.getValue();
    if (rightValue == null) {
      return null;
    }
    return leftValue * rightValue;
  }
}