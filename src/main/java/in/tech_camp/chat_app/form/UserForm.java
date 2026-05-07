package in.tech_camp.chat_app.form;

import org.hibernate.validator.constraints.Length;
import org.springframework.validation.BindingResult;

import in.tech_camp.chat_app.validation.ValidationPriority1;
import in.tech_camp.chat_app.validation.ValidationPriority2;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserForm {
  @NotBlank(groups=ValidationPriority1.class)
  private String name;

  @NotBlank(groups=ValidationPriority1.class)
  @Email(groups=ValidationPriority2.class)
  private String email;

  @NotBlank(groups=ValidationPriority1.class)
  @Length(min=6, max=128, groups=ValidationPriority2.class)
  private String password;

  private String passwordConfirmation;
  public void validatePasswordConfirmation(BindingResult result){
    if (!password.equals(passwordConfirmation)){
      result.rejectValue("passwordConfirmation", "error.user", "Password confirmation doesn't match Password");
    }
  }
}
