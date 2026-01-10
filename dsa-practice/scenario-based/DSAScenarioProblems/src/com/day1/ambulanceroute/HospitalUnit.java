package com.day1.ambulanceroute;

class HospitalUnit {
    private String name;
    private boolean available;
    private HospitalUnit next;

    public HospitalUnit(String name, boolean available) {
        this.name = name;
        this.available = available;
        this.next = null;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public HospitalUnit getNext() {
		return next;
	}

	public void setNext(HospitalUnit next) {
		this.next = next;
	}

  
}
