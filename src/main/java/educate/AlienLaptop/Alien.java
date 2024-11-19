package educate.AlienLaptop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Alien {
	@Id
	private int aid;
	private String aname;
	private int marks;
	@OneToMany(mappedBy="alien", fetch = FetchType.EAGER)
	private Collection<Laptop> laptop = new ArrayList<Laptop>();
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Collection<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(Collection<Laptop> laptop) {
		this.laptop = laptop;
	}
	

}
