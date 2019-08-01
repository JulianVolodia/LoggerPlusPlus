/* Generated By:JJTree: Do not edit this line. ASTIdentifier.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package loggerplusplus.filter.parser;

import loggerplusplus.LogEntryField;

public
class ASTIdentifier extends SimpleNode {


    String group, field;
    boolean inverse;
    LogEntryField logEntryField;
    Class type;

  public ASTIdentifier(int id) {
    super(id);
  }

  public ASTIdentifier(FilterParser p, int id) {
    super(p, id);
  }

  @Override
  public String toString() {
    return String.format("%s [%s.%s, Type:%s, Inverse:%b, Field:%s", super.toString(), group, field, type != null ? type.getTypeName() : "null", inverse, logEntryField);
  }

  /** Accept the visitor. **/
  public Object jjtAccept(FilterParserVisitor visitor, VisitorData data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=0c10279aa024a6a006686c1c57caa685 (do not edit this line) */