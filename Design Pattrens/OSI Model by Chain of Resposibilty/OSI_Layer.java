public interface OSI_Layer
{
    public void setNextLayer(OSI_Layer nexLayer);
    public void process(Data request);
}