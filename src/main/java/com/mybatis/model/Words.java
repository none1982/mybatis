package com.mybatis.model;


public class Words {
    private String word;
    private int count;
    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + count;
	result = prime * result + ((word == null) ? 0 : word.hashCode());
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
	Words other = (Words) obj;
	if (count != other.count)
	    return false;
	if (word == null) {
	    if (other.word != null)
		return false;
	} else if (!word.equals(other.word))
	    return false;
	return true;
    }
    @Override
    public String toString() {
	return "Words [word=" + word + ", count=" + count + "]";
    }
    
    
    
}
