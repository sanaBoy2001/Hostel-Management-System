package lk.ijse.hostelManagementSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentDTO {

    private String studentId;
    private String name;
    private String address;
    private String contactNo;
    private LocalDate dob;
    private String gender;


    public StudentDTO(String text) {
    }
}
