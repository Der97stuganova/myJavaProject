package learn.andersen.school.lessons.lesson3;

/// 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.///
/// 2. Конструктор класса должен заполнять эти поля при создании объекта.///
/// 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.///
/// 4. Создать массив из 5 сотрудников.///
/// 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.///

public class MainApp2 {
    public static void main(String[] args) {
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Vasileva Oksana Sergeevna", "Legaladvisor", "oksi8@mailbox.com", "890534621", 75000, 34);
        emplArray[1] = new Employee("Kuzmina Anna Alekseevna", "Accountant", "itskyzya@mailbox.com", "893737567", 60000, 41);
        emplArray[2] = new Employee("Kurepina Sofia Anatolevna", "LegalAssistant", "sofa007@mailbox.com", "890300315", 40000, 25);
        emplArray[3] = new Employee("Volkov Denis Konstantinovich", "Secretary", "tambovskiyvolk@mailbox.com", "892712317", 33000, 22);
        emplArray[4] = new Employee("Platonova Svetlana Igorevna", "SeniorAssociateConsultant", "platosha777@mailbox.com", "898712345", 150000, 42);
        for (Employee employee : emplArray)
            if (employee.getAge() > 40)
                System.out.println(employee);
    }
}

class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                getName(), getPosition(), getEmail(), getPhone(), getSalary(), getAge());
    }

}

