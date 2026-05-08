package in.tech_camp.chat_app.form;

import java.util.List;

import in.tech_camp.chat_app.validation.ValidationPriority1;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RoomForm {
  
  @NotBlank(groups=ValidationPriority1.class)
  private String name;
  private List<Integer> memberIds;
  
}
