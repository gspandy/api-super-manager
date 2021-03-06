package com.an9elkiss.api.manager.model;

import java.util.Date;

public class Task {

	/** 任务id */
	private Integer id;
	/** 任务code */
	private String code;
	/** 任务title */
	private String title;
	/** 父任务id */
	private Integer parentId;
	/** 是否父任务 */
	private Integer isParent;
	/** 项目名 */
	private String project;
	/** 标签 */
	private String tags;
	/** 描述 */
	private String description;
	/** 计划贡献值 */
	private Integer planScore;
	/** 计划状态 */
	private String planStatus;
	/** 计划时间 */
	private Integer planHours;

	private Integer status;
	private String createBy;
	private String updateBy;
	private String createTime;
	private String updateTime;
	
	/** 折算小时数 */
	private Integer percentHours;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getIsParent() {
		return isParent;
	}

	public void setIsParent(Integer isParent) {
		this.isParent = isParent;
	}

	

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPlanScore() {
		return planScore;
	}

	public void setPlanScore(Integer planScore) {
		this.planScore = planScore;
	}

	public String getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public Integer getPlanHours() {
		return planHours;
	}

	public void setPlanHours(Integer planHours) {
		this.planHours = planHours;
	}

	

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public Integer getPercentHours() {
		return percentHours;
	}
	public void setPercentHours(Integer percentHours) {
		this.percentHours = percentHours;
	}
	
}
