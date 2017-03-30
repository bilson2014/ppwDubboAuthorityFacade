package com.paipianwang.pat.facade.right.entity;

import java.io.Serializable;
import java.util.List;

public class PmsTree implements Serializable {

	private static final long serialVersionUID = -5680286811722123188L;
	
	private String id;
	
	private String text;
	
	private String state = "open";// open,closed
	
	private boolean checked = false;
	
	private Object attributes;
	
	private List<PmsTree> children;
	
	private String iconCls;
	
	private String pid;
	
	private String od;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public Object getAttributes() {
		return attributes;
	}

	public void setAttributes(Object attributes) {
		this.attributes = attributes;
	}

	public List<PmsTree> getChildren() {
		return children;
	}

	public void setChildren(List<PmsTree> children) {
		this.children = children;
	}

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getOd() {
		return od;
	}

	public void setOd(String od) {
		this.od = od;
	}

}
