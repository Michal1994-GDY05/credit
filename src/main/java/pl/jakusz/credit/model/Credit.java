package pl.jakusz.credit.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Credit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String creditName;
    private BigDecimal value;

    @ManyToOne()
    @JoinColumn(name = "customer_id")
    private Customer customer;


}
