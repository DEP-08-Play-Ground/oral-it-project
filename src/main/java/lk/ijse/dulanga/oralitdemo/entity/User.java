package lk.ijse.dulanga.oralitdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User implements SuperEntity {
    @Id
    private String email;
    @Column(nullable = false, unique = true)
    private String mobileNO;
}
