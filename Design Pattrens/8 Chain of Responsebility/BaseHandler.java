import java.io.EOFException;

public class BaseHandler implements Handler
{
    protected Handler handler;
    public BaseHandler()
    {
        handler=null;
    }
    
    // public void process(Request request)
    // {
    //     throw new implentationl
    // }

    public void setNextHandler(Handler _handler)
    {
        handler=_handler;
    }
}
