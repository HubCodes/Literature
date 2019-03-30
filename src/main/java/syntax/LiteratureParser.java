// Generated from Literature.g4 by ANTLR 4.5

package syntax;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LiteratureParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, NUMBER = 5, WS = 6;
    public static final int
            RULE_compilationUnit = 0, RULE_expression = 1, RULE_value = 2;
    public static final String[] ruleNames = {
            "compilationUnit", "expression", "value"
    };

    private static final String[] _LITERAL_NAMES = {
            null, "'*'", "'/'", "'+'", "'-'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, "NUMBER", "WS"
    };
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() {
        return "Literature.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public LiteratureParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class CompilationUnitContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode EOF() {
            return getToken(LiteratureParser.EOF, 0);
        }

        public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_compilationUnit;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LiteratureVisitor)
                return ((LiteratureVisitor<? extends T>) visitor).visitCompilationUnit(this);
            else return visitor.visitChildren(this);
        }
    }

    public final CompilationUnitContext compilationUnit() throws RecognitionException {
        CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_compilationUnit);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(6);
                expression(0);
                setState(7);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExpressionContext extends ParserRuleContext {
        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        public ExpressionContext() {
        }

        public void copyFrom(ExpressionContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class SubtractExpressionContext extends ExpressionContext {
        public Token op;

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public SubtractExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LiteratureVisitor)
                return ((LiteratureVisitor<? extends T>) visitor).visitSubtractExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DivideExpressionContext extends ExpressionContext {
        public Token op;

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public DivideExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LiteratureVisitor)
                return ((LiteratureVisitor<? extends T>) visitor).visitDivideExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AddExpressionContext extends ExpressionContext {
        public Token op;

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public AddExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LiteratureVisitor)
                return ((LiteratureVisitor<? extends T>) visitor).visitAddExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ValueExpressionContext extends ExpressionContext {
        public ValueContext value() {
            return getRuleContext(ValueContext.class, 0);
        }

        public ValueExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LiteratureVisitor)
                return ((LiteratureVisitor<? extends T>) visitor).visitValueExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class MultiplyExpressionContext extends ExpressionContext {
        public Token op;

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public MultiplyExpressionContext(ExpressionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LiteratureVisitor)
                return ((LiteratureVisitor<? extends T>) visitor).visitMultiplyExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ExpressionContext expression() throws RecognitionException {
        return expression(0);
    }

    private ExpressionContext expression(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
        ExpressionContext _prevctx = _localctx;
        int _startState = 2;
        enterRecursionRule(_localctx, 2, RULE_expression, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                {
                    _localctx = new ValueExpressionContext(_localctx);
                    _ctx = _localctx;
                    _prevctx = _localctx;

                    setState(10);
                    value();
                }
                _ctx.stop = _input.LT(-1);
                setState(26);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(24);
                            switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
                                case 1: {
                                    _localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(12);
                                    if (!(precpred(_ctx, 5)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(13);
                                    ((MultiplyExpressionContext) _localctx).op = match(T__0);
                                    setState(14);
                                    expression(6);
                                }
                                break;
                                case 2: {
                                    _localctx = new DivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(15);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(16);
                                    ((DivideExpressionContext) _localctx).op = match(T__1);
                                    setState(17);
                                    expression(5);
                                }
                                break;
                                case 3: {
                                    _localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(18);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(19);
                                    ((AddExpressionContext) _localctx).op = match(T__2);
                                    setState(20);
                                    expression(4);
                                }
                                break;
                                case 4: {
                                    _localctx = new SubtractExpressionContext(new ExpressionContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                    setState(21);
                                    if (!(precpred(_ctx, 2)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    setState(22);
                                    ((SubtractExpressionContext) _localctx).op = match(T__3);
                                    setState(23);
                                    expression(3);
                                }
                                break;
                            }
                        }
                    }
                    setState(28);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class ValueContext extends ParserRuleContext {
        public TerminalNode NUMBER() {
            return getToken(LiteratureParser.NUMBER, 0);
        }

        public ValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_value;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LiteratureVisitor)
                return ((LiteratureVisitor<? extends T>) visitor).visitValue(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ValueContext value() throws RecognitionException {
        ValueContext _localctx = new ValueContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_value);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(29);
                match(NUMBER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 1:
                return expression_sempred((ExpressionContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 5);
            case 1:
                return precpred(_ctx, 4);
            case 2:
                return precpred(_ctx, 3);
            case 3:
                return precpred(_ctx, 2);
        }
        return true;
    }

    public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\b\"\4\2\t\2\4\3\t" +
                    "\3\4\4\t\4\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3" +
                    "\3\3\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\4\3\4\3\4\2\3\4\5\2\4\6\2\2" +
                    "\"\2\b\3\2\2\2\4\13\3\2\2\2\6\37\3\2\2\2\b\t\5\4\3\2\t\n\7\2\2\3\n\3\3" +
                    "\2\2\2\13\f\b\3\1\2\f\r\5\6\4\2\r\34\3\2\2\2\16\17\f\7\2\2\17\20\7\3\2" +
                    "\2\20\33\5\4\3\b\21\22\f\6\2\2\22\23\7\4\2\2\23\33\5\4\3\7\24\25\f\5\2" +
                    "\2\25\26\7\5\2\2\26\33\5\4\3\6\27\30\f\4\2\2\30\31\7\6\2\2\31\33\5\4\3" +
                    "\5\32\16\3\2\2\2\32\21\3\2\2\2\32\24\3\2\2\2\32\27\3\2\2\2\33\36\3\2\2" +
                    "\2\34\32\3\2\2\2\34\35\3\2\2\2\35\5\3\2\2\2\36\34\3\2\2\2\37 \7\7\2\2" +
                    " \7\3\2\2\2\4\32\34";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}