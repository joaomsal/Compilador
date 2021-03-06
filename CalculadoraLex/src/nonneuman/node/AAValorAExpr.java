/* This file was generated by SableCC (http://www.sablecc.org/). */

package nonneuman.node;

import nonneuman.analysis.*;

@SuppressWarnings("nls")
public final class AAValorAExpr extends PAExpr
{
    private PAValor _aValor_;

    public AAValorAExpr()
    {
        // Constructor
    }

    public AAValorAExpr(
        @SuppressWarnings("hiding") PAValor _aValor_)
    {
        // Constructor
        setAValor(_aValor_);

    }

    @Override
    public Object clone()
    {
        return new AAValorAExpr(
            cloneNode(this._aValor_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAValorAExpr(this);
    }

    public PAValor getAValor()
    {
        return this._aValor_;
    }

    public void setAValor(PAValor node)
    {
        if(this._aValor_ != null)
        {
            this._aValor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aValor_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aValor_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aValor_ == child)
        {
            this._aValor_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aValor_ == oldChild)
        {
            setAValor((PAValor) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
