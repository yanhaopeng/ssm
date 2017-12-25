package com.yan.demo.bean;

public class Person {
    private Integer id;

    private String name;

    private Integer sex;

    private Integer nation;
    
    private Dictionary dictionary;
    

    @Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", sex=" + sex + ", nation=" + nation + ", dictionary="
				+ dictionary + "]";
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Integer id, String name, Integer sex, Integer nation) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.nation = nation;
	}

	public Dictionary getDictionary() {
		return dictionary;
	}

	public void setDictionary(Dictionary dictionary) {
		this.dictionary = dictionary;
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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getNation() {
        return nation;
    }

    public void setNation(Integer nation) {
        this.nation = nation;
    }
}