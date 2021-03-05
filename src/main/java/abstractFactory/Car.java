package abstractFactory;

public interface Car {
    Type getType();
    String getModelName();
    Integer getCylindersNum();
    String getProducer();
    Float getEngineVolume();
    Integer getTrunkSize();
}
