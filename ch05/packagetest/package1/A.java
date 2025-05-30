package ch05.packagetest.package1;

import ch05.packagetest.package2.B;
import ch05.packagetest.package2.C;

//접근제한자 연습
/*public*/ class A {
	// public을 주석처리하면 다른 패키지에서는 A를 불러올 수 없다.
	// 하지만 default로 접근제한이 되어서 같은 패키지에선 A를 불러 올 수 있다.
	B b;
	C c;
	
	//package2번에 있는 B,C는 public을 사용했기 때문에 다른 패키지인 A에서도
	// B, C를 불러올 수 있다.
	
}
