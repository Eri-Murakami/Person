package jp.co.diworks.action;

public class Test {
	//インスタンス化
	
	public static void main(String[]args) {
		
		//山田太郎、20
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		
		//木村次郎、18
		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;
			
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);

		//鈴木花子、16
		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
			
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);


		//自身の名前（村上恵梨）、29
		Person eri = new Person();
		eri.name = "村上恵梨";
		eri.age = 29;
			
		System.out.println(eri.name);
		System.out.println(eri.age);
		System.out.println(eri.phoneNumber);
		System.out.println(eri.address);
		
		taro.talk();
		taro.walk();
		taro.run();
		
		//演習⑧
		Person aibo = new Person();
		aibo.name = "aibo";
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		Person asimo = new Person();
		asimo.name = "asimo";
		asimo.talk();
		asimo.walk();
		asimo.run();
		
		Person pepper = new Person();
		pepper.name = "pepper";
		pepper.talk();
		pepper.walk();
		pepper.run();
		
	}

}
