package home_task6;


import java.util.Arrays;
import java.util.List;

public class CreatePerson {
    public static void main(String[] args) {
        Student student1 = new Student("НТУ", 4, "Cтроительный", "Евгений", "Воробей", "Геодезия");
        Student student2 = new Student("НТУ", 4, "Економика", "Алексей", "Трофимов", "ОЕ");
        Student student3 = new Student("НТУ", 4, "Економика", "Ольга", "Сапкевич", "ОЕ");
        Student student4 = new Student("КПИ", 4, "ИЕЕ", "Олег", "Жопов", "ТВН");
        Student student5 = new Student("КПИ", 4, "ИЕЕ", "Макс", "Перлов", "МатАнализ");
        Student student6 = new Student("НАУ", 4, "Проектировка", "Ирина", "Зубова", "Проектирование");
        Student student7 = new Student("НТУ", 4, "Автомобильный", "Сергей", "Алексев", "ОАС");
        Student student8 = new Student("им.Драгоманова", 3, "Педагогический", "Павел", "Погребняк", "Педагогика");
        Student student9 = new Student("НТУ", 4, "Cтроительный", "Максим", "Соболев", "Геодезия");
        Student student10 = new Student("НТУ", 4, "Економика", "Павел", "Попов", "ОСМ");

        Teacher teacher1 = new Teacher("НТУ", 4, "Cтроительный", "Александр", "Горонов", 3400, "Геодезия");
        Teacher teacher2 = new Teacher("КПИ", 4, "ИЕЕ", "Иван", "Урган", 7400, "ОЕЕ");
        Teacher teacher3 = new Teacher("НАУ", 4, "Проектировка", "Олег", "Старперов", 9500, "Проектировка");
        Teacher teacher4 = new Teacher("им.Драгоманова", 3, "Педагогический", "Павел", "Безус", 3400, "Психология");

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6, student7, student8, student9, student10);
        List<Teacher> teachers = Arrays.asList(teacher1, teacher2, teacher3, teacher4);
    }
}
