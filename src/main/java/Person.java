import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.*;

@Data
@Builder
public class Person {


@NotNull
@Size(max=256)
@Pattern(regexp ="[a-zA-Z]")
    String firstName;

@NotNull
@Size(max=256)
@Pattern(regexp ="[a-zA-Z]")
String lastName;

@NotNull
@Size(max=22)
@Pattern(regexp ="DE\\d{22}")
String iban;

@NotNull
String dateOfBirth;

@NotNull
String phoneNumber;

@NotNull
@Max(150)
@Positive
    Integer age;

@NotNull
@Size(max=256)
@Pattern(regexp ="[a-zA-Z]")
    String street;

@NotNull
@Positive
    Integer hausNumber;

@NotNull
@Size(max=256)
@Valid
@Pattern(regexp ="[a-zA-Z]")
    String country;

@NotNull
@Size(max=256)
@Pattern(regexp ="[a-zA-Z]")
    String personalMessage;
}
