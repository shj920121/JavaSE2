package access;
/*
 * 접근 제어자
 * 		변수의 메서드를 접근할 수 있는 범위를 설정하는 옵션
 * 		
 * 		private : 해당 클래스 내에서만 접근이 가능(외부에서 접근X)
 * 		protected : 해당 클래스를 상속 받은 자식 클래스들까지 접근이 가능
 * 		default : 접근 제어자를 사용을 안했을때 자동으로 붙음, 같은 패키지 내에 있는 클래스들까지 접근이 가능
 * 		public : 누구나 접근이 가능
 * 
 * 
 */
public class Employee {
	//사번
	//이름
	//급여
	//부서명
	
	//사원정보 출력하는 메서드
	private String employeeNo;
	private String name;
	private int salary; // 자바는 접근제어자가 없으면 기본 default
	private String department;
	
	//전체필드 초기화하는 생성자
	public Employee(String employeeNo, String name, int salary, String department) {
		super();
		this.employeeNo = employeeNo;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
		//급여를 수정할 수 있게 해주는 메서드
		public void setSalary(int salary) {
				if(salary > 0)
				this.salary = salary;
			}
		//외부로 데이터 반환
		public int getSalary() {
			return salary;
		}
	
		//사원정보 출력하는 메서드
		public void printEmployeeInfo(){ //리턴 타입 결정해야함 , void -> 여기서 출력
			System.out.printf("%s %s %d %s\n", employeeNo,name,salary,department);
		}

		// setter getter 자동으로 만들기
		public String getEmployeeNo() {
			return employeeNo;
		}

		public void setEmployeeNo(String employeeNo) {
			this.employeeNo = employeeNo;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}
		
		
		
}	
	
	

