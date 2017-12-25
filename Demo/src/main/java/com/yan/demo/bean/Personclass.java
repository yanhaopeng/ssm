package com.yan.demo.bean;

public class Personclass {
    private Integer id;

    private Integer personid;

    private Integer classid;

    private Integer score;
    
    private Person person;
    
    private OnClass onClass;
    
    private Dictionary dictionary;;
    
    

    @Override
	public String toString() {
		return "Personclass [id=" + id + ", personid=" + personid + ", classid=" + classid + ", score=" + score
				+ ", person=" + person + ", onClass=" + onClass + ", dictionary=" + dictionary + "]";
	}

	public Personclass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personclass(Integer id, Integer personid, Integer classid, Integer score) {
		super();
		this.id = id;
		this.personid = personid;
		this.classid = classid;
		this.score = score;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public OnClass getOnClass() {
		return onClass;
	}

	public void setOnClass(OnClass onClass) {
		this.onClass = onClass;
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

    public Integer getPersonid() {
        return personid;
    }

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}