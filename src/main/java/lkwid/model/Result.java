package lkwid.model;

import javax.persistence.OneToOne;

public class Result {	
	private long projectId;
	private long voterId;
	private long vote;	
	
	public Result(long voterId, long vote) {
		super();
		this.voterId = voterId;
		this.vote = vote;
	}
	public long getVoterId() {
		return voterId;
	}
	public void setVoterId(long voterId) {
		this.voterId = voterId;
	}
	public long getVote() {
		return vote;
	}
	public void setVote(long vote) {
		this.vote = vote;
	}

}
