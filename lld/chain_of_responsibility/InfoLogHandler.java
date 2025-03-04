package chain_of_responsibility;

public class InfoLogHandler implements ILogLevelHandler {
    private ILogLevelHandler nextHandler;
    @Override
    public void handleRequest(Request request) {
        if(request.getPriority() == Priority.INFO)
            System.out.println("Request handled by info handler.");
        else
            nextHandler.handleRequest(request);
    }

    @Override
    public void setNextHandler(ILogLevelHandler handler) {
        nextHandler = handler;
    }
}
