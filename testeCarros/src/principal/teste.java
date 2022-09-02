/**
 * 
 */
package principal;

import entidade.Carro;
import entidade.CarroTipoClasseA;
import entidade.TipoDeCarro;

/**
 * @author tati
 *
 */
public class teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Carro carroTeste = new Carro();
		
		TipoDeCarro carroA = new CarroTipoClasseA();
		
		carroTeste.setTipoDeCarro(carroA);
		
		System.out.println(carroTeste.getTipoDeCarro().getMultaPorDia());

	}

}
