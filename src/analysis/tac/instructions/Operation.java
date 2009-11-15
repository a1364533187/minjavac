package analysis.tac.instructions;

import analysis.symboltable.Variable;

public class Operation implements Instruction {
  private Opcode op;
  private Variable dest, a, b;

  public Operation(Opcode op, Variable x, Variable y) {
    this(op, x, y, null);
  }

  public Operation(Opcode _op, Variable _d, Variable _a, Variable _b) {
    op = _op;
    dest = _d;
    a = _a;
    b = _b;
  }

  public Opcode getOperation() {
    return op;
  }

  public Variable getDestiny() {
    return dest;
  }

  public Variable getA() {
    return a;
  }

  public Variable getB() {
    return b;
  }

  @Override
  public String toString() {
    return String.format("%s := %s %s, %s", dest, op, a, b);
  }
}
