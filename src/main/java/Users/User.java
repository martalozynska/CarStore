package Users;

public class User {
        private String name;
        private String surname;
        private String phone;

        public User(String name, String surname, String phone) {
            this.name = name;
            this.surname = surname;
            this.phone = phone;
        }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }
}
