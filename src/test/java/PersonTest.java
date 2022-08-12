import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.AssertFalse;
import java.util.Set;

public class PersonTest {


    private static ValidatorFactory validatorFactory= Validation.buildDefaultValidatorFactory();

    private static Validator validator
            =validatorFactory.getValidator();

    @Test
    void firstNameTest(){



        //given
        Person p1= Person.builder()
                .firstName("Alf")
                .lastName("Müller")
                .build();
        //When


        Set<ConstraintViolation<Person>> violations =
                validator.validate(p1);
        System.out.println(p1);

        //Then



    }

}
