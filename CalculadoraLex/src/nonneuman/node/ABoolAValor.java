/* This file was generated by SableCC (http://www.sablecc.org/). */

package nonneuman.node;

import nonneuman.analysis.*;

@SuppressWarnings("nls")
public final class ABoolAValor extends PAValor
{
    private TBoolType _boolType_;

    public ABoolAValor()
    {
        // Constructor
    }

    public ABoolAValor(
        @SuppressWarnings("hiding") TBoolType _boolType_)
    {
        // Constructor
        setBoolType(_boolType_);

    }

    @Override
    public Object clone()
    {
        return new ABoolAValor(
            cloneNode(this._boolType_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABoolAValor(this);
    }

    public TBoolType getBoolType()
    {
        return this._boolType_;
    }

    public void setBoolType(TBoolType node)
    {
        if(this._boolType_ != null)
        {
            this._boolType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._boolType_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._boolType_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._boolType_ == child)
        {
            this._boolType_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._boolType_ == oldChild)
        {
            setBoolType((TBoolType) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
