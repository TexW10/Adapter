package AdapterPack;

public interface DataI {
	
	public void setConstrutor(short ano, byte mes, byte dia);
	
	public void setDiaMes(byte dia, byte mes);
	
	public void setDiaAno(byte dia, short ano);
	
	public void setMesAno(byte mes, short ano);
	
	public void setDiaMesAno(byte dia, byte mes, short ano);

	void setDiaMesAno();

}
