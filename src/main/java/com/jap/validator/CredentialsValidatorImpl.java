package com.jap.validator;

public class CredentialsValidatorImpl {
    public String validateUser(String name, String password) {
        CredentialsValidator credentialsValidator = ((userId, password1) -> {
            if (name.equals("admin") && password.equals("1234")) {
                return "valid user";

            } else {
                return "invalid user";
            }

        });

        return credentialsValidator.validator(name, password);
    }


}