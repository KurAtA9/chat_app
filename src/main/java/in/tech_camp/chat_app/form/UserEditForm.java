package in.tech_camp.chat_app.form;

import in.tech_camp.chat_app.validation.ValidationPriority1;
import in.tech_camp.chat_app.validation.ValidationPriority2;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserEditForm {
  private Integer id;

  @NotBlank(groups=ValidationPriority1.class)
  private String name;

  @NotBlank(groups=ValidationPriority1.class)
  @Email(groups=ValidationPriority2.class)
  private String email;
}
