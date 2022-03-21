package org.rim.polyline.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity; 
import javax.persistence.Id; 

@Entity(name="arch_1004901")
public class PolylineEntity implements Serializable{

	  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	private Date date;  
	@Column(name="id_device")
	private Integer deviceId; 
	@Column
	private Integer speed; 
	@Column
	private Integer fuel; 
	@Column
	private String temp; 
	@Column
	private Integer X; 
	@Column
	private Integer Z; 
	@Column
	private Integer Y; 
	@Column 
	private boolean ignition;
	@Column 
	private Integer rpm;
	@Column 
	private double fuel_rate;
	@Column 
	private double tfu;
	@Column 
	private double odo;	  
	@Column 
	private Integer signal;	 
	@Column 
	private Integer heading; 
	@Column 
	private boolean charger;
	@Column 
	private double latitude;	
	@Column 
	private double longitude;
	@Column 
	private boolean state;	
	@Column 
	private Integer tram_id;
	@Column 
	private boolean validity;	
	@Column 
	private Integer temp_engine;
	@Column 
	private float accum_odo;
	@Column 
	private Integer do1;
	@Column 
	private Integer do2;
	@Column 
	private Integer do3;
	@Column 
	private Integer do4;
	@Column 
	private Integer di1;
	@Column 
	private Integer di2;
	@Column 
	private Integer di3;
	@Column 
	private Integer di4;
	@Column 
	private Integer an1;
	@Column 
	private Integer an2;
	@Column 
	private Integer an3;
	@Column 
	private Integer an4;
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}



	public PolylineEntity() {
		super();
		// TODO Auto-generated constructor stub
	}



	public PolylineEntity(Date date, Integer deviceId, Integer speed, Integer fuel, String temp, Integer x, Integer z, Integer y,
			boolean ignition, Integer rpm, double fuel_rate, double tfu, double odo, Integer signal, Integer heading,
			boolean charger, double latitude, double longitude, boolean state, Integer tram_id, boolean validity,
			Integer temp_engine, float accum_odo, Integer do1, Integer do2, Integer do3, Integer do4, Integer di1, Integer di2, Integer di3, Integer di4,
			Integer an1, Integer an2, Integer an3, Integer an4) {
		super();
		this.date = date;
		this.deviceId = deviceId;
		this.speed = speed;
		this.fuel = fuel;
		this.temp = temp;
		X = x;
		Z = z;
		Y = y;
		this.ignition = ignition;
		this.rpm = rpm;
		this.fuel_rate = fuel_rate;
		this.tfu = tfu;
		this.odo = odo; 
		this.signal = signal;
		this.heading = heading;
		this.charger = charger;
		this.latitude = latitude;
		this.longitude = longitude;
		this.state = state;
		this.tram_id = tram_id;
		this.validity = validity;
		this.temp_engine = temp_engine;
		this.accum_odo = accum_odo;
		this.do1 = do1;
		this.do2 = do2;
		this.do3 = do3;
		this.do4 = do4;
		this.di1 = di1;
		this.di2 = di2;
		this.di3 = di3;
		this.di4 = di4;
		this.an1 = an1;
		this.an2 = an2;
		this.an3 = an3;
		this.an4 = an4;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public Integer getdeviceId() {
		return deviceId;
	}



	public void setdeviceId(Integer deviceId) {
		this.deviceId = deviceId;
	}



	public Integer getSpeed() {
		return speed;
	}



	public void setSpeed(Integer speed) {
		this.speed = speed;
	}



	public Integer getFuel() {
		return fuel;
	}



	public void setFuel(Integer fuel) {
		this.fuel = fuel;
	}



	public String getTemp() {
		return temp;
	}



	public void setTemp(String temp) {
		this.temp = temp;
	}



	public Integer getX() {
		return X;
	}



	public void setX(Integer x) {
		X = x;
	}



	public Integer getZ() {
		return Z;
	}



	public void setZ(Integer z) {
		Z = z;
	}



	public Integer getY() {
		return Y;
	}



	public void setY(Integer y) {
		Y = y;
	}



	public boolean isIgnition() {
		return ignition;
	}



	public void setIgnition(boolean ignition) {
		this.ignition = ignition;
	}



	public Integer getRpm() {
		return rpm;
	}



	public void setRpm(Integer rpm) {
		this.rpm = rpm;
	}



	public double getFuel_rate() {
		return fuel_rate;
	}



	public void setFuel_rate(double fuel_rate) {
		this.fuel_rate = fuel_rate;
	}



	public double getTfu() {
		return tfu;
	}



	public void setTfu(double tfu) {
		this.tfu = tfu;
	}



	public double getOdo() {
		return odo;
	}



	public void setOdo(double odo) {
		this.odo = odo;
	}



 


	public Integer getSignal() {
		return signal;
	}



	public void setSignal(Integer signal) {
		this.signal = signal;
	}



	public Integer getHeading() {
		return heading;
	}



	public void setHeading(Integer heading) {
		this.heading = heading;
	}



	public boolean isCharger() {
		return charger;
	}



	public void setCharger(boolean charger) {
		this.charger = charger;
	}



	public double getLatitude() {
		return latitude;
	}



	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}



	public double getLongitude() {
		return longitude;
	}



	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}



	public boolean isState() {
		return state;
	}



	public void setState(boolean state) {
		this.state = state;
	}



	public Integer getTram_id() {
		return tram_id;
	}



	public void setTram_id(Integer tram_id) {
		this.tram_id = tram_id;
	}



	public boolean isValidity() {
		return validity;
	}



	public void setValidity(boolean validity) {
		this.validity = validity;
	}



	public Integer getTemp_engine() {
		return temp_engine;
	}



	public void setTemp_engine(Integer temp_engine) {
		this.temp_engine = temp_engine;
	}



	public float getAccum_odo() {
		return accum_odo;
	}



	public void setAccum_odo(float accum_odo) {
		this.accum_odo = accum_odo;
	}



	public Integer getDo1() {
		return do1;
	}



	public void setDo1(Integer do1) {
		this.do1 = do1;
	}



	public Integer getDo2() {
		return do2;
	}



	public void setDo2(Integer do2) {
		this.do2 = do2;
	}



	public Integer getDo3() {
		return do3;
	}



	public void setDo3(Integer do3) {
		this.do3 = do3;
	}



	public Integer getDo4() {
		return do4;
	}



	public void setDo4(Integer do4) {
		this.do4 = do4;
	}



	public Integer getDi1() {
		return di1;
	}



	public void setDi1(Integer di1) {
		this.di1 = di1;
	}



	public Integer getDi2() {
		return di2;
	}



	public void setDi2(Integer di2) {
		this.di2 = di2;
	}



	public Integer getDi3() {
		return di3;
	}



	public void setDi3(Integer di3) {
		this.di3 = di3;
	}



	public Integer getDi4() {
		return di4;
	}



	public void setDi4(Integer di4) {
		this.di4 = di4;
	}



	public Integer getAn1() {
		return an1;
	}



	public void setAn1(Integer an1) {
		this.an1 = an1;
	}



	public Integer getAn2() {
		return an2;
	}



	public void setAn2(Integer an2) {
		this.an2 = an2;
	}



	public Integer getAn3() {
		return an3;
	}



	public void setAn3(Integer an3) {
		this.an3 = an3;
	}



	public Integer getAn4() {
		return an4;
	}



	public void setAn4(Integer an4) {
		this.an4 = an4;
	}
	     
	
	
 
}
