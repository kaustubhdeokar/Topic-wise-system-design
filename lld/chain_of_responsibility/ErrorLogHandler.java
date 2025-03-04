package chain_of_responsibility;

public class ErrorLogHandler implements ILogLevelHandler {
    private ILogLevelHandler nextHandler;
    @Override
    public void handleRequest(Request request) {
        if(request.getPriority() == Priority.ERROR)
            System.out.println("Request handled by error handler.");
        else
            System.out.println("Cannot be handled.");
    }

    @Override
    public void setNextHandler(ILogLevelHandler handler) {
        System.out.println("No handler present.");
    }
}
