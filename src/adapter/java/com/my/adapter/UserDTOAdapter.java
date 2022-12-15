package src.adapter.java.com.my.adapter;

import src.adapter.java.com.my.dto.UserDTO;
import src.prototype.java.com.my.db.model.User;

public class UserDTOAdapter {
    UserDTO dto;

    public UserDTOAdapter(User user) {
        dto = new UserDTO();
        dto.setEmail(user.getEmail());
        dto.setUsername(user.getUsername());
    }

    public UserDTO getDto() {
        return dto;
    }
}
