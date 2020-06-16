package AdapterPack;

public class Data {
   
	 private byte dia;
	 private byte mes;
	 private short ano;
	 
	 public Data(byte dia, byte mes, short ano) {
		 if (validaAno(ano) && validaMes(mes) && validandoDia(dia) == true) {
			 if(fevereiro28(ano, mes, dia) == true || fevereiro29(ano, mes, dia) == true || dia30(mes,dia) == true || dia31(mes,dia) == true) {
				 setAno(ano);
				 setMes(mes);
				 setDia(dia);
				 
			 } else
				 padrao();
			 
		 } else
			   padrao();
		 
	 }
	 
	 private boolean fevereiro29(short ano2, byte mes2, byte dia2) {
		
		return false;
	}

	private void padrao() {
		 setAno((short)1);
		 setDia((byte)1);
		 setMes((byte)1);
		 
	 }
	 
	 public short getAno() {
		 return ano;
	 }
	 
	 public byte getMes() {
		 return mes;
	 }
	 
	 public byte getDia() {
		 return dia;
	 }
	 
	 public void setAno(short ano) {
		 if (validaAno(ano) == true) {
			 this.ano = ano;
		 }
		 
	 }
	 
	 public void setMes(byte mes) {
		 
		 if (validaMes(mes) == true) {
			 this.mes = mes;
		 }
		 
	 }
	 
	 public boolean validaAno(short ano) {
		 if (ano > 0 && ano <= 99990 ) {
			 return true;
		 }
		 return false;
		 
	 }
	 
	 public boolean AnoBissextoChecando(short ano) {
		 
		 if (ano % 4 == 0 && ano % 100 != 0 || ano % 4 == 0 && ano % 400 == 0) {
			 
			 return true;
			 
		 } else
			 return false;
	 }
	 
	 public boolean validaMes(byte mes) {
		 
		 if (mes > 0 && mes <= 12) {
			 return true;
		 }
		 return false;
	 }
	 
	 public boolean validandoDia(byte dia) {
		 if (dia > 0 && dia <= 31) {
			 
			 return true;
		 }
		 return false;
	 }
	 
	 public boolean fevereiro28(short ano, byte mes, byte dia) {
		 if ((mes == 2 ) && (AnoBissextoChecando(ano) == true && dia <= 29)) {
			 return true;
		 }
		 return false;
	 }
	 
	 public boolean dia30(byte mes, byte dia) {
		 if(dia <= 30 && mes == 4 || dia <= 30 && mes == 6 || dia <= 30 && mes == 9 || dia <= 30 && mes == 11) {
			 return true;
		 }
		 return false;
		 
	 }
	 
	 public boolean dia31(byte mes, byte dia) {
		 if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 ||mes == 10 || mes == 12 && dia <= 31) {
			 return true;
		 }
		 return false;
		 
	 }
	 
	 @Override
	 public String toString() {
		 return "data dia =" + dia + ",Mes=" + mes + ",Ano="
 + ano + "";
		 }

	public void setDia(byte dia2) {
		
		
	}
}
