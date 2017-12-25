package com.yan.demo.bean;

public class Dictionary {
    private Integer code;

    private Integer id;

    private String name;

    @Override
	public String toString() {
		return "Dictionary [code=" + code + ", id=" + id + ", name=" + name + "]";
	}

	public Dictionary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dictionary(Integer code, Integer id, String name) {
		super();
		this.code = code;
		this.id = id;
		this.name = name;
	}

	public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}