package projeto03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class validacpftest {

	@Test
	void test() {
		ValidaCPF vCPF = new ValidaCPF();
		assertFalse(vCPF.isCPF("111111111"));;	
	}
	
	@Test
	void test2() {
		ValidaCPF vCPF = new ValidaCPF();
		assertFalse(vCPF.isCPF("1"));;
	}
	@Test
	void test3() {
		ValidaCPF vCPF = new ValidaCPF();
		assertFalse(vCPF.isCPF("111xxx111xx"));;
	}	
	@Test
	void test4() {
		ValidaCPF vCPF = new ValidaCPF();
		assertFalse(vCPF.isCPF("111xxx111-xx"));;
	}
	
	@Test
	void test5() {
		ValidaCPF vCPF = new ValidaCPF();
		assertEquals("432.761.198-03",vCPF.imprimeCPF("43276119803"));;
	}
}

