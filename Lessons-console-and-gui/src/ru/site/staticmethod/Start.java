// Урок от Java Blogger 007

package ru.site.staticmethod;

public class Start {

	public static void main(String[] args) {
		
		Options on = new Options ();
		on.weigth();
		on.heigth();
		
		// Выше 2 метода вызываются через экземпляр, а ниже 1 метод вызывается через статический метод. В Options прописано к year static, поэтому не нужно создавать для статического метода экземпляр, а можно напрямую вызвать статический метод
		Options.year();
		
	}

}
