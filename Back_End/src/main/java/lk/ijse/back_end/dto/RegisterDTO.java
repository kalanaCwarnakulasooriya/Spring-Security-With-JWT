package lk.ijse.back_end.dto;

import lombok.Data;

@Data
public class RegisterDTO {
    private String password;
    private String username;
    private String role; //USER or ADMIN
}
