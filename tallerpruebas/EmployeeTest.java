package tallerpruebas;



import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

class EmployeeTest {

	
	@Test
    public void testCsUSD() {
	Employee empleado=new Employee((float)665,"USD",(float)0.2,EmployeeType.Supervisor);
	float salario=(float)665;
	float bonus=(float)0.2;
	float valueS=(salario + ((float)bonus* 0.35F));
	valueS=valueS + (float)386.0/12*2;
	
	assertEquals(valueS,empleado.cs());
}
	@Test
    public void  testCsEURO() {
	Employee empleado=new Employee((float)665,"EURO",(float)0.2,EmployeeType.Supervisor);
	float salario=(float)665;
	salario = (float) (salario * 0.95);
	float bonus=(float)0.2;
	float valueS=(salario + ((float)bonus* 0.35F));
	valueS=valueS + (float)386.0/12*2;
	
	assertEquals(valueS,empleado.cs());
}
	
	@Test
	void testCsWorkerUSD() {
		Employee emp1 = new Employee((float)400,"USD",(float)0,EmployeeType.Worker);
		float salary = 400;
		float valorEsp = salary + (float)386/12*2;
		assertEquals(valorEsp,emp1.cs());
	}
	
	@Test
	void testCWorkerEURO() {
		Employee emp2 = new Employee((float)400,"EURO",(float)0,EmployeeType.Worker);
		float salary2 = (float)380;
		float valorEsp2 = salary2 + (float)386/12*2;
		assertEquals(valorEsp2,emp2.cs());
	}
	
	@Test
	void testCalculateWorkerUSD() {
		Employee emp3 = new Employee((float)400,"USD",(float)0,EmployeeType.Worker);
		float rmu = (float)386.0;
		assertEquals(rmu,emp3.CalculateYearBonus());
	}
	
	@Test
	void testCalculateWorkerEURO() {
		Employee emp4 = new Employee((float)400,"EURO",(float)0,EmployeeType.Worker);
		float rmu = (float)386.0;
		assertEquals(rmu,emp4.CalculateYearBonus());
	}

	@Test
	void testCsUSManager() {
		Employee e= new Employee((float)400,"USD",(float)0,EmployeeType.Manager);
		float ValueM = e.getSalary() + (e.getBonusPercentage() * 0.7F);
		float ValorEsperado= ValueM+e.getRmu()/12*2;
		assertEquals(ValorEsperado,e.cs());
	}

	@Test
	void testCsEUROManager() {
		Employee e= new Employee((float)400,"EURO",(float)0,EmployeeType.Manager);
		float salary=(float) (e.getSalary()*0.95);
		float ValueM = salary + (e.getBonusPercentage() * 0.7F);
		float ValorEsperado= ValueM+e.getRmu()/12*2;
		assertEquals(ValorEsperado,e.cs());
	}
	
	@Test
	void testCalculateManagerUSD() {
		Employee e = new Employee((float)400,"USD",(float)0,EmployeeType.Worker);
		float ValueEsperado = e.getSalary() + (e.getRmu() * 1.0F);
		assertEquals(ValueEsperado,e.CalculateYearBonus());
	}
	
	@Test
	void testCalculateManagerEuro() {
		Employee e = new Employee((float)400,"USD",(float)0,EmployeeType.Worker);
		float salary=(float) (e.getSalary()*0.95);
		float ValueEsperado = salary + (e.getRmu() * 1.0F);
		assertEquals(ValueEsperado,e.CalculateYearBonus());
	}
	
}
