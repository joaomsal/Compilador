/* This file was generated by SableCC (http://www.sablecc.org/). */

package nonneuman.node;

import nonneuman.analysis.*;

@SuppressWarnings("nls")
public final class AAMain extends PAMain
{
    private TEntryPoint _entryPoint_;
    private PABloco _aBloco_;

    public AAMain()
    {
        // Constructor
    }

    public AAMain(
        @SuppressWarnings("hiding") TEntryPoint _entryPoint_,
        @SuppressWarnings("hiding") PABloco _aBloco_)
    {
        // Constructor
        setEntryPoint(_entryPoint_);

        setABloco(_aBloco_);

    }

    @Override
    public Object clone()
    {
        return new AAMain(
            cloneNode(this._entryPoint_),
            cloneNode(this._aBloco_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAMain(this);
    }

    public TEntryPoint getEntryPoint()
    {
        return this._entryPoint_;
    }

    public void setEntryPoint(TEntryPoint node)
    {
        if(this._entryPoint_ != null)
        {
            this._entryPoint_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._entryPoint_ = node;
    }

    public PABloco getABloco()
    {
        return this._aBloco_;
    }

    public void setABloco(PABloco node)
    {
        if(this._aBloco_ != null)
        {
            this._aBloco_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aBloco_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._entryPoint_)
            + toString(this._aBloco_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._entryPoint_ == child)
        {
            this._entryPoint_ = null;
            return;
        }

        if(this._aBloco_ == child)
        {
            this._aBloco_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._entryPoint_ == oldChild)
        {
            setEntryPoint((TEntryPoint) newChild);
            return;
        }

        if(this._aBloco_ == oldChild)
        {
            setABloco((PABloco) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}