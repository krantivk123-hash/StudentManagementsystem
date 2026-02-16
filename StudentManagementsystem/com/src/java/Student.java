class Student {

    private String studentId;
    private String name;
    private int age;
    private double grade;
    private String contact;

    public Student(String studentId, String name, int age, double grade, String contact) {
        this.studentId = studentId;
        setName(name);
        setAge(age);
        setGrade(grade);
        this.contact = contact;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public String getContact() {
        return contact;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Name cannot be empty");
        this.name = name.trim();
    }

    public void setAge(int age) {
        if (age <= 0)
            throw new IllegalArgumentException("Age must be positive");
        this.age = age;
    }

    public void setGrade(double grade) {
        if (grade < 0 || grade > 100)
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        this.grade = grade;

    public void setContact(String contact) {
        this.contact = contact;
    }
}