package AdapterPack;

public class AdapterData implements DataI {
	Data data;
	
	public AdapterData(Data data2) {
	}

	public void AdapterDate(Data data) {
		this.data = data;
	}
	
	public void setConstrutor(short ano, byte mes, byte dia) {
		this.data = new Data((byte) dia, (byte) mes, (short) ano);
	};

	public void setDataMes(byte mes) {
		
		data.setMes(mes);
		
	}
	
	@Override
	public void setDiaMes(byte dia, byte mes) {
		data.setDia(dia);
		data.setMes(mes);
	}
	
	@Override
	public void setMesAno(byte mes, short ano) {
		data.setMes(mes);
		data.setAno(ano);
		
	}
	
	@Override
	public void setDiaAno(byte dia, short ano) {
		data.setDia(dia);
		data.setAno(ano);
	}
	
	@Override
	public void setDiaMesAno(byte dia. byte mes, short ano) {
		data.setDia(dia);
		data.setMes(mes);
		data.setAno(ano);
		
		
	}
	
	@Override
	public String toString() {
		return "AdapterData [ Data=" + data + "]";
	}

	@Override
	public void setDiaMesAno(byte dia, byte mes, short ano) {
		// TODO Auto-generated method stub
		
	}
}
