package com.hongfox.exer2;

public class EcmDef {
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println(ecm(a, b));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (EcDef e) {
			e.printStackTrace();
		}
	}

	public static int ecm(int a, int b) throws ArithmeticException, EcDef {

		if (a < 0 || b < 0)
			throw new EcDef("不能输入负数！");
		return a / b;

	}

}

class EcDef extends RuntimeException {
	static final long serialVersionUID = -7034897190745766939L;

	public EcDef() {

	}

	public EcDef(String msg) {
		super(msg);
	}
}
