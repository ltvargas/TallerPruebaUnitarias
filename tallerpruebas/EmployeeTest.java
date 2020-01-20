package tallerpruebas;

import static org.junit.jupiter.api.Assertions.*;

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

}
