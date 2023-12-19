import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeTable {
    private List<Map<String, String>> table;

    public EmployeeTable() {
        table = new ArrayList<>();
    }

    public void addRow(String name, String age, String position, String salary) {
        Map<String, String> row = new HashMap<>();
        row.put("Имя", name);
        row.put("Возраст", age);
        row.put("Должность", position);
        row.put("Зарплата", salary);
        table.add(row);
    }

    public List<Map<String, String>> getTable() {
        return table;
    }

    public static void main(String[] args) {
        EmployeeTable employeeTable = new EmployeeTable();
        employeeTable.addRow("Кирилл", "26", "Middle java dev", "150000 руб");
        employeeTable.addRow("Виталий", "28", "Senior java automation QA", "2000$");
        employeeTable.addRow("Александр", "31", "junior functional tester", "50000 руб");
        employeeTable.addRow("Дементий", "35", "dev-ops", "1500$");
        
        System.out.println("Имена сотрудников младше 30:");
        List<Map<String, String>> myTable = employeeTable.getTable();
        for (Map<String, String> row : myTable) {
            int age = Integer.parseInt(row.get("Возраст"));
            if (age < 30) {
                String name = row.get("Имя");
                System.out.println(name);
            }
        }
        
        // Вывод имен сотрудников, получающих зарплату в рублях
        System.out.println("\nИмена сотрудников, получающих зарплату в рублях:");
        for (Map<String, String> row : myTable) {
            String salary = row.get("Зарплата");
            if (salary.endsWith("руб")) {
                String name = row.get("Имя");
                System.out.println(name);
            }
        }
        
        // Расчет среднего возраста всех сотрудников
        double sumAge = 0;
        int count = 0;
        for (Map<String, String> row : myTable) {
            int age = Integer.parseInt(row.get("Возраст"));
            sumAge += age;
            count++;
        }
        double averageAge = sumAge / count;
        System.out.println("\nСредний возраст всех сотрудников: " + averageAge);
    }
}
