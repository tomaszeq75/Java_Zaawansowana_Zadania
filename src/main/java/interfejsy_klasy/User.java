package interfejsy_klasy;

public class User {
    private String name, surname, login, password;
    private int age;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        boolean isValidated = new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return (input != null && !input.isBlank() && Character.isUpperCase(input.charAt(0)));
            }
        }.validate(name);
        if (isValidated) this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        boolean validated = new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input != null && !input.isBlank() && (input.charAt(0) >= 'A' && input.charAt(0) <= 'Z');
            }
        }.validate(surname);

        if (validated) {
            this.surname = surname;
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        boolean validated = new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.length() >= 10;
            }
        }.validate(login);
        if (validated) this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        boolean validated = new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.contains("!");
            }
        }.validate(password);
        if (validated) this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        boolean validated = new Validator<Integer>() {
            @Override
            public boolean validate(Integer input) {
                return input >= 0 && input <= 150;
            }
        }.validate(age);
        if (validated) this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
