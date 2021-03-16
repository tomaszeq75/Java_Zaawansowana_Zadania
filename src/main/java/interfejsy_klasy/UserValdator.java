package interfejsy_klasy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValdator {

    public static void validateEmails(String... emails) {

        class Email{
            String email;

            public Email(String email) {
                this.email = email;
                if (email == null || email.isBlank() || !isEmailValid()) {
                    this.email = "unknown";
                }
            }

            private boolean isEmailValid() {
                Pattern pattern = Pattern.compile("(^[A-Z0-9._-]+)@([A-Z0-9.-]+\\.[A-Z]{2,6}$)", Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(email);
                if (!matcher.matches()) {
                    return false;
                }

                System.out.println("User: " + matcher.group(1));
                System.out.println("Domain: " + matcher.group(2));
                return true;
            }

            public String getEmail() {
                return email;
            }
        }

        Email e;

        for (int i = 0; i < emails.length; i++) {
            String email = emails[i];
            e = new Email(email);
            System.out.println("Email: " + e.getEmail());
        }
    }

}
