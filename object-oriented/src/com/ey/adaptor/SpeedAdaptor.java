package com.ey.adaptor;

public class SpeedAdaptor implements Nitro{
	
	private Turbo car;
	public SpeedAdaptor(Turbo car) {
		super();
		this.car = car;
	}
	@Override
	public double getSpeedKms() {
		return car.getSpeed()*1.6;
	}
}
