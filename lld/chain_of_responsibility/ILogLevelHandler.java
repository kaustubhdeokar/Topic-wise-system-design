package chain_of_responsibility;

public interface ILogLevelHandler {

    void handleRequest(Request request);
    void setNextHandler(ILogLevelHandler handler);

}
