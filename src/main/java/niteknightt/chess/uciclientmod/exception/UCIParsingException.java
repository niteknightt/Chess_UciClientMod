package niteknightt.chess.uciclientmod.exception;

public class UCIParsingException extends UCIRuntimeException {
    public UCIParsingException(String line) {
        super("Cannot parse line: " + line);
    }
}