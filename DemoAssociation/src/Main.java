//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String [] args){
        Bank bank = new Bank();
        bank.setName("Habib Bank Limited");
        bank.setAddress("Korangi Industrial Area");
        bank.setEmployees(250);

        Employee employee = new Employee();
        employee.setName("REHAN");
        employee.setEmpNo("RE201");
        employee.setSalary(65000);

        bank.setEmployee(employee);

        Copy copy = new Copy();
        copy.setName("Salman Copy");
        copy.setPrice(100);

        Pages pages = new Pages();
        pages.setQuality("Good Quality");
        pages.setTotalPages(50);

        copy.setPages(pages);

        Mobile mobile = new Mobile();
        mobile.setName("Vivo Mobile");
        mobile.setPrice(50000);

        Charger charger = new Charger();
        charger.setName("Vivo Fast Charger");
        charger.setPrice(1900);

        mobile.setCharger(charger);

        TV tv = new TV();
        tv.setName("Samsung");
        tv.setCompany("Samsung Series");
        tv.setPrice(60000);

        Remote remote = new Remote();
        remote.setName("Samsungs Tv remote");
        remote.setPrice(500);

        tv.setRemote(remote);

        Country country = new Country();
        country.setName("Pakistan");
        country.setLocation("South East Asia");
        country.setStates(5);

        Capital capital = new Capital();
        capital.setName("Islamabad");
        capital.setProvince("Punjab");

        country.setCapital(capital);


        System.out.println("----------Bank & Employee-----------------");

        System.out.println("Bank name: "+bank.getName());
        System.out.println("Bank address: "+bank.getAddress());
        System.out.println("Bank total employees: "+bank.getEmployees());
        System.out.println("Name of employee: "+bank.getEmployee().getName());
        System.out.println("Employee no: "+bank.getEmployee().getEmpNo());
        System.out.println("Salary: "+bank.getEmployee().getSalary());

        System.out.println("----------Copy & Pages-----------------");

        System.out.println("Copy Name: "+copy.getName());
        System.out.println("Copy Price: "+copy.getPrice());
        System.out.println("Pages Quality: "+copy.getPages().getQuality());
        System.out.println("Total Pages: "+copy.getPages().getTotalPages());

        System.out.println("----------Mobile & Charger-----------------");

        System.out.println("Mobile Name: "+ mobile.getName());
        System.out.println("Mobile Price: "+mobile.getPrice());
        System.out.println("Charger Name: "+ mobile.getCharger().getName());
        System.out.println("Charger Price: "+ mobile.getCharger().getPrice());

        System.out.println("----------Tv & Remote-----------------");

        System.out.println("Name of Tv: "+tv.getName());
        System.out.println("Company of Tv: "+tv.getCompany());
        System.out.println("Price of Tv: "+tv.getPrice());
        System.out.println("Remote name: "+tv.getRemote().getName());
        System.out.println("Remote price: "+tv.getRemote().getPrice());

        System.out.println("----------Country & Capital-----------------");
        System.out.println("Country: "+country.getName());
        System.out.println("Location: "+country.getLocation());
        System.out.println("States: "+country.getStates());
        System.out.println("Capital: "+country.getCapital().getName());
        System.out.println("State: "+country.getCapital().getProvince());
    }
}