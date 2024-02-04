//64050030 นาย กิติภูมิ หน่อเนื้อ
public class App {
    public static void main(String[] args) {
        Employee ceo = new Employee("Settha","CEO",500000);
        Employee sales_manager = new Employee("Kamphaka","Head Sales",300000);
        Employee marketing_manager = new Employee("UngInk","Head Marketing",300000);
        Employee sales_employer1 = new Employee("Wiroj","Sales",150000);
        Employee sales_employer2 = new Employee("Weeranan","Sales",100000);
        Employee marketing_employer1 = new Employee("Oak","Marketing",200000);
        Employee marketing_employer2 = new Employee("Aem","Marketing",250000);

        ceo.addSubordinate(sales_manager);
        ceo.addSubordinate(marketing_manager);
        sales_manager.addSubordinate(sales_employer1);
        sales_manager.addSubordinate(sales_employer2);
        marketing_manager.addSubordinate(marketing_employer1);
        marketing_manager.addSubordinate(marketing_employer2);

        printAllEmployee(ceo);

    }
    public static void printAllEmployee(Employee ceo) {
        ceo.printSubordinate();         
    }
}
