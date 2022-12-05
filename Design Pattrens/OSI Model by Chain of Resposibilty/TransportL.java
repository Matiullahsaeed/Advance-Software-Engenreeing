public class TransportL implements OSI_Layer
{
    
    private OSI_Layer layers;
    @Override
    public void setNextLayer(OSI_Layer nLayer)
    {
        this.layers=nLayer;
    }
    @Override
    public void process(Data request)
    {
        if(request.getData() != null)
        {
            //transport header is added called Segment
            request.addData("+TransportHeader");
            layers.process(request);
        }
        else
        {
            layers.process(request);
        }
    }

}
