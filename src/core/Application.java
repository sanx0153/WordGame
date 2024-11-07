package src.core;

public class Application
{
    private Input input;
    private Logic logic;
    private Output output;

    public Application()
    {
        input = new Input();
        logic = new Logic();
        output = new Output();
    }
    public void start()
    {
        System.out.println("App iniciado!");
    }
}