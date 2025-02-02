// Generated from Expression.g4 by ANTLR 4.5.1

package expressivo.parser;
// Do not edit this .java file! Edit the grammar in Expression.g4 and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionParser}.
 */
public interface ExpressionListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link ExpressionParser#root}.
   * @param ctx the parse tree
   */
  void enterRoot(ExpressionParser.RootContext ctx);
  /**
   * Exit a parse tree produced by {@link ExpressionParser#root}.
   * @param ctx the parse tree
   */
  void exitRoot(ExpressionParser.RootContext ctx);
  /**
   * Enter a parse tree produced by {@link ExpressionParser#expression}.
   * @param ctx the parse tree
   */
  void enterExpression(ExpressionParser.ExpressionContext ctx);
  /**
   * Exit a parse tree produced by {@link ExpressionParser#expression}.
   * @param ctx the parse tree
   */
  void exitExpression(ExpressionParser.ExpressionContext ctx);
  /**
   * Enter a parse tree produced by {@link ExpressionParser#term}.
   * @param ctx the parse tree
   */
  void enterTerm(ExpressionParser.TermContext ctx);
  /**
   * Exit a parse tree produced by {@link ExpressionParser#term}.
   * @param ctx the parse tree
   */
  void exitTerm(ExpressionParser.TermContext ctx);
  /**
   * Enter a parse tree produced by {@link ExpressionParser#factor}.
   * @param ctx the parse tree
   */
  void enterFactor(ExpressionParser.FactorContext ctx);
  /**
   * Exit a parse tree produced by {@link ExpressionParser#factor}.
   * @param ctx the parse tree
   */
  void exitFactor(ExpressionParser.FactorContext ctx);
}