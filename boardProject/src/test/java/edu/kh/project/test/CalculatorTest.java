//package edu.kh.project.test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import lombok.extern.slf4j.Slf4j;
//
// // @SpringBootTest // Spring컨테이너를 실행함(통합 테스트 방식 -> 실행하는데 느림!)
//@Slf4j
//public class CalculatorTest {
//
//	private Calculator calculator = new Calculator();
//	//@Autowired
//	//private Calculator calculator;
//	// new 연산자 없이 쓰고 싶으면 
//	// 1. Calculator 클래스에 @Component 붙여 줘서 bean으로 관리하게 해야한다. 
//	// 2. CalculatorTest에 @SpringBootTest 붙여 줘서 Spring컨테이너를 실행함
//	// *이 방식은 통합 테스트 방식이라서 실행하는데 느림!)
//	
//	// JUnit5는 기본적으로 테스트 메서드마다 테스트 클래스의 
//	// 인스턴스를 새로 생성
//	// @BeforeAll / @AfterAll : 테스트 클래스내의 모든 테스트가 
//	// 시작되기 전(또는 후)에 딱 한번만 실행되어야 함
//	// -> 만약 static이 아니면, 테스트 클래스 인스턴스가 
//	// 생성되기도 전에 JUnit이 해당 메서드를 호출할 방법이 없음
//	// -> 즉, 클래스가 메모리에 로드될 때 딱 한번만 실행하기 위해
//	// static이 강제되는 것
//	// (static 이 붙은 메서드들은 처음에 어플리케이션이 구동될때 이미 컨테이너에 올라가져 있어 
//	// -> 그때 한번 올려놓고 CalculatorTest라는 클래스가 객체화 되기도 전에 얘들을 가져다 쓸수 있게 만들고 싶은어서
//	// -> 즉, CalculatorTest라는 애가 인스턴사가 됬는지 여부와 관계 없이 시작 전/후에 수행 되어야 되서)
//	@BeforeAll 
//	public static void setUp() {
//		log.info("테스트 시작");
//	}
//	
//	
//	@Test
//	public void testAdd() {
//		assertEquals(5, calculator.add(2, 3));
//	}
//	
//	@Test
//	public void testSubtract() {
//		assertEquals(1, calculator.subtract(3, 2));
//	}
//	
//	@Test
//	public void testMultiply() {
//		assertEquals(6, calculator.multiply(2, 3));
//	}
//	
//	@Test
//	public void testDivide() {
//		assertEquals(2, calculator.divide(6, 3));
//	}
//	
//	//() -> calculator.divide(5, 1) : 람다식 : JS 익명함수와 동일
//	@Test
//	public void testDivideByZero() {
//		assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
//	}
//	
//	
//	@AfterAll
//	public static void testComplete() {
//		log.info("모든 테스트 완료");
//	}
//	
//	
//	
//	
//}
