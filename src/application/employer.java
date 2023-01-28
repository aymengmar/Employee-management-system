package application;

public class employer {
private int id;
private String fname;
private String  name;
private float salary;
private int age ;
private String departement;
private String adress;
private String date_of_birth;
private String gebdes;
private String education;
private String experence;
private String Contrat_started;
private String Contrat_end;
private String nationality;
private String mather_langage;
private String other_langage;


public employer() {
	super();
	// TODO Auto-generated constructor stub
}


public employer(int id, String fname, String name, float salary, int age, String departement, String adress,
		String date_of_birth) {
	super();
	this.id = id;
	this.fname = fname;
	this.name = name;
	this.salary = salary;
	this.age = age;
	this.departement = departement;
	this.adress = adress;
	this.date_of_birth = date_of_birth;
}


public employer(int id, String fname, String name, float salary, int age, String departement, String adress,
		String date_of_birth, String gebdes, String education, String experence, String contrat_started,
		String contrat_end, String nationality, String mather_langage, String other_langage) {
	super();
	this.id = id;
	this.fname = fname;
	this.name = name;
	this.salary = salary;
	this.age = age;
	this.departement = departement;
	this.adress = adress;
	this.date_of_birth = date_of_birth;
	this.gebdes = gebdes;
	this.education = education;
	this.experence = experence;
	Contrat_started = contrat_started;
	Contrat_end = contrat_end;
	this.nationality = nationality;
	this.mather_langage = mather_langage;
	this.other_langage = other_langage;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getFname() {
	return fname;
}


public void setFname(String fname) {
	this.fname = fname;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public float getSalary() {
	return salary;
}


public void setSalary(float salary) {
	this.salary = salary;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public String getDepartement() {
	return departement;
}


public void setDepartement(String departement) {
	this.departement = departement;
}


public String getAdress() {
	return adress;
}


public void setAdress(String adress) {
	this.adress = adress;
}


public String getDate_of_birth() {
	return date_of_birth;
}


public void setDate_of_birth(String date_of_birth) {
	this.date_of_birth = date_of_birth;
}


public String getGebdes() {
	return gebdes;
}


public void setGebdes(String gebdes) {
	this.gebdes = gebdes;
}


public String getEducation() {
	return education;
}


public void setEducation(String education) {
	this.education = education;
}


public String getExperence() {
	return experence;
}


public void setExperence(String experence) {
	this.experence = experence;
}


public String getContrat_started() {
	return Contrat_started;
}


public void setContrat_started(String contrat_started) {
	Contrat_started = contrat_started;
}


public String getContrat_end() {
	return Contrat_end;
}


public void setContrat_end(String contrat_end) {
	Contrat_end = contrat_end;
}


public String getNationality() {
	return nationality;
}


public void setNationality(String nationality) {
	this.nationality = nationality;
}


public String getMather_langage() {
	return mather_langage;
}


public void setMather_langage(String mather_langage) {
	this.mather_langage = mather_langage;
}


public String getOther_langage() {
	return other_langage;
}


public void setOther_langage(String other_langage) {
	this.other_langage = other_langage;
}


@Override
public String toString() {
	return "employer [id=" + id + ", fname=" + fname + ", name=" + name + ", salary=" + salary + ", age=" + age
			+ ", departement=" + departement + ", adress=" + adress + ", date_of_birth=" + date_of_birth + ", gebdes="
			+ gebdes + ", education=" + education + ", experence=" + experence + ", Contrat_started=" + Contrat_started
			+ ", Contrat_end=" + Contrat_end + ", nationality=" + nationality + ", mather_langage=" + mather_langage
			+ ", other_langage=" + other_langage + "]";
}





}
