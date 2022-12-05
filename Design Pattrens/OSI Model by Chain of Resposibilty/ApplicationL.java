public class ApplicationL implements OSI_Layer
{
    //Application layer dose proces to proces comunnication
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
            layers.process(request);
        }
        else
        {
            layers.process(request);
        }
    }

}
