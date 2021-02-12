/* This file was generated by SableCC (http://www.sablecc.org/). */

package nonneuman.node;

import nonneuman.analysis.*;

@SuppressWarnings("nls")
public final class TLambdaId extends Token
{
    public TLambdaId()
    {
        super.setText("lambda");
    }

    public TLambdaId(int line, int pos)
    {
        super.setText("lambda");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TLambdaId(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLambdaId(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TLambdaId text.");
    }
}
