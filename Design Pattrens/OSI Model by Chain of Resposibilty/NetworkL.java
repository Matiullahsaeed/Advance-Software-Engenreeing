public class NetworkL implements OSI_Layer
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
            //Network header is added called packet
            request.addData("+NetworkHeader");
            layers.process(request);
        }
        else
        {
            layers.process(request);
        }
    }

}