/* This file was generated by SableCC (http://www.sablecc.org/). */

package nonneuman.analysis;

import java.util.*;
import nonneuman.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOp1AInicio(AOp1AInicio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOp2AInicio(AOp2AInicio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOp3AInicio(AOp3AInicio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnicoABlocoList(AUnicoABlocoList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariosABlocoList(AVariosABlocoList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAMain(AAMain node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAABloco(AABloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFuncaoAFuncao(AFuncaoAFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVaziaAFuncao(AVaziaAFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntAType(AIntAType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABoolAType(ABoolAType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARealAType(ARealAType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnicoATypeList(AUnicoATypeList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariosATypeList(AVariosATypeList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComumAParametro(AComumAParametro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFuncaltaAParametro(AFuncaltaAParametro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnicoAParamsList(AUnicoAParamsList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariosAParamsList(AVariosAParamsList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAARetorno(AARetorno node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExprAArgumento(AExprAArgumento node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamadaAArgumento(AChamadaAArgumento node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACondicionalAArgumento(ACondicionalAArgumento node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAUnicoAArgsList(AUnicoAArgsList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariosAArgsList(AVariosAArgsList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAPlusAExpr(AAPlusAExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAMinusAExpr(AAMinusAExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAMultAExpr(AAMultAExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAADivAExpr(AADivAExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAModAExpr(AAModAExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAValorAExpr(AAValorAExpr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAChamadaFunc(AAChamadaFunc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfACondicional(AIfACondicional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfelseACondicional(AIfelseACondicional node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABoolACondicao(ABoolACondicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEqACondicao(AEqACondicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMqACondicao(AMqACondicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMnACondicao(AMnACondicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACondACondicao(ACondACondicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntAValor(AIntAValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARealAValor(ARealAValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABoolAValor(ABoolAValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarAValor(AVarAValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAIgual(AAIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAMaior(AAMaior node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAMenor(AAMenor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAFuncAlta(AAFuncAlta node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEntryPoint(TEntryPoint node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConstId(TConstId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFuncId(TFuncId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIfId(TIfId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTThenId(TThenId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTElseId(TElseId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIntId(TIntId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBoolId(TBoolId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRealId(TRealId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLambdaId(TLambdaId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMult(TMult node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMod(TMod node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEquals(TEquals node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGThan(TGThan node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLThan(TLThan node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNot(TNot node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAnd(TAnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOr(TOr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTColon(TColon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLParen(TLParen node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRParen(TRParen node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLBrac(TLBrac node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRBrac(TRBrac node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBoolType(TBoolType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIntType(TIntType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRealType(TRealType node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCommentLine(TCommentLine node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCommentBlock(TCommentBlock node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}