package chain_of_responsibility;

public class DebugLogHandler implements ILogLevelHandler {
    private ILogLevelHandler nextHandler;
    @Override
    public void handleRequest(Request request) {
        if(request.getPriority() == Priority.DEBUG)
            System.out.println("Request handled by debug handler.");
        else
            nextHandler.handleRequest(request);
    }

    @Override
    public void setNextHandler(ILogLevelHandler handler) {
        this.nextHandler = handler;
    }
}
