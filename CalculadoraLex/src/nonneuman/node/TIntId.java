/* This file was generated by SableCC (http://www.sablecc.org/). */

package nonneuman.node;

import nonneuman.analysis.*;

@SuppressWarnings("nls")
public final class TIntId extends Token
{
    public TIntId()
    {
        super.setText("int");
    }

    public TIntId(int line, int pos)
    {
        super.setText("int");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TIntId(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTIntId(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TIntId text.");
    }
}
