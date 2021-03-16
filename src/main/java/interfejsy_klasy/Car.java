package interfejsy_klasy;

public class Car {
    private String mark;
    private CarType type;
    private Engine engine;

    public Car(String mark, CarType type) {
        this.mark = mark;
        this.type = type;
        this.engine = new Engine();
        engine.setEnginType(type);
    }

    class Engine {

        EnginType enginType;

        public void setEnginType(CarType carType) {
            switch (carType) {
                case ECONOMY:
                    enginType = EnginType.DIESEL;
                    break;
                case LUXURY:
                    enginType = EnginType.ELECTRIC;
                    break;
                default:
                    enginType = EnginType.PETROL;
            }
        }
    }

    enum CarType {
        ECONOMY, LUXURY, ORDINARY
    }

    enum EnginType {
        DIESEL, ELECTRIC, PETROL
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", type=" + type +
                ", engine=" + engine.enginType +
                '}';
    }
}

