/*
* generated by Xtext
*/
package edu.tadp.firewall.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class FirewalllAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("edu/tadp/firewall/parser/antlr/internal/InternalFirewalll.tokens");
	}
}
