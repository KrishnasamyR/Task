package set;

public class SetRemoverScannerRunner {

	public static void main(String[] args) {

		SetRemoverScanner scanner = new SetRemoverScanner();

		scanner.remover();
		scanner.removerAll();
		scanner.headSetRemover();
		scanner.treeSetRemover();
		scanner.SubSetRemover();
		scanner.pollFirst();
		scanner.pollLast();
	}

}
