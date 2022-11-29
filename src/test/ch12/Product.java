package test.ch12;

public class Product<K, M> { //타입 파라메터 정의
	//필드
	private K kind;  //Product<Tv, String> product1 = new Product<>();
	private M model;  //K =Tv, M=  String
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	
	

}
