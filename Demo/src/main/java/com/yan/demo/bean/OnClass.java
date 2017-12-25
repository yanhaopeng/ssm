package com.yan.demo.bean;

public class OnClass {
    private Integer id;

    private String classname;

    private Integer classtype;

    private Integer classstate;
    private Dictionary dictionary;
    
    public Dictionary getDictionary() {
		return dictionary;
	}

	public void setDictionary(Dictionary dictionary) {
		this.dictionary = dictionary;
	}


	@Override
	public String toString() {
		return "OnClass [id=" + id + ", classname=" + classname + ", classtype=" + classtype + ", classstate="
				+ classstate + ", dictionary=" + dictionary + "]";
	}

	public OnClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OnClass(Integer id, String classname, Integer classtype, Integer classstate) {
		super();
		this.id = id;
		this.classname = classname;
		this.classtype = classtype;
		this.classstate = classstate;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public Integer getClasstype() {
        return classtype;
    }

    public void setClasstype(Integer classtype) {
        this.classtype = classtype;
    }

    public Integer getClassstate() {
        return classstate;
    }

    public void setClassstate(Integer classstate) {
        this.classstate = classstate;
    }
}