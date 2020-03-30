
public class AppLSE {

	public static void main(String[] args) {
		ListaLSE lista1 = new ListaLSE();
		
		lista1.inserirPrimeiro("PP");
		lista1.inserirPrimeiro("PT");
		lista1.inserirPrimeiro("PSDB");
		lista1.inserirPrimeiro("PSL");
		lista1.inserirPenultimo("YYY");
		lista1.inserirPenultimo("ZZZ");
		
		lista1.inserirSegundo("XX");
		
		//System.out.println(lista1.getTamanho()); // 2
		//System.out.println(lista1.getPrimeiro()); // "PSL"		
		//System.out.println(lista1.getSegundo()); //XX
		
//		lista1.imprimirLSE();
//
//		System.out.println(lista1.getTamanho());
//		System.out.println((Math.round(lista1.getTamanho()/2)));
		//lista1.removerSegundo();
		//lista1.removerSegundo();
		lista1.removerTerceiro();
//		lista1.imprimirLSE();
		lista1.getPos();

	}

}
