public class Test 
{
    public static void main(String[] args) 
    {
        Duck duck = new MallarDuck();

        Turkey turkey = new WildTurkey();
        
        Duck trDuck = new TurkeyAdpter(turkey);

        System.out.println("The Turkey says....");
        turkey.gobble();
        turkey.fly();
    } 

}
