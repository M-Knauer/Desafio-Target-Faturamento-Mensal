package faturamento.main;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Map<String, Double> faturamento = new HashMap<>() {
			private static final long serialVersionUID = 1L;

		{
			put("SP", 67836.43);
			put("RJ", 36678.66);
			put("MG", 29229.88);
			put("ES", 27165.48);
			put("Outros", 19849.53);
		}};
		
		Double total = faturamento.values().stream().mapToDouble(Double::doubleValue).sum();
		
		for (Map.Entry<String, Double> percent : faturamento.entrySet()) {
			System.out.printf("%s: %.1f%%\n", percent.getKey(), (percent.getValue()/total) * 100);
		}
	}
}
