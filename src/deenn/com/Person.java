package deenn.com;

abstract class Person {
    private String name;
    private int id;
    private String email;
    private String rank;


    public Person(String name, int id, String email, String rank) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }


}
