/* This file was generated by SableCC (http://www.sablecc.org/). */

package nonneuman.node;

import nonneuman.analysis.*;

@SuppressWarnings("nls")
public final class ACondACondicao extends PACondicao
{
    private TLParen _lParen_;
    private PACondicao _aCondicao_;
    private TRParen _rParen_;

    public ACondACondicao()
    {
        // Constructor
    }

    public ACondACondicao(
        @SuppressWarnings("hiding") TLParen _lParen_,
        @SuppressWarnings("hiding") PACondicao _aCondicao_,
        @SuppressWarnings("hiding") TRParen _rParen_)
    {
        // Constructor
        setLParen(_lParen_);

        setACondicao(_aCondicao_);

        setRParen(_rParen_);

    }

    @Override
    public Object clone()
    {
        return new ACondACondicao(
            cloneNode(this._lParen_),
            cloneNode(this._aCondicao_),
            cloneNode(this._rParen_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACondACondicao(this);
    }

    public TLParen getLParen()
    {
        return this._lParen_;
    }

    public void setLParen(TLParen node)
    {
        if(this._lParen_ != null)
        {
            this._lParen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lParen_ = node;
    }

    public PACondicao getACondicao()
    {
        return this._aCondicao_;
    }

    public void setACondicao(PACondicao node)
    {
        if(this._aCondicao_ != null)
        {
            this._aCondicao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aCondicao_ = node;
    }

    public TRParen getRParen()
    {
        return this._rParen_;
    }

    public void setRParen(TRParen node)
    {
        if(this._rParen_ != null)
        {
            this._rParen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rParen_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lParen_)
            + toString(this._aCondicao_)
            + toString(this._rParen_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lParen_ == child)
        {
            this._lParen_ = null;
            return;
        }

        if(this._aCondicao_ == child)
        {
            this._aCondicao_ = null;
            return;
        }

        if(this._rParen_ == child)
        {
            this._rParen_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lParen_ == oldChild)
        {
            setLParen((TLParen) newChild);
            return;
        }

        if(this._aCondicao_ == oldChild)
        {
            setACondicao((PACondicao) newChild);
            return;
        }

        if(this._rParen_ == oldChild)
        {
            setRParen((TRParen) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}