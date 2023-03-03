package niteknightt.chess.uciclientmod.model.option;

public class CheckEngineOption extends EngineOption<Boolean> {
    public CheckEngineOption(String name, Boolean defaultValue) {
        super(name, defaultValue);
    }

    @Override
    public String toString() {
        return "CheckEngineOption{" +
                "name='" + name + '\'' +
                ", defaultValue=" + defaultValue +
                '}';
    }
}
