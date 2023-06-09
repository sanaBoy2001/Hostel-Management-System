package lk.ijse.hostelManagementSystem.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Room {
    @Id
    private String roomTpeId;
    private String type;
    private String keyMoney;
    private int qyt;

    public Room(String roomTpeId, String type, String keyMoney, int qyt) {
        this.roomTpeId = roomTpeId;
        this.type = type;
        this.keyMoney = keyMoney;
        this.qyt = qyt;
    }

    @OneToMany(mappedBy = "room" , cascade = CascadeType.ALL)
    private List<Reservation> resList = new ArrayList<>();

}
