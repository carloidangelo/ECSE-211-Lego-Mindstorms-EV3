package ca.mcgill.ecse211.canlocator;

import ca.mcgill.ecse211.lab5.ColorClassification;
import ca.mcgill.ecse211.lab5.Navigation;
import ca.mcgill.ecse211.odometer.Odometer;
import ca.mcgill.ecse211.odometer.OdometerExceptions;
import lejos.robotics.SampleProvider;

public class CanLocator {

	private Odometer odo;
	private Navigation navigator;
	private ColorClassification csFront;
	private SampleProvider usDistance;
	private float[] usData;
	
	private static int FORWARD_SPEED = 100;
	private static final double TILE_SIZE = 30.48;
	private static final double CAN_DISTANCE = 27.00;
	
	/**
	*TR is the variable that stores the integer defining the target can color we are looking
	*cX,cY store the changes in x and why distance so that the EV3 knows which ways to turn.
	*i.e if cX is zero but cY is a positive number, then the EV3 is traveling straight
	*up the search zone.
	*/
	
	private int TR;
	private int cX,xY = 0;
	private int count = 0;
	
	public CanLocator(ColorClassification csFront, SampleProvider usDistance, float[] usData, 
			Navigation navigator, int TR) throws OdometerExceptions {
		odo = Odometer.getOdometer();
		this.usDistance = usDistance;
		this.usData = usData;
		this.csFront = csFront;
		this.navigator = navigator;
		this.TR = TR;
	}
	
	public void RunLocator(){
		
		while (true) {
			
		}
		
		//check front
			//if object check color
				//if color correct, signal & go to UR
				//else dodge to next
			//else goToNext()
		
		/*
		switch(TR){
			case 1: //blue can
				
				break;
			case 2: //green can
				
				break;
			case 3: //yellow can
				
				break;
			case 4:	//red can
				
				break;
		}*/
	}	
	
	private boolean checkForCan(){
		
		if (!(count == 0)) {
			
			
			
			count++;
		}
		
		//read sensor and see if can detected in a TILE_SIZE
		//if yes, move towards can
		
	}
	
	private void goToNext() { //navigator.travelTo(LLx,1);
				
		//go forward one tile
		//turn 90 deg right
		
	}
	
	private void borderToUR() {
		
		//
		
	}
	
	private void outsideToUR() {
		
		//
		
	}
	
	private void borderDodge() {
		
		//
		
	}
	
	private void outsideDodge() {
		
		//
		
	}
		
	private int readUSDistance() {
		
		usDistance.fetchSample(usData, 0);
		return (int) (usData[0] * 100);
		
	}
  
}
