public class Main {
    public static void main(String[] args) {
        String firstName = "Иванов";
        String middleName = "Семён";
        String lastName = "Семёнович";
        String fullName = firstName + " " +  middleName + " " + lastName;
        fullName = fullName.replace("ё","е");
        String fullname1 = fullName.toUpperCase();
        System.out.println("ФИО сотрудника - " + fullname1);

    }
}