package org.fl.api.model;

public class Page {
	private Integer id;
	private String name;
	private String picPath;
	private String description;
	private String fulltext;

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPicPath() {
		return picPath;
	}

	public String getDescription() {
		return description;
	}

	public String getFulltext() {
		return fulltext;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setFulltext(String fulltext) {
		this.fulltext = fulltext;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((fulltext == null) ? 0 : fulltext.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((picPath == null) ? 0 : picPath.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Page other = (Page) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (fulltext == null) {
			if (other.fulltext != null)
				return false;
		} else if (!fulltext.equals(other.fulltext))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (picPath == null) {
			if (other.picPath != null)
				return false;
		} else if (!picPath.equals(other.picPath))
			return false;
		return true;
	}

}
