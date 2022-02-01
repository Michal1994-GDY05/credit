package pl.jakusz.credit.model;

import lombok.*;
import org.hibernate.validator.constraints.pl.PESEL;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @PESEL
    private String pesel;

    @OneToMany(mappedBy = "customer")
    private List<Credit> creditList;


}
