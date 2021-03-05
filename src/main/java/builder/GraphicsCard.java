package builder;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data       // generuje gettery, settery, toString, equals, hashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder        // generuje buildera
public class GraphicsCard {
    private int memoryInMb;
    private String producer;
    private String series;
    private String modelName;
}
