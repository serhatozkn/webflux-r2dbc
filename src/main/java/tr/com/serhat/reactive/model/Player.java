package tr.com.serhat.reactive.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 * @author serhat.ozkan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("player")
public
class Player {
    @Id
    Integer ID;
    String name;
    Integer age;
}