/* This file was generated by SableCC (http://www.sablecc.org/). */

package nonneuman.node;

import nonneuman.analysis.*;

@SuppressWarnings("nls")
public final class AVariosAArgsList extends PAArgsList
{
    private PAArgumento _aArgumento_;
    private TComma _comma_;
    private PAArgsList _args_;

    public AVariosAArgsList()
    {
        // Constructor
    }

    public AVariosAArgsList(
        @SuppressWarnings("hiding") PAArgumento _aArgumento_,
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PAArgsList _args_)
    {
        // Constructor
        setAArgumento(_aArgumento_);

        setComma(_comma_);

        setArgs(_args_);

    }

    @Override
    public Object clone()
    {
        return new AVariosAArgsList(
            cloneNode(this._aArgumento_),
            cloneNode(this._comma_),
            cloneNode(this._args_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVariosAArgsList(this);
    }

    public PAArgumento getAArgumento()
    {
        return this._aArgumento_;
    }

    public void setAArgumento(PAArgumento node)
    {
        if(this._aArgumento_ != null)
        {
            this._aArgumento_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aArgumento_ = node;
    }

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
    }

    public PAArgsList getArgs()
    {
        return this._args_;
    }

    public void setArgs(PAArgsList node)
    {
        if(this._args_ != null)
        {
            this._args_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._args_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aArgumento_)
            + toString(this._comma_)
            + toString(this._args_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aArgumento_ == child)
        {
            this._aArgumento_ = null;
            return;
        }

        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._args_ == child)
        {
            this._args_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aArgumento_ == oldChild)
        {
            setAArgumento((PAArgumento) newChild);
            return;
        }

        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._args_ == oldChild)
        {
            setArgs((PAArgsList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
