package class_constructor_getter_setter;

class Calculate
{
	int result = 0;
	void inc1(int n) {
		n = n + 1;
	}
	void inc2(Calculate test){
		 test.result = test.result + 1;
	}	
}
