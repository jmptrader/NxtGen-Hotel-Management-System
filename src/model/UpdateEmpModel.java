package model;

public class UpdateEmpModel {
	
	String eid;
	String efname;
	String elname;
	String ephn;
	String eaddr;
	
	public UpdateEmpModel (String eid, String efname, String elname, String ephn, String eaddr)
	
	{
		
		this.eid=eid;
		this.efname=efname;
		this.elname=elname;
		this.ephn=ephn;
		this.eaddr=eaddr;
			
	}
public UpdateEmpModel()

{
	
}
public String getEid() {
	return eid;
}
public void setEid(String eid) {
	this.eid = eid;
}
public String getEfname() {
	return efname;
}
public void setEfname(String efname) {
	this.efname = efname;
}
public String getElname() {
	return elname;
}
public void setElname(String elname) {
	this.elname = elname;
}
public String getEphn() {
	return ephn;
}
public void setEphn(String ephn) {
	this.ephn = ephn;
}
public String getEaddr() {
	return eaddr;
}
public void setEaddr(String eaddr) {
	this.eaddr = eaddr;
}

}
