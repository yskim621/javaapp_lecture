package java.lang;

import java.lang.reflect.Method;

public class SampleAnnotationTest {
	public static void main(String[] args) {
		//Service 클래스로부터 메소드 정보를 얻음
		Method[] declaredMethods = SampleService.class.getDeclaredMethods();
		
		//Method 객체를 하나씩 처리
		for(Method method : declaredMethods) {
			//PrintAnnotation이 적용되었는지 확인
			if(method.isAnnotationPresent(SampleAnnotation.class)) {
				//PrintAnnotation 객체 얻기
				SampleAnnotation sampleAnnotation = method.getAnnotation(SampleAnnotation.class);
				
				//메소드 이름 출력
				System.out.println("[" + method.getName() + "] ");
				//구분선 출력
				for(int i=0; i<sampleAnnotation.number(); i++) {
					System.out.print(sampleAnnotation.value());
				}		
				System.out.println();
				
				try {
					//메소드 호출
					method.invoke(new SampleService());
				} catch (Exception e) {}
				System.out.println();
			}
		}
	}
}
