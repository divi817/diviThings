package practicaCoche;

public class coche {

		private String marca;
		private String modelo;
		private int anyo;
		private double precio;
		private int potensia;
		
		public coche(String marca, String modelo, int anyo, double precio, int potensia) {
			this.marca = marca;
			this.modelo = modelo;
			this.anyo = anyo;
			this.precio = precio;
			this.potensia = potensia;
		}

		public coche() {
			this.marca = "";
			this.modelo = "";
			this.anyo = 0;
			this.precio = 0;
			this.potensia = 0;
			
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public int getAnyo() {
			return anyo;
		}

		public void setAnyo(int anyo) {
			this.anyo = anyo;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		public int getPotensia() {
			return potensia;
		}

		public void setPotensia(int potensia) {
			this.potensia = potensia;
		}
		
		

}
