/* This file was generated by SableCC (http://www.sablecc.org/). */

package nonneuman.node;

import nonneuman.analysis.*;

@SuppressWarnings("nls")
public final class AVaziaAFuncao extends PAFuncao
{
    private TFuncId _funcId_;
    private PAType _aType_;
    private TId _id_;
    private TLParen _lParen_;
    private TRParen _rParen_;
    private PARetorno _aRetorno_;

    public AVaziaAFuncao()
    {
        // Constructor
    }

    public AVaziaAFuncao(
        @SuppressWarnings("hiding") TFuncId _funcId_,
        @SuppressWarnings("hiding") PAType _aType_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TLParen _lParen_,
        @SuppressWarnings("hiding") TRParen _rParen_,
        @SuppressWarnings("hiding") PARetorno _aRetorno_)
    {
        // Constructor
        setFuncId(_funcId_);

        setAType(_aType_);

        setId(_id_);

        setLParen(_lParen_);

        setRParen(_rParen_);

        setARetorno(_aRetorno_);

    }

    @Override
    public Object clone()
    {
        return new AVaziaAFuncao(
            cloneNode(this._funcId_),
            cloneNode(this._aType_),
            cloneNode(this._id_),
            cloneNode(this._lParen_),
            cloneNode(this._rParen_),
            cloneNode(this._aRetorno_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVaziaAFuncao(this);
    }

    public TFuncId getFuncId()
    {
        return this._funcId_;
    }

    public void setFuncId(TFuncId node)
    {
        if(this._funcId_ != null)
        {
            this._funcId_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._funcId_ = node;
    }

    public PAType getAType()
    {
        return this._aType_;
    }

    public void setAType(PAType node)
    {
        if(this._aType_ != null)
        {
            this._aType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aType_ = node;
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
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

    public PARetorno getARetorno()
    {
        return this._aRetorno_;
    }

    public void setARetorno(PARetorno node)
    {
        if(this._aRetorno_ != null)
        {
            this._aRetorno_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aRetorno_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._funcId_)
            + toString(this._aType_)
            + toString(this._id_)
            + toString(this._lParen_)
            + toString(this._rParen_)
            + toString(this._aRetorno_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._funcId_ == child)
        {
            this._funcId_ = null;
            return;
        }

        if(this._aType_ == child)
        {
            this._aType_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._lParen_ == child)
        {
            this._lParen_ = null;
            return;
        }

        if(this._rParen_ == child)
        {
            this._rParen_ = null;
            return;
        }

        if(this._aRetorno_ == child)
        {
            this._aRetorno_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._funcId_ == oldChild)
        {
            setFuncId((TFuncId) newChild);
            return;
        }

        if(this._aType_ == oldChild)
        {
            setAType((PAType) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._lParen_ == oldChild)
        {
            setLParen((TLParen) newChild);
            return;
        }

        if(this._rParen_ == oldChild)
        {
            setRParen((TRParen) newChild);
            return;
        }

        if(this._aRetorno_ == oldChild)
        {
            setARetorno((PARetorno) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
