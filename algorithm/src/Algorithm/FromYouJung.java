package algorithm;

public class FromYouJung {



package algorithm;

import java.util.Random;
import java.util.Scanner;


//class Apple {
//	void f1() {
//		System.out.println(10);
//	}
//}

	
		public static void main(String[] args) {
			
	//EX0)  //class 사용법
			
//			//1. 객채이름을 만들어 사용
//			Apple apple = new Apple ();
//			apple.f1();
//			
//			//2.객채이름을 만들지 않고 .를 사용하여 익명객채방법으로 사용
//			(new Apple()).f1();     //있어도되고 없어도된다 Apple의 () 기호
//			new Apple().f1();
//			//printscaner에 사용되는 nextInt의미
			
	//EX1)      //주요 단축키
			
//			System.out.println(10);
//			//syso ctrl space  입력 단축키
//			//ctrl + F11--실행
	//EX2)	    //8개의 표준 타입
			
//			byte    1
//			short   2   +-
//			ch  ar    2   + 만 사용
//			int     4
//			long    8
//			float   4   부동소수
//			double  8   부동소수
//			boolean 1
//			
			//control Alt  복재
			//Alt 방향키 이동
			
	//EX3)	     //int와 Integer의 차이(타입과 클래스)
			
//		int a = 10;       //자바의 표준 타입
//		Integer b = 20;   //Integer 클래스 (대문자)
//		b.byteValue();    //클래스라는 의미
//		//int를 Integer로 사용하는 것이 잘 이용하는것
//		//box=int-->Integer  unboxing=Integer-->int
		

		//EX4)       //3가지 for문의 정석
			
//		//1.                             10번 반복
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
//		//2.                             10번 반복
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
//		//3.                             11번 반복 --> 음수가 필요할떄 주로 사용
//		for (int i = -5; i <= 5; i++) {
//			System.out.println(i);
//		}
//		//3가지 방법을 벗어나는 경우는 없다 --> a는 0 or1로 시작 , a가 0으로 출발하면 < 이고, a가 1출발하면 <= 사용
//		//for + crtl space for문 단축키
		
	//EX5)       //5단을 출력하는
			
//			for (int i = 0; i < 10; i++) {		
//				//int a = 5*i;
//				System.out.println( 5 + " * " + i +" = "+ (5*i) );
//			}	
	
			
//			for (int i = 0; i < 10; i++) {
//				System.out.printf("5 * %d = %d %n", i, i*5);
//			}
//			//println은 자동 줄바꿈이 되지만 printf는 연달아 나온다 그렇기 때문에 \n을 사용하면 줄바꿈이 된다
//			//%d자리에 뒤에들어오는 값을 대치
//			//printf사용하는 습관 들이기! %d;콤마뒤의 숫자값대입  %n;줄바꿈
			
	//EX6)       //1-10까지 더하는
			
//			int sum =0;
//			for (int i = 1; i <= 10; i++) {
//				sum = sum + i;
//				System.out.println(sum);
//			}
//			//누적되고 있는 for문의 단계값을 계속 출력
//			//1-10까지 더해지는 모든 단계값을 도출하는 프로그램
//			
//			int sum1 =0;
//			for (int i = 1; i <= 10; i++) {
//				sum1 = sum1 + i;
//			}
		
//			System.out.println(sum1);
//			//최종적으로 누적된 for문 최종 결과값을 출력
//			//1-10까지 더하는 프로그램
			
	//EX7)       //Scanner scanner 사용법
			
			//ctrl + i 줄맞춤 코드
			//대문자에 에러가 뜬다 = import가 필요하다
			
			//1.
//			Scanner scanner = new Scanner( System.in );      //Systme.in  는 입력을 받기위한 대기함수
//			System.out.println(1);
//			int num = scanner.nextInt();
//			System.out.println(2);               //2의 경우 출력이 되지않는다 -->blocking상태
//			                                     //2출력 위에 nextInt가 입력되기를 기다리기떄문에 입력이 되어야 2의 blocking이 풀린다
//			System.out.println(num);
//			
			 //2. 숫자입력 받겠습니다 정의 (이것으로 사용해라)
//			 int num = (new Scanner( System.in )).nextInt();
//			 //보통 숫자를 입력하세요를 써준다
//			 System.out.println(num);
			
//			//3.
//			 System.out.println((new Scanner( System.in )).nextInt());    //출력함수 속에 입력 함수를 넣을 경우, 입력을 받으려는게 먼저
		

		//EX7-1)		 //입력받은 값의 구구단
//			System.out.println("구구단 단계 입력 =");
//			int num = (new Scanner( System.in )).nextInt();
//			for (int i = 1; i <10; i++) {
//				System.out.println (num +" * "+i+" = "+num*i);
//			}	
			
	//EX8)			//키보드로부터 숫자를 입력받아 받은값까지의 합 EX)10은 입력 10 결과 55
			
//			System.out.println("숫자합의 끝값을 입력하시오: ");
//			int sum = 0;
//			int num = (new Scanner(System.in)).nextInt();
//			System.out.println(num);                                        //확인차로 num의 입력값을 출력 자주확인해주면 좋음
//			for (int i = 1; i <= num; i++) {
//				sum += i;                                                   //(sum =) sum += i 생략가능 컴파일속도가 빠르다
//			}
//			System.out.println(sum);
//			
//			//i++ or ++i 는 같은 말이지만 i++이 더욱 빠르게 출력
//			//i = i + 1 or i+=1 도 같은 코드이다
			
	//EX9)			//
//			int a = 3, b ;
//			b = a++;           //a++대입증가 (무조건 대입이 먼저 일어난 후 1증가)
//			System.out.println(a+" "+b);
//			
//			int c = 3, d;
//			d = ++c;           //++c증가대입 (자기자신을 먼저 증가시키고 난뒤 증가시킨다)
//			System.out.println(c+" "+d);
			
	//EX10)			//1부터 20까지 i가 짝수일때는 호랑이 홀수일때는 코끼리
//			for (int i = 1; i <= 20; i++) {
//				if ( i % 2 == 0 ) {                              //코드입력할때 스페이스로 연산자가 눈에 들어오게끔 입력
//					System.out.println("호랑이");
//				}else {
//					System.out.println("코끼리");
//				}
//				System.out.println(i);
//			}
	//EX10-1)			//if else문장은 반드시 삼항연산이 되는지 확인하자
//			for (int i = 1; i <= 20; i++) {
//				System.out.println(( i % 2 == 0 ) ? "호랑이" : "독수리");  //조건에 만족하면 물음표 답 아니면 콜론 답
//				System.out.println(i);
//			}
		
		
			//EX10-2)			//삼항연산
//			int a = 10;
//			if ( 3 > 2 ) {
//				a = a + 1;
//			}else {
//				a = a - 1;
//			}
//			a = ( 3 > 2 ) ? a + 1 : a - 1;    //실전코드번호에서는 바뀔수만 있으면 삼항연산을 사용한다
			
	//EX11)			//3의 4승을 구하는 프로그램
//			int sum = 1;
//			for (int i = 0; i < 6; i++) {
//				sum = sum * 3;
//				System.out.printf("%d ** %d = %d\n", 3, i+1, sum);       //6번을 돌리고 결과값을 맞춰준다
//			}
			
					//6!계
//			int sum = 1;
//			for (int i = 1; i <= 6; i++) {
//				sum = sum * i;
//				System.out.println(sum);       //6번을 돌리고 결과값을 맞춰준다
//			}
//			System.out.println("-------------------------------");
//			
//			int sum1 = 1;                          //시작값을 정해주는것 0값으로 시작이 아닐경우 무조건 1부터
//			for (int i = 0; i < 6; i++) {          //0값이 나오는결과가 아니면 1부터 시작 (돌리는 횟수의 범위를 입력하는거지 값의 범위가 아님)
//				sum1 = sum1 * (i+1);
//				System.out.println(sum1);       //6번을 돌리고 결과값을 맞춰준다
//			}
			
	//EX12)			//데이터 교환 swap프로그램
//			int a = 10, b = 20;
//			int temp;
//			System.out.println(a + " " + b);
//			temp = a;         //temp는 10이다
//			a = b;            //a는 20
//			b = temp;         //b는 10
//			System.out.println(a + " " + b);
	//EX13)			//Random프로그램
	//1.
//			Random rnd = new Random();
//			 int r = rnd.nextInt(100);      //0-99까지가 랜덤하게 나온다
//			System.out.println(r);
//			
//			System.out.println(rnd.nextInt(100));       //
//			
//			System.out.println("-------------------------------");
//			for (int i = 0; i < 10; i++) {
//				r = rnd.nextInt(100);
//				System.out.println(r);
//			}
//			System.out.println("-------------------------------");     //separate구분하여 사용하는 출력 코드
//			for (int i = 0; i < 10; i++) {
//				System.out.println(rnd.nextInt(100));      //변수를 받지 않고 바로 출력
//			}
			
			
//			for(int i = 0; i <10; i++) {
//				System.out.println(i);
//			}
//			
//			for(int i = 0; i <10; i++) {
//				System.out.print(i + " ");
//			} System.out.println();
//			System.out.println("Tiger");
//
//			for(int i = 0; i <10; i++) {
//				System.out.printf("%03d", i);
//			}System.out.println();
//			System.out.println("Tiger");
			
//			int a = 0, b = 1, c;
//			for(int i = 1; i <=10; i++) {
//				c = a + b;
//				a = b;
//				b = c;
//				
//				System.out.print(c +" ");
//			}System.out.println();

		//랜덤으로 뽑은 숫자 앞자리와 뒷자를 두개 더한 값을 구하시오
		//랜덤으로 뽀은 숫자들의 앞자리만 더한 값과 뒷자리만 더한 값을 구하시오
		// "/10" "%10" 
			
//			int a = 0, b = 0, r;
//			for(int i = 0; i < 6; i++) {
//				Random rnd = new Random();
//				r = rnd.nextInt(100);      
//				
//				int x = r / 10;
//				int y = r % 10;
//				
//				a = a + x;
//				b = b + y;
//				
//				}
//			System.out.println(a + " " + b);

			// 중복 x, 반듯이 5개 숫자를 뽑는다, 배열 x 
//			for(int i = 0; i < 5; i++) {
//				Random rnd = new Random();
//				int r = rnd.nextInt(900)+100;
//				int a = r/100;
//				int b = r%100/10;
//				System.out.println(a + " " + b);
//				int c = r%100%10;
//				System.out.println(a + " " + b + " " + c);
//				if(a == b || b == c || a == c) {
//					System.out.println("호랑이");
//					i = i--;
//					continue; 
//
//				}System.out.println(r);
 * 
//			int count = 0;	//count 대신 city 라고 적기도함.
//			while(true) {
//				Random rnd = new Random();
//				int r = rnd.nextInt(900)+100;
//				int a = r/100;
//				int b = r%100/10;
//				//				System.out.println(a + " " + b);
//				int c = r%100%10;
//				//				System.out.println(a + " " + b + " " + c);
//
//				if(a == b || b == c || a == c) {
//					//					System.out.println("호랑이");
//					continue; 
//				}
//				System.out.println(r);
//				count ++;
//				if (count == 5) {
//					break;
//					
//				}
//				
//		
//		

	//EX14) Integer.MAX_VALUE, Short.MAX_VALUE...(8개 단위 다 쓸수있음)
			
//			System.out.println(Integer.MAX_VALUE);
//			for(int i = 0; i < 10; i++) {
//			Random rnd = new Random();
//			int r = rnd.nextInt(Integer.MAX_VALUE);
//			System.out.println(r);
//			}
			//EX14.1) 랜덤으로 뽑은 값을 한자리씩 더한 값을 구하라
			//내답
//			for(int i = 0; i < 10; i++) {
//				Random rnd = new Random();
//				int r = rnd.nextInt(Integer.MAX_VALUE);
//				System.out.print(r + ":");
//				int a = r/1000000000;
//				//System.out.println(a);
//				int b = r%1000000000/100000000;
//				//System.out.println(b);
//				int c = r%100000000/10000000;
//				//System.out.println(c);
//				int d = r%10000000/1000000;
//				//System.out.println(d);				
//				int e = r%1000000/100000;
//				//System.out.println(e);
//				int f = r%100000/10000;
//				int g = r%10000/1000;
//				int h = r%1000/100;
//				int j = r%100/10;
//				int k = r%10;
//				//System.out.println(k);
//				int sum = a + b + c + d + e + f + g + h + j + k;
//				System.out.println(sum);
//				}
//			//정답
//			Random rnd = new Random();
//			int num = rnd.nextInt(Integer.MAX_VALUE);
//			
//			System.out.println(num);
//			
//			int sum=0;
//			
//			while(true) {
//				
//				int a=num%10;
//				num=num/10;
//				sum+=a;
//				
//				System.out.println(a);
//				
//				if(num==0) {
//					break;
//				}
//			}
//			
//			System.out.printf("각 자리 수의 합은 : %d ",sum);
	//EX15)	
		
//			// 파이널과 클래스의 만남 상속 금지
//			Class Tiger { }
//			Class Lion { } extend Tiger{ }
//
//			final Class Tiger {}
//			Class Lion { } extend Tiger{ }  //에러 발생
//
//			
//			
//		//파이널과 함수의 만남 오버라이딩 금지 
//			Class Tiger { 
//				Void f1( ){ }
//				} 
//			Class Lion { } extend Tiger { 
//			Void f1( ) { } }
//			
//			Class Tiger { 
//				Void f1( ){ }
//				} 
//			final Class Lion { } extend Tiger { 
//			Void f1( ) { } }

			int a = 0;
			int b = 0;
			for (int i = 0; i < 10; i++) {
				Random rnd = new Random();
				int num = rnd.nextInt(2);
			
				if (num == 0) {
					a = a + 1;
					System.out.print(" O ");
				} else {
					b = b + 1;
					System.out.print(" X ");
				} 
			}
			System.out.println();
			System.out.println("O = " + a + " X = " + b);
		
			int a = 0;
			int b = 0;
			for (int i = 0; i < 10; i++) {
				Random rnd = new Random();
				int num = rnd.nextInt(2);
			
				if (num == 0) {
					a = a + 1;
					System.out.print(" O ");
				} else {
					b = b + 1;
					System.out.print(" X ");
				} 
			} 
			System.out.println();
			System.out.println(a + " " + b);
		
			Random rnd = new Random();
			int oContinue1 = 0;
			int oContinue2 = 0;
			int xContinue1 = 0;
			int xContinue2 = 0;
			for (int i = 0; i < 10; i++) {
				int num = rnd.nextInt(2);
				if (num == 0) {
					System.out.print('O');
					oContinue2++;
					xContinue2 = 0;
					if (oContinue2 > oContinue1) {
						oContinue1 = oContinue2;			
					}
				} else {
					System.out.print('X');
					xContinue2++;
					oContinue2 = 0;
					if (xContinue2 > xContinue1) {
						xContinue1 = xContinue2;
					}
				}
			}
			System.out.println();
			System.out.println(oContinue1 + " " + xContinue1);
		
		}			

		//			EX16
			class Apple{
				void f1() {
					System.out.println("호랑이");
				}
				void f2() {
					System.out.println(this);
					}
				int f3() {
					return 100;
				}
				String f4() {
					return "Tiger";
				}
				Apple f5() {
					return this;
				}
				void pretty() {
					System.out.println("pretty");
				}
			}
			Apple a1 = new Apple();
			Apple a2 = new Apple();
			Apple a3 = new Apple();
			
			System.out.println(a3);
//			System.out.println(a2.hashCode());	//10진수 표현
//			System.out.println(Integer.toHexString(a2.hashCode())); 	//민증번호 확인
			a3.f5().f1();
			a3.f1();
			a3.f5().f5().f1();
			a3.f5().pretty();


			class Tiger {
				//생성자 함수(생성자의 이름은 클래스 이름과 동일해야한다)(함수 오버로딩(이름이 같다) 가능)
				//(함수개수 인수개수가 같더라도 타입이 다르면 함수 오버로딩 가능)
				//생성자 함수는 프로그래머가 임의로 호출 불가
				//생성자 함수는 객채가 생성될때 자동 호출
				Tiger() {
					System.out.println("1");
				}
				Tiger(int a) {
					System.out.println("2");
				}
				//Tiger(int a, b){} 요롷게 실수를 많이함. 방금 했었음.
				Tiger(int a, int b){
					System.out.println("3");
				}
				Tiger(int a, String b, Tiger c){
					System.out.println("4");
				}
				Tiger(float a){
					System.out.println("5");
				}
				Tiger(short a){
					System.out.println("6");
				}
				//맴버변수 혹은 필드 
				//맴버함수 혹은 메소드
				//
			}
			Tiger t1 = new Tiger();
			t1.Tiger(); 이렇게는 쓸수없다 왜냐면 호출할수 없거든
			void 는 리턴값을 받아줄떄 
			
			생성자 함수는 리턴 값을 가질수 없다ㅏㅏㅏㅏ
			return10; 이런거 불가능하다고
			Tiger t2 = new Tiger(10);
			Tiger t3 = new Tiger(1, 11);
			Tiger t4 = new Tiger(1, "r", null);
			Tiger t5 = new Tiger(3.14f);
			//float type 같은 경우 3.14f 라고 불러야됨(뒤에 f안빼먹게 주의!)
			Tiger t6 = new Tiger ((short)100);
			//this is called 'type casting'
			System.out.println(7);
			Tiger t7 = new Tiger();
			System.out.println(8);
			int x = 10, y = 20;
			Tiger t8 = new Tiger(x, y);
			String s1 = new String("wheee");
			Tiger t9 = new Tiger(x*y, s1, t8);
			Tiger t10 = new Tiger(x*y, s1, new Tiger());


			class Lion{
				
				int a;
				String s;
				
				Lion() {
					System.out.println(" - ");
				}
				Lion(int a){
					this.a = a;
					System.out.println(" --- ");
				}
				Lion(int a, int b){
					System.out.println(" ----- ");
				}
				Lion(int a, String b, Lion c){
					System.out.println(" ------- ");
				}
				Lion(float a){
					System.out.println(" --------- ");
				}
				Lion(short a){
					System.out.println(" ------------ ");
				}
				
				void setter(int a){
					this.a = a;
				}
				int getter() {
					return this.a;
				}

			}
			Lion l1 = new Lion();
			Lion l2 = new Lion(1);
			Lion l3 = new Lion(1,1);
			Lion l4 = new Lion(1, "s", null);
			Lion l5 = new Lion(3.14f);
			Lion l6 = new Lion((short)3.14);
			
			class Tiger {
				int a;
				String b;
				int c = 20;
				String d = "호랑이";
				String e = new String("코끼리");

				// 필드 초기화가 목적, 맴버 변수 초기화가 목적
				Tiger(){
					a = 100;
					b = "독수리";
					c = 3000;
					d ="앵무새";
					e = "달걀";
				}							// 인수전달이 없는 생성자를 default 생성자라고 한다

			}
			Tiger t1 = new Tiger();
			System.out.println(t1.a);
			System.out.println(t1.b);
			System.out.println(t1.c);
			System.out.println(t1.d);
			System.out.println(t1.e);

			// b = 디폴드 값으로 null이 나온다



			class Tiger{ //클래스(비행기 설계도)
				int x = 100, y = 100; 
				Tiger(){ //생성자
				}
				Tiger(int a, int b){
					x  = a; //x = 필드 a = 인수
					y = b;
				}
				Tiger(int c){
					x = c;
					y = c;
				}
			}
			Tiger t1 = new Tiger(); //객채(비행기 이름 t1)
			System.out.println(t1.x + " " + t1.y);
			Tiger t2 = new Tiger();
			System.out.println(t2.x + " " + t2.y);
			Tiger t3 = new Tiger(200, 300);
			System.out.println(t3.x + " " + t3.y);
			Tiger t4 = new Tiger(500, 600);
			System.out.println(t4.x + " " + t4.y);		
			Tiger t5 = new Tiger(700);
			System.out.println(t5.x + " " + t5.y);	

		}						
		}
		
		}
}
