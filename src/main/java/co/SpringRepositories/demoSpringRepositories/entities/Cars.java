package co.SpringRepositories.demoSpringRepositories.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table()
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, unique = true)
    private  String modelName;
    @Column(nullable = false)
    private int serialNumber;

    private double currentPrice;

}
