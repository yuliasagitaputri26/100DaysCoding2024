package Day10;
 
import java.math.BigDecimal;

public class Hari30 {

    public static void main(String[] args) {

        BigDecimal yulia = new BigDecimal("24.0");
        System.out.println("Nilai BigDecimal adalah = " + yulia);
        
        yulia = yulia.add(new BigDecimal("12.6"));//mengubah nilai 
        System.out.println("Nilai yang telah diubah : " + yulia);

    }

}
