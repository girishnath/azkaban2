package azkaban.executor;

import java.util.HashMap;
import java.util.Map;

public class ExecutableJobInfo {
	private final int execId;
	private final int projectId;
	private final int version;
	private final String flowId;
	private final String jobId;
	private final long startTime;
	private final long endTime;
	private final Status status;
	private final int attempt;
	
	public ExecutableJobInfo(int execId, int projectId, int version, String flowId, String jobId, long startTime, long endTime, Status status, int attempt) {
		this.execId = execId;
		this.projectId = projectId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.status = status;
		this.version = version;
		this.flowId = flowId;
		this.jobId = jobId;
		this.attempt = attempt;
	}

	public int getProjectId() {
		return projectId;
	}

	public int getExecId() {
		return execId;
	}

	public int getVersion() {
		return version;
	}

	public String getFlowId() {
		return flowId;
	}

	public String getJobId() {
		return jobId;
	}

	public long getStartTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public Status getStatus() {
		return status;
	}
	
	public int getAttempt() {
		return attempt;
	}
	
	public Map<String, Object> toObject() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("execId", execId);
		map.put("version", version);
		map.put("flowId", flowId);
		map.put("jobId", jobId);
		map.put("startTime", startTime);
		map.put("endTime", endTime);
		map.put("status", status.toString());
		map.put("attempt", attempt);
		
		return map;
	}
}