package com;

class Remote {
	private int remoteId;
	private String remoteName;
	private String remoteModel;

	public int getRemoteId() {
		return remoteId;
	}

	public void setRemoteId(int remoteId) {
		this.remoteId = remoteId;
	}

	public String getRemoteName() {
		return remoteName;
	}

	public void setRemoteName(String remoteName) {
		this.remoteName = remoteName;
	}

	public String getRemoteModel() {
		return remoteModel;
	}

	public void setRemoteModel(String remoteModel) {
		this.remoteModel = remoteModel;
	}

	@Override
	public String toString() {

		return "remote Id: " + remoteId + ", name: " + remoteName + " and Model is " + remoteModel;

	}

}

public class ToStringDemo {
	public static void main(String[] args) {

		Remote r = new Remote();
		r.setRemoteId(10);
		r.setRemoteName("Sony");
		r.setRemoteModel("Bluetooth");
		
		System.out.println("Class Name: "+r.getClass());

		System.out.println(r);

	}

}
