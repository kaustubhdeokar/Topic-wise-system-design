package chain_of_responsibility;

public class Main {
    public static void main(String[] args) {

        ILogLevelHandler infoHandler = new InfoLogHandler();
        ILogLevelHandler debugHandler = new DebugLogHandler();
        ILogLevelHandler errorHandler = new ErrorLogHandler();

        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        Request request1 = new Request(Priority.INFO);
        Request request2 = new Request(Priority.DEBUG);
        Request request3 = new Request(Priority.ERROR);

        infoHandler.handleRequest(request1);
        debugHandler.handleRequest(request2);
        errorHandler.handleRequest(request3);

    }
}
