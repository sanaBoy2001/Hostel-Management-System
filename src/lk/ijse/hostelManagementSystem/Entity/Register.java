package lk.ijse.hostelManagementSystem.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Register {
    @Id
    private String id;
    private String name;
    private String email;
    private String password;

    public Register(String id, String password) {
        this.id = id;
        this.password = password;
    }
}
