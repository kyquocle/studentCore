public class Students {

    private String id;
    private String name;
    private String dateOfBirth;
    private String phone;
    private String email;
    private double grade;
    private String title;

    public Students() {

    }

    public Students(String id, String name, String dateOfBirth, String phone, String email, double grade, String title) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.email = email;
        this.grade = grade;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Students: " +
                "id = '" + id + '\'' +
                ", name = '" + name + '\'' +
                ", dateOfBirth = '" + dateOfBirth + '\'' +
                ", phone = '" + phone + '\'' +
                ", email = '" + email + '\'' +
                ", grade = " + grade +
                ", title = '" + title + '\'';
    }
}
