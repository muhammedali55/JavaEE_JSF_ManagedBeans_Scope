package com.muhammet;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean(name="anasayfaBean", eager=true)
@SessionScoped
public class IndexBean {
		private String icerik = "Açılış Sayfası Bean Yönetimi";
		public String getIcerik() {
			return icerik;
		}
		public void setIcerik(String icerik) {
			this.icerik = icerik;
		}
}
