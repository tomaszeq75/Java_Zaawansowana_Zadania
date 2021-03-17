package typy_wyliczeniowe;

public enum TemperatureConvert {
    C_F('C', 'F', temp -> temp * 9d / 5d + 32),
    C_K('C', 'K', temp -> temp + 273.15),
    F_C('F', 'C', temp -> (temp - 32) * 5d / 9d),
    F_K('F', 'K', temp -> (temp + 459.67) * 5d / 9d),
    K_C('K', 'C', temp -> temp - 273.15),
    K_F('K', 'F', temp -> temp * 9d / 5d - 459.67);

    char inUnit, outUnit;
    Converter converter;

    TemperatureConvert(char inUnit, char outUnit, Converter converter) {
        this.inUnit = inUnit;
        this.outUnit = outUnit;
        this.converter = converter;
    }

    public static double convertTemperature(char inUnit, char outUnit, double tempIn) {
        for (TemperatureConvert tk : values()) {
            if (tk.inUnit == inUnit && tk.outUnit == outUnit) {
                return tk.converter.convert(tempIn);
            }
        }
        System.out.println("wrong units");
        return 0;
    }
}
