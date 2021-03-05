package abstractFactory;

public interface CarFactory {
    Car createSedan();
    Car createCombi();
    Car createHatchback();
}