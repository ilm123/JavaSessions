package SuperKeyword;

public class Hospital implements Medical {

	int min_fee = 50;
	
	public void treatment () {		
		System.out.println(min_fee + Medical.min_fee); // with 'super' you cannot access the parent interface var
		covid(); // own overridden method
		this.covid(); // unnessary way to call class's own method
		bloodTest(); // Inherited
	}

	@Override
	public void covid() {
		System.out.println("Hospital -- covid");
		
	}
	
}
