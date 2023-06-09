package lk.ijse.hostelManagementSystem.dto;

import com.jfoenix.controls.JFXButton;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomDTO {

    private String resId;
    private String status;
    private String roomTpeId;
    private String type;
    private String studentId;
    private String name;
    private JFXButton btn;

}
