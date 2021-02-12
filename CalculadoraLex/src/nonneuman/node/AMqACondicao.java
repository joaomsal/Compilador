/* This file was generated by SableCC (http://www.sablecc.org/). */

package nonneuman.node;

import nonneuman.analysis.*;

@SuppressWarnings("nls")
public final class AMqACondicao extends PACondicao
{
    private PAValor _aValor_;
    private PAMaior _aMaior_;

    public AMqACondicao()
    {
        // Constructor
    }

    public AMqACondicao(
        @SuppressWarnings("hiding") PAValor _aValor_,
        @SuppressWarnings("hiding") PAMaior _aMaior_)
    {
        // Constructor
        setAValor(_aValor_);

        setAMaior(_aMaior_);

    }

    @Override
    public Object clone()
    {
        return new AMqACondicao(
            cloneNode(this._aValor_),
            cloneNode(this._aMaior_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMqACondicao(this);
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

    public PAMaior getAMaior()
    {
        return this._aMaior_;
    }

    public void setAMaior(PAMaior node)
    {
        if(this._aMaior_ != null)
        {
            this._aMaior_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aMaior_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aValor_)
            + toString(this._aMaior_);
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

        if(this._aMaior_ == child)
        {
            this._aMaior_ = null;
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

        if(this._aMaior_ == oldChild)
        {
            setAMaior((PAMaior) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}