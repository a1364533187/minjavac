package analysis.syntaxtree;

import analysis.visitors.Visitor;
import analysis.visitors.TypeVisitor;

public class GreaterOrEqual extends Exp {

  public Exp e1, e2;

  public GreaterOrEqual(Exp ae1, Exp ae2) {
    e1 = ae1;
    e2 = ae2;
  }

  public void accept(Visitor v) {
    v.visit(this);
  }

  public Type accept(TypeVisitor v) {
    return v.visit(this);
  }
}
