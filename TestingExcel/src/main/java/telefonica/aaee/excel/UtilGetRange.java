package telefonica.aaee.excel;

public class UtilGetRange {
	
	final private static String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public static String getRange(int fila, int col){
//		System.out.println("fila=" + fila + " : " + "col=" + col );
		if(fila <= 0 | col <= 0) return "$A$1";
		if(col > 0 && col <= letras.length() ) return "$A$1:$" + letras.charAt(col - 1) + "$" + fila;
		if(col > letras.length()){
			int index1 = new Integer(col / letras.length()).intValue();
			int index2 = new Integer(col % letras.length()).intValue();
			return "$A$1:$" + letras.charAt(index1 - 1) + letras.charAt(index2 - 1) + "$" + fila;
		}
		return "";
	}

}
