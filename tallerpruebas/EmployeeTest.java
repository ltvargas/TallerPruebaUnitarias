package tallerpruebas;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class EmployeeTest {
	/*
	 * Prueba de metodo cs()
	 * Prueba para Employee de tipo Supervisor, moneda USD y mes impar (Enero)
	 */
	@Test
    public void testCsUSDimpar_supervisor() {
	Employee supervisor=new Employee((float)665,"USD",(float)0.2,EmployeeType.Supervisor);
	LocalDate date = LocalDate.of(2020, 1, 20);
	supervisor.setDate(date);
	float salario=(float)665;
	float bonus=(float)0.2;
	float valueS=(salario + ((float)bonus* 0.35F));
	valueS=valueS + (float)386.0/12*2;
	
	assertEquals(valueS,supervisor.cs());
}
	
	/*
	 * Prueba de metodo cs()
	 * Prueba para Employee de tipo Supervisor, moneda USD y mes par (Febrero)
	 */
	@Test
    public void testCsUSDpar_supervisor() {
	Employee supervisor=new Employee((float)665,"USD",(float)0.2,EmployeeType.Supervisor);
	LocalDate date = LocalDate.of(2020, 2, 20);
	supervisor.setDate(date);
	float salario=(float)665;
	float bonus=(float)0.2;
	float valueS=(salario + ((float)bonus* 0.35F));
	
	assertEquals(valueS,supervisor.cs());
}
	/*
	 * Prueba de metodo cs()
	 * Prueba para Employee de tipo supervisor, moneda diferente a USD y mer impar (Enero);
	 */
	@Test
    public void  testCsotherimpar_supervisor() {
	Employee supervisor=new Employee((float)665,"EURO",(float)0.2,EmployeeType.Supervisor);
	LocalDate date = LocalDate.of(2020, 1, 20);
	supervisor.setDate(date);
	float salario=(float)665;
	salario = (float) (salario * 0.95);
	float bonus=(float)0.2;
	float valueS=(salario + ((float)bonus* 0.35F));
	valueS=valueS + (float)386.0/12*2;
	
	assertEquals(valueS,supervisor.cs());
}
	/*
	 * Prueba de metodo cs()
	 * Prueba para Employee de tipo supervisor, moneda diferente a USD y mer par (febrero);
	 */
	@Test
    public void  testCsotherpar_supervisor() {
	Employee supervisor=new Employee((float)665,"EURO",(float)0.2,EmployeeType.Supervisor);
	LocalDate date = LocalDate.of(2020, 2, 20);
	supervisor.setDate(date);
	float salario=(float)665;
	salario = (float) (salario * 0.95);
	float bonus=(float)0.2;
	float valueS=(salario + ((float)bonus* 0.35F));
	
	assertEquals(valueS,supervisor.cs());
}
	/*
	 * Prueba de metodo CalculateYearBonus()
	 * Prueba para Employee de tipo Supervisor y moneda diferente a USD
	 */
	@Test
	void testYearBonusUSD_supervisor() {
		Employee supervisor=new Employee((float)665,"EURO",(float)0.2,EmployeeType.Supervisor);
		
		float salario=(float)665;
		float rmu =(float) 386.0;
		salario = (float) (salario * 0.95);
		float valueS=salario + rmu * 0.5F;
		assertEquals(valueS,supervisor.CalculateYearBonus());
	}
	
	/*
	 * Prueba de metodo CalculateYearBonus()
	 * Prueba para Employee de tipo supervisor y moneda diferente a USD
	 */
	@Test
	void testYearBonusother_supervisor() {
		Employee supervisor=new Employee((float)665,"EURO",(float)0.2,EmployeeType.Supervisor);
		
		float salario=(float)665;
		float rmu =(float) 386.0;
		salario = (float) (salario * 0.95);
		float valueS=salario + rmu * 0.5F;
		assertEquals(valueS,supervisor.CalculateYearBonus());
	}
	
	/*
	 * Prueba de metodo cs()
	 * Prueba para Employee de tipo Worker, moneda USD y mes impar (Enero)
	 */
	@Test
	void testCsWorkerUSD() {
		Employee emp1 = new Employee((float)400,"USD",(float)0,EmployeeType.Worker);
		LocalDate date = LocalDate.of(2020, 1, 20);
		emp1.setDate(date);
		float salary = 400;
		float valorEsp = salary + (float)386/12*2;
		assertEquals(valorEsp,emp1.cs());
	}
	
	/*
	 * Prueba de metodo cs()
	 * Prueba para Employee de tipo Worker, moneda USD y mes par (Febrero)
	 */
	@Test
	void testCsWorkerUSDPar() {
		Employee emp1 = new Employee((float)400,"USD",(float)0,EmployeeType.Worker);
		LocalDate date = LocalDate.of(2020, 2, 20);
		emp1.setDate(date);
		float salary = 400;
		assertEquals(salary,emp1.cs());
	}
	
	/*
	 * Prueba de metodo cs()
	 * Prueba para Employee de tipo Worker, moneda diferente a USD y mer impar (Enero);
	 */
	@Test
	void testCWorkerEURO() {
		Employee emp2 = new Employee((float)400,"EURO",(float)0,EmployeeType.Worker);
		LocalDate date = LocalDate.of(2020, 1, 20);
		emp2.setDate(date);
		float salary2 = (float)380;
		float valorEsp2 = salary2 + (float)386/12*2;
		assertEquals(valorEsp2,emp2.cs());
	}
	
	/*
	 * Prueba de metodo cs()
	 * Prueba para Employee de tipo Worker, moneda diferente a USD y mer par (Febrero);
	 */
	@Test
	void testCWorkerEUROPar() {
		Employee emp2 = new Employee((float)400,"EURO",(float)0,EmployeeType.Worker);
		LocalDate date = LocalDate.of(2020, 2, 20);
		emp2.setDate(date);
		float salary2 = (float)380;
		assertEquals(salary2,emp2.cs());
	}
	
	/*
	 * Prueba de metodo CalculateYearBonus()
	 * Prueba para Employee de tipo Worker y moneda diferente a USD
	 */
	@Test
	void testCalculateWorkerUSD() {
		Employee emp = new Employee((float)400,"USD",(float)0,EmployeeType.Worker);
		float rmu = (float)386.0;
		assertEquals(rmu,emp.CalculateYearBonus());
	}
	
	/*
	 * Prueba de metodo CalculateYearBonus()
	 * Prueba para Employee de tipo Worker y moneda diferente a USD
	 */
	@Test
	void testCalculateWorkerEURO() {
		Employee emp4 = new Employee((float)400,"EURO",(float)0,EmployeeType.Worker);
		float rmu = (float)386.0;
		assertEquals(rmu,emp4.CalculateYearBonus());
	}
	
	/*
	 * Prueba de metodo cs()
	 * Prueba para Employee de tipo manager, moneda USD y mes impar (Enero)
	 */
	@Test
	void testCsUSDManager() {
		Employee e= new Employee((float)400,"USD",(float)0,EmployeeType.Manager);
		LocalDate date = LocalDate.of(2020, 1, 20);
		e.setDate(date);
		float ValueM = e.getSalary() + (e.getBonusPercentage() * 0.7F);
		float ValorEsperado= ValueM+e.getRmu()/12*2;
		assertEquals(ValorEsperado,e.cs());
	}
	
	/*
	 * Prueba de metodo cs()
	 * Prueba para Employee de tipo manager, moneda USD y mes par (Febrero)
	 */
	@Test
	void testCsUSDManagerPar() {
		Employee e = new Employee((float)400,"USD",(float)0,EmployeeType.Worker);
		LocalDate date = LocalDate.of(2020, 2, 20);
		e.setDate(date);
		float ValueM = e.getSalary() + (e.getBonusPercentage() * 0.7F);
		assertEquals(ValueM,e.cs());
	}
	/*
	 * Prueba de metodo cs()
	 * Prueba para Employee de tipo manager, moneda diferente a USD y mer impar (Enero);
	 */
	@Test
	void testCsEUROManager() {
		Employee e= new Employee((float)400,"EURO",(float)0,EmployeeType.Manager);
		LocalDate date = LocalDate.of(2020, 1, 20);
		e.setDate(date);
		float salary=(float) (e.getSalary()*0.95);
		float ValueM = salary + (e.getBonusPercentage() * 0.7F);
		float ValorEsperado= ValueM+e.getRmu()/12*2;
		assertEquals(ValorEsperado,e.cs());
	}
	
	/*
	 * Prueba de metodo cs()
	 * Prueba para Employee de tipo manager, moneda diferente a USD y mer par (Febrero);
	 */
	@Test
	void testCSEUROManagerPar() {
		Employee e = new Employee((float)400,"EURO",(float)0,EmployeeType.Manager);
		LocalDate date = LocalDate.of(2020, 2, 20);
		e.setDate(date);
		float salary=(float) (e.getSalary()*0.95);
		float ValueM = salary + (e.getBonusPercentage() * 0.7F);
		assertEquals(ValueM ,e.cs());
	}
	
	/*
	 * Prueba de metodo CalculateYearBonus()
	 * Prueba para Employee de tipo manager y moneda diferente a USD
	 */
	@Test
	void testCalculateManagerUSD() {
		Employee e = new Employee((float)400,"USD",(float)0,EmployeeType.Manager);
		float ValueEsperado = e.getSalary() + (e.getRmu() * 1.0F);
		assertEquals(ValueEsperado,e.CalculateYearBonus());
	}
	/*
	 * Prueba de metodo CalculateYearBonus()
	 * Prueba para Employee de tipo Manager y moneda diferente a USD
	 */
	@Test
	void testCalculateManagerEuro() {
		Employee e = new Employee((float)400,"EURO",(float)0,EmployeeType.Manager);
		float salary=(float) (e.getSalary()*0.95);
		float ValueEsperado = salary + (e.getRmu() * 1.0F);
		assertEquals(ValueEsperado,e.CalculateYearBonus());
	}
	
}
