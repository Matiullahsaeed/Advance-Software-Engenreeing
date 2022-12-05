public class PhysicalL implements OSI_Layer
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
            //data link header is added called frame
            request.addData("=Bit");
            System.out.println(request.getData());
        }
        else
        {
            layers.process(request);
        }
    }

}
