public class Main 
{
    public static void main(String[] args) 
    {
        OSI_Layer app= new ApplicationL();
        OSI_Layer pr= new PresentationL();
        OSI_Layer se= new SessionL();
        OSI_Layer tr= new TransportL();
        OSI_Layer nt= new NetworkL();
        OSI_Layer dt= new DataLinkL();
        OSI_Layer ps= new PhysicalL();

        app.setNextLayer(pr);
        pr.setNextLayer(se);
        se.setNextLayer(tr);
        tr.setNextLayer(nt);
        nt.setNextLayer(dt);
        dt.setNextLayer(ps);
        Data request= new Data("data");
        app.process(request);

    }
}
