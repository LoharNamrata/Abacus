import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ThreadLocalRandom;

public class Sample {

	public static void main(String[] args) {
		Collection<String> divNo = new ArrayList<>();
		int len = 10;
		for (int i = 1; i >= 1; i++) {
			Integer first = ThreadLocalRandom.current().nextInt(110, 999 + 1);
			Integer second = ThreadLocalRandom.current().nextInt(2, 9 + 1);
			if (first % second == 0) {
				divNo.add(first + "/" + second);
				len--;
				if (len == 1) {
					break;
				}
			} else {
				continue;
			}
		}
		// System.out.println(divNo);
	}
}
