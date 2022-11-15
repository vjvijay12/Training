package com.hospital.patient;

public class Testclinic {
	public static void main(String args[]) {
	clinic Bs1=new clinic();
	Bs1.noOfRooms=200;
	Bs1.hFacility="ctscan";
	Bs1.hospitalAddress="ayanapakkam.chennai";
	Bs1.scaningRoom=true;
	Bs1.icu=02;
	Bs1.mbNumber=9876543233l;
	System.out.println(Bs1.noOfRooms);
	System.out.println(Bs1.hFacility);
	System.out.println(Bs1.hospitalAddress);
	System.out.println(Bs1.scaningRoom);
	System.out.println(Bs1.icu);
	System.out.println(Bs1.mbNumber);
	}
}