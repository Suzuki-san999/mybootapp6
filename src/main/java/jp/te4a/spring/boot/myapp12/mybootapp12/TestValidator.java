package jp.te4a.spring.boot.myapp12.mybootapp12;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class TestValidator implements ConstraintValidator<TestValid, String> {
    String okValue;

    @Override
    public void initialize(TestValid nv) {
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