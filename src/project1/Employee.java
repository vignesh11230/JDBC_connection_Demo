package project1;

public class Employee {

	
		int id;
		String name;
		String gender;
		int salary;
		int age;
		String doj;
		 Employee(int id,String name,String gender,int salary,int age,String doj){
			this.id=id;
			this.name=name;
			this.gender=gender;
			this.salary=salary;
			this.age=age;
			this.doj=doj;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public int getAge() {
			return age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getDoj() {
			return doj;
		}
		public void setDoj(String doj) {
			this.doj = doj;
		}
		public static void insert(Employee ep) {
			// TODO Auto-generated method stub
			
		}
//		public static void delete(Employee ep) {
//			// TODO Auto-generated method stub
//			
//		}
//	

}
