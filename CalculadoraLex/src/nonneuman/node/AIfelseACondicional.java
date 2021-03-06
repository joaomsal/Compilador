/* This file was generated by SableCC (http://www.sablecc.org/). */

package nonneuman.node;

import nonneuman.analysis.*;

@SuppressWarnings("nls")
public final class AIfelseACondicional extends PACondicional
{
    private PACondicional _aCondicional_;
    private TElseId _elseId_;
    private PAExpr _aExpr_;

    public AIfelseACondicional()
    {
        // Constructor
    }

    public AIfelseACondicional(
        @SuppressWarnings("hiding") PACondicional _aCondicional_,
        @SuppressWarnings("hiding") TElseId _elseId_,
        @SuppressWarnings("hiding") PAExpr _aExpr_)
    {
        // Constructor
        setACondicional(_aCondicional_);

        setElseId(_elseId_);

        setAExpr(_aExpr_);

    }

    @Override
    public Object clone()
    {
        return new AIfelseACondicional(
            cloneNode(this._aCondicional_),
            cloneNode(this._elseId_),
            cloneNode(this._aExpr_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIfelseACondicional(this);
    }

    public PACondicional getACondicional()
    {
        return this._aCondicional_;
    }

    public void setACondicional(PACondicional node)
    {
        if(this._aCondicional_ != null)
        {
            this._aCondicional_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aCondicional_ = node;
    }

    public TElseId getElseId()
    {
        return this._elseId_;
    }

    public void setElseId(TElseId node)
    {
        if(this._elseId_ != null)
        {
            this._elseId_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._elseId_ = node;
    }

    public PAExpr getAExpr()
    {
        return this._aExpr_;
    }

    public void setAExpr(PAExpr node)
    {
        if(this._aExpr_ != null)
        {
            this._aExpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aExpr_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aCondicional_)
            + toString(this._elseId_)
            + toString(this._aExpr_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aCondicional_ == child)
        {
            this._aCondicional_ = null;
            return;
        }

        if(this._elseId_ == child)
        {
            this._elseId_ = null;
            return;
        }

        if(this._aExpr_ == child)
        {
            this._aExpr_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aCondicional_ == oldChild)
        {
            setACondicional((PACondicional) newChild);
            return;
        }

        if(this._elseId_ == oldChild)
        {
            setElseId((TElseId) newChild);
            return;
        }

        if(this._aExpr_ == oldChild)
        {
            setAExpr((PAExpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
