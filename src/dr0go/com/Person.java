package dr0go.com;

abstract class Person {
    private String name;
    private String id;
    private String Email;
    private String qualification;
    private boolean isGraduate;
    private String Gender;
    private String readyForInterview = "";

    public Person(){}
    public String getReadyForInterview() {
        return readyForInterview;
    }

    public void setReadyForInterview(String readyForInterview) {
        this.readyForInterview = readyForInterview;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public boolean isGraduate() {
        return isGraduate;
    }

    public void setGraduate(boolean graduate) {
        isGraduate = graduate;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", Email='" + Email + '\'' +
                ", qualification='" + qualification + '\'' +
                ", isGraduate=" + isGraduate +
                ", readyForInterview=" + readyForInterview +
                ", Gender='" + Gender + '\'' +
                '}';
    }
}
