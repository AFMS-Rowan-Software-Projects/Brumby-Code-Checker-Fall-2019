package parser;

import sablecc.node.Token;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Holds tokens from each method within a file
 */
public class TokenizedMethod {
	private String fileLocation;
	private String secondFileLocation;
	private ArrayList<Token> tokens;
	private boolean hasDuplicate;
	private int duplicates = 1;
	private double similarityPercent;

	/**
	 * 
	 * @param filePath
	 * @param tokenlist
	 */
	public TokenizedMethod(String filePath, ArrayList<Token> tokenlist) {
		fileLocation = filePath;
		tokens = tokenlist;
		hasDuplicate = false;
	}

	/**
	 * To be stored as a duplicate found from the methods compared and the
	 * percentage of similarity
	 * 
	 * @param filePath1
	 * @param filepath2
	 * @param percent
	 */
	public TokenizedMethod(String filePath1, String filepath2, double percent) {
		fileLocation = filePath1;
		secondFileLocation = filepath2;
		similarityPercent = percent;
	}

	/**
	 * 
	 * @return lines - the number of lines that are duplicate from multiple files
	 *         within a directory
	 */
	public int linesAffected() {
		int lines;
		lines = tokens.get(tokens.size() - 1).getLine() - tokens.get(0).getLine();

		if (duplicates > 0) {
			return lines * duplicates;
		} else {
			return lines;
		}
	}

	public ArrayList<Token> getTokens() {
		return tokens;
	}

	public String getLocation() {
		return fileLocation;
	}

	public double getPercentage() {
		return similarityPercent;
	}

	public boolean hasDuplicate() {
		if (hasDuplicate)
			duplicates++;

		return hasDuplicate;
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		return fileLocation + "\n" + secondFileLocation + "\n----------> " + df.format(similarityPercent) + "%";
	}
}
