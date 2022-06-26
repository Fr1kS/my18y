public class My15 {
	public static void main(String[] args) {
		Person art = new Person();
		art.setNameAndAge("Артём", 20);
		
		String s1 = "Ника";
		Person nika =  new Person();
		nika.setNameAndAge(s1, 18);
		
		int year1 = art.cal();
		int year2 = nika.cal();
		art.speak();
		nika.speak();
	}
}
class Person{
	String name;
	int age;
	
	void setNameAndAge(String username, int userage) {
		name = username;
		age = userage;
		
	}
	
	int cal() {
		int years = 65-age;
		return years;
	}
	
	void speak() {
		for(int i = 0; i<3; i++) {
		System.out.println("Меня зовут "+ name + "," + " мне "+ age+ " лет");}
	}
	void say() {
		System.out.println("Привет!");
		
	}
}
