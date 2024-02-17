package oops;

import inhreitanceMulti.GrandFather;

public class Father extends GrandFather {
	String name = "KishoreKumar";
	public Father (String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
		public void setName(String name) {
			this.name = name;
	}
}
