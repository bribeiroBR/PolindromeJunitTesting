package br.edu.bribeiro;

public class Polindrome {

	public boolean isPalindromo(String input) {

		String filteredInput = input.toUpperCase().replace(" ", "").replace("-", "").replace(".", "").replace(",", "")
				.replace("!", "").replace("?", "");

		for (int i = 0; i < filteredInput.length(); i++) {
			int backward = filteredInput.length() - i - 1;
			if (filteredInput.charAt(i) != filteredInput.charAt(backward)) {
				return false;
			}
		}

		return true;
	}

}
