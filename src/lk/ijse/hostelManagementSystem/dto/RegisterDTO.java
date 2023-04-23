package lk.ijse.hostelManagementSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RegisterDTO {

    private String id;
    private String name;
    private String email;
    private String password;


    public RegisterDTO(String id, String password) {
        this.id = id;
        this.password = password;
    }
}
