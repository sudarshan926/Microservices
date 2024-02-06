package productDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetailsDto {
    @Id
    @GeneratedValue
    private int Pid;

    private long price;

    private String Status;
    
    private int prodId; // Change here
}
