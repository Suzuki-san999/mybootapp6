package jp.te4a.spring.boot.myapp13.mybootapp13;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class WritterValidator implements ConstraintValidator<Writter, String> {
    String okValue;

    @Override
    public void initialize(Writter nv) {
        this.okValue = nv.ok();
    }

    @Override
    public boolean isValid(String in, ConstraintValidatorContext cxt) {
        if (in == null) {
            return true;
        }
        System.out.println(in.equals(okValue));
        return in.equals(okValue);
    }
}