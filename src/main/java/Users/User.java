package Users;

import Observer.Observer;

public class User implements Observer {
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


    @Override
    public void update() {
        System.out.println(this.name + ", there's new update.");
    }
}
