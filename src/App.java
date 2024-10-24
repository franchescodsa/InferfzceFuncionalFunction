import entities.Product;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import util.UpperCaseName;

public class App {

	public static void main(String[] args) throws Exception {
		/*
		 * Problema exemplo Fazerumprogramaque, apartirdeuma listadeprodutos, gereuma
		 * novalistacontendoosnomesdosprodutosemcaixaalta.
		 * 
		 * 
		 * 
		 * Nota sobre a função map
                •A função "map" (não confunda com a estrutura de dados Map) é uma 
                         função que aplica uma função a todos elementos de uma stream.
                •Conversões:
                • Listpara stream: .stream()
                •Streampara List: .collect(Collectors.toList())

		 */

		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		
		names.forEach(System.out::println); 
		
		
	}
}
