package com.bdogg.pong.model;

/**
 * Created by Brian on 4/8/2014.
 */
public class Player {
	private String name;
	private int numShots;
	private int numMissed;
	private int numHits;
	private int numRims;
	private int numErrors;

	public Player(String name) {
		this.name = name;
		this.numShots = 0;
		this.numHits = 0;
		this.numRims = 0;
		this.numErrors = 0;
		this.numMissed = 0;
	}

	public void shotMissIncrease() {
		numShots++;
		numMissed++;
	}

	public void shotMadeIncrease() {
		numShots++;
		numHits++;
	}

	public void shotErrorIncrease() {
		numShots++;
		numErrors++;
	}

	public void shotRimIncrease() {
		numShots++;
		numRims++;
	}

	// --- Decreasers
	public void shotMissDecrease() {
		if (numShots > 0 && numMissed > 0) {
			numShots--;
			numMissed--;
		}

	}

	public void shotMadeDecrease() {
		if (numShots > 0 && numHits > 0) {
			numShots--;
			numHits--;
		}
	}

	public void shotErrorDecrease() {
		if (numShots > 0 && numErrors > 0) {
			numShots--;
			numErrors--;
		}
	}

	public void shotRimDecrease() {
		if (numShots > 0 && numRims > 0) {
			numShots--;
			numRims--;
		}
	}

	public void clearAllStats() {
		this.numShots = 0;
		this.numHits = 0;
		this.numRims = 0;
		this.numErrors = 0;
		this.numMissed = 0;
	}

	public String getName() {
		return name;
	}

	public int getNumShots() {
		return numShots;
	}

	public int getNumMissed() {
		return numMissed;
	}

	public int getNumHits() {
		return numHits;
	}

	public int getNumRims() {
		return numRims;
	}

	public int getNumErrors() {
		return numErrors;
	}

	public double getHitAverage() {
		return (((double) numHits / (double) numShots));
	}

	public double getHitPercentage() {
		return (((double) numHits / (double) numShots));
	}

	public double getRimAverage() {
		return (((double) numRims / (double) numShots));
	}

	public double getRimPercentage() {
		return (((double) numRims / (double) numShots));

	}

	public double getShotsOnTarget() {
		return (numHits + numRims);
	}

	public double getTargetPercentage() {
		return (((double) getShotsOnTarget() / (double) numShots));
	}

	public double getHitsRating() {
		return (((7 * getHitAverage()) - (3 * (Math.pow(getHitAverage(), 2)))) * 50);
	}

	public double getRimsRating() {
		return (((7 * getRimAverage()) - (3 * (Math.pow(getRimAverage(), 2)))) * 50);
	}

	public double getShooterProficiency() {
		return ((getHitsRating() + getRimsRating()) / 2);
	}

}
